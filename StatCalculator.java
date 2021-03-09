/**
 * Model for the calculator
 */
public class StatCalculator {
    protected static final int POW = 0, CON = 1, SPD = 2, FLD = 3,
            ARM = 4, T1 = 5, T2 = 6;

    /**
     * Chooses between regular and pitcher stats
     * @param isPitcher checks to see if the the player is a pitcher
     * @param stats are the player's stats in the following order:
     *        Non-Pitcher:
     *              [hits, doubles, triples, home runs, at bats, strikeouts,  (length = 14)
     *               stolen bases, caught steeling, runs, putouts, assists,
     *               errors, rbi, games played, ...]
     *        Pitcher:
     *              [hits, doubles, triples, home runs, at bats, strikeouts,  (length = 14)
     *               stolen bases, caught steeling, runs, putouts, assists,
     *               errors, rbi, games played, ...]
     * @param weights is an array of stat modifiers. The higher the weight, the better the stats (default = 1)
     *                This array is in the following order: [POW, CON, SPD, FLD, ARM]  (length = 5)
     * @return a String[] containing the player's stats in the following
     *         order: [POW, CON, SPD, FLD, ARM, T1, T2]  (length = 7)
     *         (note that non-pitchers will have null instead of ARM)
     */
    public static String[] calculate(boolean isPitcher, int stats[], double weights[]) {
        // Checks to see if 'Pitcher' is selected
        if (!isPitcher)
            return calculateStats(stats[0], stats[1], stats[2], stats[3], stats[4], stats[5],
                    stats[6], stats[7], stats[8], stats[9], stats[10], stats[11], stats[12], stats[13], weights);
        else
            return calculatePitcherStats(weights);
    } //@todo

    /**
     * Calculates a player's stats based on the inputs in the view (for a non-pitcher)
     * @param hits is the player's total number of hits
     * @param d is the player's total number of doubles
     * @param t is the player's total number of triples
     * @param hr is the player's total number of home runs
     * @param ab is the player's total number of at bats
     * @param k is the player's total number of strikeouts
     * @param sb is the player's total number of stolen bases
     * @param cs is the player's total number of times caught steeling
     * @param r is the player's total number of runs
     * @param po is the player's total number of putouts
     * @param a is the player's total number of assists
     * @param e is the player's total number of at errors
     * @param rbi is the player's RBI
     * @param gp is the total amount of games the player has played
     * @param weights is an array of stat modifiers. The higher the weight, the better the stats (default = 1)
     *                This array is in the following order: [POW, CON, SPD, FLD, ARM]  (length = 5)
     * @return a String[] containing the player's stats in the following
     *         order: [POW, CON, SPD, FLD, null, T1, T2]  (length = 7)
     */
    public static String[] calculateStats(int hits, int d, int t, int hr, int ab, int k, int sb,
                                          int cs, int r, int po, int a, int e, int rbi, int gp,
                                          double weights[]) {
        String[] playerStats = new String[7];
        int[] playerStatNumbers = new int[5];

        playerStatNumbers[POW] = StatCalculator.calcPower(hits, d, t, hr, ab, weights[POW]);
        playerStats[POW] = "" + playerStatNumbers[POW];
        playerStatNumbers[CON] = StatCalculator.calcContact(ab, k, weights[CON]);
        playerStats[CON] = "" + playerStatNumbers[CON];
        playerStatNumbers[SPD] = StatCalculator.calcSpeed(hits, d, t, ab, sb, cs, r, weights[SPD]);
        playerStats[SPD] = "" + playerStatNumbers[SPD];
        playerStatNumbers[FLD] = StatCalculator.calcField(po, a, e, weights[FLD]);
        playerStats[FLD] = "" + playerStatNumbers[FLD];
        playerStatNumbers[ARM] = -1;
        playerStats[ARM] = "N/A";
        playerStats[T1] = StatCalculator.calcTrait(null, playerStatNumbers[POW], playerStatNumbers[CON],
                playerStatNumbers[SPD], playerStatNumbers[FLD], playerStatNumbers[ARM], hits, d, t, hr, ab, k, sb, cs,
                r, po, a, e, rbi, gp);
        playerStats[T2] = StatCalculator.calcTrait(playerStats[T1], playerStatNumbers[POW], playerStatNumbers[CON],
                playerStatNumbers[SPD], playerStatNumbers[FLD], playerStatNumbers[ARM], hits, d, t, hr, ab, k, sb, cs,
                r, po, a, e, rbi, gp);

        return playerStats;
    } //@todo

    /**
     * Calculates a player's stats based on the inputs in the view (for a pitcher)
     * @param weights is an array of stat modifiers. The higher the weight, the better the stats (default = 1)
     *                This array is in the following order: [POW, CON, SPD, FLD, ARM]  (length = 5)
     * @return a String[] containing the player's stats in the following
     *         order: [POW, CON, SPD, FLD, ARM, T1, T2]  (length = 7)
     */
    public static String[] calculatePitcherStats(double weights[]) {
        String[] playerStats = new String[7];

        //playerStats[POW] = StatCalculator.calcPower();
        //playerStats[CON] = StatCalculator.calcContact();
        //playerStats[SPD] = StatCalculator.calcSpeed();
        //playerStats[FLD] = StatCalculator.calcField();
        //playerStats[ARM] = StatCalculator.calcArm();
        playerStats[T1] = StatCalculator.calcPitcherTrait(null);
        playerStats[T2] = StatCalculator.calcPitcherTrait(playerStats[T1]);

        return playerStats;
    } //@todo

    /**
     * Calculates a player's POW stat
     * @param hits is the player's total number of hits
     * @param d is the player's total number of doubles
     * @param t is the player's total number of triples
     * @param hr is the player's total number of home runs
     * @param ab is the player's total number of at bats
     * @param weight is the stat modifier. The higher the weight, the better the stats (default = 1)
     * @return the player's POW value
     */
    public static int calcPower(int hits, int d, int t, int hr, int ab, double weight) {

        /*
        int totalBases = hits + d + (2*t) + (3*hr);
        double sluggingPercentage = totalBases/ab;
        */
        /*
        int extraBases = d + (2*t) + (3*hr);
        double isolatedPower = extraBases/ab;
        */

        double wXB = (1.268 * d) + (1.610 * t) + (2.086 * hr); // Weighted extra bases
        double weightedISO = wXB/ab;

        double statBooster = 3.85;
        double returnValue = (weightedISO) * statBooster * 100 * weight;

        if (returnValue > 98.5)
            return 99; // Max possible value
        else if (returnValue <= 0)
            return 0; // Lowest possible value
        else
            return (int) Math.round(returnValue);
    }

    //Slugging Percentage = Total Bases / At Bats ; Isolated Power = Extra Bases / At Bats
    //wXB = (1.268 * 2B) + (1.610 * 3B) + (2.086 * HR)

    /**
     * Calculates a player's CON stat
     * @param ab is the player's total number of at bats
     * @param k is the player's total number of strikeouts
     * @param weight is the stat modifier. The higher the weight, the better the stats (default = 1)
     * @return the player's CON value
     */
    public static int calcContact(int ab, int k, double weight) {
        double contactRate = (ab - k + 0.0)/ab;

        double returnValue = contactRate * 100 * weight;

        if (returnValue > 98.5)
            return 99; // Max possible value
        else if (returnValue <= 0)
            return 0; // Lowest possible value
        else
            return (int) Math.round(returnValue);
    } //@todo

    /**
     * Calculates a player's SPD stat
     * @param hits is the player's total number of hits
     * @param d is the player's total number of doubles
     * @param t is the player's total number of triples
     * @param ab is the player's total number of at bats
     * @param sb is the player's total number of stolen bases
     * @param cs is the player's total number of times caught steeling
     * @param r is the player's total number of runs
     * @param weight is the stat modifier. The higher the weight, the better the stats (default = 1)
     * @return the player's SPD value
     */
    public static int calcSpeed(int hits, int d, int t, int ab, int sb, int cs, int r, double weight) {
        double highValue = 10.0;
        double medValue = 5.0;
        double lowValue = 1.0;
        double modifier = 3.0;
        double speedApprox = ((sb-cs)*highValue + t*highValue + d*medValue + r*medValue + hits*lowValue)/(ab*modifier);

        double returnValue = speedApprox * 100 * weight;

        if (returnValue > 98.5)
            return 99; // Max possible value
        else if (returnValue <= 0)
            return 0; // Lowest possible value
        else
            return (int) Math.round(returnValue);
    } //@todo

    /**
     * Calculates a player's FLD stat
     * @param po is the player's total number of putouts
     * @param a is the player's total number of assists
     * @param e is the player's total number of at errors
     * @param weight is the stat modifier. The higher the weight, the better the stats (default = 1)
     * @return the player's FLD value
     */
    public static int calcField(int po, int a, int e, double weight) {
        double fieldingPercentage = (po + a + 0.0) / (po + a + e);

        double returnValue = fieldingPercentage * 100 * weight;

        if (returnValue > 98.5)
            return 99; // Max possible value
        else if (returnValue <= 0)
            return 0; // Lowest possible value
        else
            return (int) Math.round(returnValue);
    } //@todo

    /**
     * Calculates a player's ARM stat
     * @param weight is the stat modifier. The higher the weight, the better the stats (default = 1)
     * @return the player's ARM value
     */
    public static int calcArm(double weight) {
        double returnValue = -1;

        if (returnValue > 98.5)
            return 99; // Max possible value
        else if (returnValue <= 0)
            return 0; // Lowest possible value
        else
            return (int) Math.round(returnValue);
    } //@todo

    // In-Game trait list
    private static final String[] POS_TRAITS = {
            "POW vs RHP", "POW vs LHP", "CON vs RHP", "CON vs LHP", "RBI Man", "High Pitch", "Low Pitch",
            "Inside Pitch", "Outside Pitch", "Tough Out", "Stealer", "Utility"
    };
    private static final String[] NEG_TRAITS = {"RBI Dud", "Whiffer", "Bad Jumps"};
    private static final String[] POS_TRAITS_P = {"Specialist", "Composed", "K Man"};
    private static final String[] NEG_TRAITS_P = {"BB Prone", "K Dud"};
    private static final String NO_TRAITS = "None";
    private static final int NUMBER_OF_TRIES = 5; // The amount of times the system tries to find a suitable trait
    private static final int NUMBER_OF_NONES = 5; // The amount of times the system defaults to NO_TRAITS

    /**
     * Calculates a player's Trait attribute (for a non-pitcher)
     * @param t1 is the player's Trait 1 attribute (prevents duplicate results) (default = null)
     * @param pow is the player's power rating
     * @param con is the player's power rating
     * @param spd is the player's power rating
     * @param fld is the player's power rating
     * @param arm is the player's power rating
     * @param hits is the player's total number of hits
     * @param d is the player's total number of doubles
     * @param t is the player's total number of triples
     * @param hr is the player's total number of home runs
     * @param ab is the player's total number of at bats
     * @param k is the player's total number of strikeouts
     * @param sb is the player's total number of stolen bases
     * @param cs is the player's total number of times caught steeling
     * @param r is the player's total number of runs
     * @param po is the player's total number of putouts
     * @param a is the player's total number of assists
     * @param e is the player's total number of at errors
     * @param rbi is the player's RBI
     * @param gp is the total amount of games the player has played
     * @return the player's Trait value
     */
    public static String calcTrait(String t1, int pow, int con, int spd, int fld, int arm, int hits, int d, int t,
                                   int hr, int ab, int k, int sb, int cs, int r, int po, int a, int e, int rbi,
                                   int gp) {
        String returnValue = null;

        for(int i=0, index; i<NUMBER_OF_TRIES; i++) {
            index = (int)(Math.random() * 2); // Chooses +/-    (POS == 0, NEG == 1)

            // Positive
            if (index == 0) {
                index = (int) (Math.random() * (POS_TRAITS.length + NUMBER_OF_NONES)); // Index of POS_TRAITS

                // Trait selection
                if (index >= POS_TRAITS.length) {                               // None
                } else if (index == 0 && !POS_TRAITS[index].equals(t1)) {       // POW vs RHP
                    if (false) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 1 && !POS_TRAITS[index].equals(t1)) {       // POW vs LHP
                    if (false) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 2 && !POS_TRAITS[index].equals(t1)) {       // CON vs RHP
                    if (false) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 3 && !POS_TRAITS[index].equals(t1)) {       // CON vs LHP
                    if (false) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 4 && !POS_TRAITS[index].equals(t1)) {       // RBI Man
                    double rbiValue = (rbi+0.0)/gp;
                    double hitValue = (pow+con+0.0)/2;
                    if (rbiValue > 0.3 || hitValue > 70) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 5 && !POS_TRAITS[index].equals(t1)) {       // High Pitch
                    if (false) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 6 && !POS_TRAITS[index].equals(t1)) {       // Low Pitch
                    if (false) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 7 && !POS_TRAITS[index].equals(t1)) {       // Inside Pitch
                    if (false) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 8 && !POS_TRAITS[index].equals(t1)) {       // Outside Pitch
                    if (false) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 9 && !POS_TRAITS[index].equals(t1)) {       // Tough Out
                    double ba = (hits+0.0)/ab;
                    if (ba > 0.22) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 10 && !POS_TRAITS[index].equals(t1)) {      // Stealer
                    double stealValue = (sb-cs+0.0);
                    if (stealValue > 2 || spd > 80) {
                        returnValue = POS_TRAITS[index];
                    }
                } else if (index == 11 && !POS_TRAITS[index].equals(t1)) {      // Utility
                    if (false) {
                        returnValue = POS_TRAITS[index];
                    }
                }
            }
            // Negative
            else {
                index = (int)(Math.random() * (NEG_TRAITS.length + NUMBER_OF_NONES)); // Index of NEG_TRAITS

                // Trait selection
                if (index >= POS_TRAITS.length) {                               // None
                } else if (index == 0 && !NEG_TRAITS[index].equals(t1)) {       // RBI Dud
                    double rbiValue = (rbi+0.0)/gp;
                    double hitValue = (pow+con+0.0)/2;
                    if (rbiValue < 0.14 || hitValue < 50) {
                        returnValue = NEG_TRAITS[index];
                    }
                } else if (index == 1 && !NEG_TRAITS[index].equals(t1)) {       // Whiffer
                    double ba = (hits+0.0)/ab;
                    double hitValue = (pow+con+0.0)/2;
                    if (ba < 0.145 || hitValue < 45) {
                        returnValue = NEG_TRAITS[index];
                    }
                } else if (index == 2 && !NEG_TRAITS[index].equals(t1)) {       // Bad Jumps
                    if (false) {
                        returnValue = NEG_TRAITS[index];
                    }
                }
            }

            if(returnValue != null)
                i=NUMBER_OF_TRIES;
        } // End for loop

        // Checks to see if a trait was selected
        if(returnValue == null)
            return NO_TRAITS;
        return returnValue;
    } //@todo

    /**
     * Calculates a player's Trait attribute (for a pitcher)
     * @param t1 is the player's Trait 1 attribute (prevents duplicate results) (default = null)
     * @return the player's Trait value
     */
    public static String calcPitcherTrait(String t1) {
        String returnValue = null;

        for(int i=0, index; i<NUMBER_OF_TRIES; i++) {
            index = (int)(Math.random() * 2); // Chooses +/-    (POS == 0, NEG == 1)

            // Positive
            if (index == 0) {
                index = (int)(Math.random() * (POS_TRAITS_P.length + NUMBER_OF_NONES)); // Index of POS_TRAITS_P

                // Trait selection
                if (index >= POS_TRAITS.length) {                               // None
                } else if (index == 0 && !POS_TRAITS_P[index].equals(t1)) {     // Specialist
                    if (false) {
                        returnValue = POS_TRAITS_P[index];
                    }
                } else if (index == 1 && !POS_TRAITS_P[index].equals(t1)) {     // Composed
                    if (false) {
                        returnValue = POS_TRAITS_P[index];
                    }
                } else if (index == 2 && !POS_TRAITS_P[index].equals(t1)) {     // K Man
                    if (false) {
                        returnValue = POS_TRAITS_P[index];
                    }
                }
            }
            // Negative
            else {
                index = (int)(Math.random() * (NEG_TRAITS.length + NUMBER_OF_NONES)); // Index of NEG_TRAITS_P

                // Trait selection
                if (index >= POS_TRAITS.length) {                               // None
                } else if (index == 0 && !NEG_TRAITS_P[index].equals(t1)) {     // BB Prone
                    if (false) {
                        returnValue = NEG_TRAITS_P[index];
                    }
                } else if (index == 1 && !NEG_TRAITS_P[index].equals(t1)) {     // K Dud
                    if (false) {
                        returnValue = NEG_TRAITS_P[index];
                    }
                }
            }

            if(returnValue != null)
                i=NUMBER_OF_TRIES;
        } // End for loop

        // Checks to see if a trait was selected
        if(returnValue == null)
            return NO_TRAITS;
        return returnValue;
    } //@todo

}
