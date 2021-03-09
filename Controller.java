import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * MVC for the calculator
 */
public class Controller {
    protected static final int POW = 0, CON = 1, SPD = 2, FLD = 3,
                            ARM = 4, T1 = 5, T2 = 6;

    protected static final String VERSION = "v0.1.5a";

    @FXML
    private Label version_id;

    /*
        BEGIN INPUT
     */
    @FXML
    private TextField input_games;
    @FXML
    private TextField input_ab;
    @FXML
    private TextField input_runs;
    @FXML
    private TextField input_hits;
    @FXML
    private TextField input_2b;
    @FXML
    private TextField input_3b;
    @FXML
    private TextField input_hr;
    @FXML
    private TextField input_rbi;
    @FXML
    private TextField input_sb;
    @FXML
    private TextField input_cs;
    @FXML
    private TextField input_bb;
    @FXML
    private TextField input_so;
    @FXML
    private TextField input_gdp;
    @FXML
    private TextField input_hbp;
    @FXML
    private TextField input_sh;
    @FXML
    private TextField input_sf;
    @FXML
    private TextField input_ibb;
    @FXML
    private TextField input_seasons;
    @FXML
    private TextField input_avg_left;
    @FXML
    private TextField input_avg_right;
    @FXML
    private TextField input_slg_left;
    @FXML
    private TextField input_slg_right;
    @FXML
    private TextField input_p_ip;
    @FXML
    private TextField input_p_hr;
    @FXML
    private TextField input_p_bb;
    @FXML
    private TextField input_p_so;
    @FXML
    private TextField input_p_era;
    @FXML
    private TextField input_po;
    @FXML
    private TextField input_assists;
    @FXML
    private TextField input_errors;
    @FXML
    private TextField input_innings;

    @FXML
    private CheckBox is_pitcher;

    /*
        BEGIN OUTPUT
     */
    @FXML
    private Label output_pow;
    @FXML
    private Label output_con;
    @FXML
    private Label output_spd;
    @FXML
    private Label output_fld;
    @FXML
    private Label output_arm;
    @FXML
    private Label output_t1;
    @FXML
    private Label output_t2;

    /*
        BEGIN METHODS
     */
    public void initialize() {
        version_id.setText(VERSION);
    }

    @FXML
    private void removeFocus() {
        version_id.requestFocus();
    }

    /**
     * Validates input
     *
     * @param input the TextField being evaluated
     * @return true if input is a positive integer less than or equal to 1000
     */
    private boolean containsValidInput(TextField input) {
        String inputText = input.getText();
        int inputInt;

        try {
            inputInt = Integer.parseInt(inputText);
        } catch (Exception e) {
            System.err.println("Error: input is not a number");
            input.getStyleClass().remove("valid-input");
            input.getStyleClass().add("invalid-input");
            return false;
        }

        if (inputInt <= 1000 && inputInt >= 0) {
            input.getStyleClass().remove("invalid-input");
            input.getStyleClass().add("valid-input");
            return true;
        } else {
            if (inputInt <= 1000)
                System.err.println("Error: input is negative");
            else
                System.err.println("Error: input is too large");
            input.getStyleClass().remove("valid-input");
            input.getStyleClass().add("invalid-input");
            return false;
        }
    }

    /**
     * Validates all input fields
     * @return true if all fields are valid
     */
    /*private boolean validateInput() {
        boolean returnValue = true;

        //https://stackoverflow.com/questions/41292482/how-to-change-the-glow-outline-color-of-a-focused-text-field-in-javafx/41292685

        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_2b))
            returnValue = false;
        if (!containsValidInput(input_3b))
            returnValue = false;
        if (!containsValidInput(input_hr))
            returnValue = false;
        if (!containsValidInput(input_ab))
            returnValue = false;
        if (!containsValidInput(input_so))
            returnValue = false;
        if (!containsValidInput(input_sb))
            returnValue = false;
        if (!containsValidInput(input_cs))
            returnValue = false;
        if (!containsValidInput(input_runs))
            returnValue = false;
        if (!containsValidInput(input_po))
            returnValue = false;
        if (!containsValidInput(input_assists))
            returnValue = false;
        if (!containsValidInput(input_errors))
            returnValue = false;
        if (!containsValidInput(input_rbi))
            returnValue = false;
        if (!containsValidInput(input_games))
            returnValue = false;
        /*if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;
        if (!containsValidInput(input_hits))
            returnValue = false;//


        return returnValue;
    }//*/

    @FXML
    private void calculateEvent(ActionEvent event) {
        event.consume();

        //if (validateInput()) {
        if (true) {
            /*int[] stats = {Integer.valueOf(input_hits.getText()), Integer.valueOf(input_2b.getText()),
                    Integer.valueOf(input_3b.getText()), Integer.valueOf(input_hr.getText()),
                    Integer.valueOf(input_ab.getText()), Integer.valueOf(input_so.getText()),
                    Integer.valueOf(input_sb.getText()), Integer.valueOf(input_cs.getText()),
                    Integer.valueOf(input_runs.getText()), Integer.valueOf(input_po.getText()),
                    Integer.valueOf(input_assists.getText()), Integer.valueOf(input_errors.getText()),
                    Integer.valueOf(input_rbi.getText()), Integer.valueOf(input_games.getText()),
                    Integer.valueOf(input_.getText()), Integer.valueOf(input_.getText()),
                    Integer.valueOf(input_.getText()), Integer.valueOf(input_.getText()),
                    Integer.valueOf(input_.getText()), Integer.valueOf(input_.getText()),
                    Integer.valueOf(input_.getText()), Integer.valueOf(input_.getText()),
                    Integer.valueOf(input_.getText()), Integer.valueOf(input_.getText()),
                    Integer.valueOf(input_.getText()), Integer.valueOf(input_.getText()),
                    Integer.valueOf(input_.getText()), Integer.valueOf(input_.getText()),
                    Integer.valueOf(input_.getText()), Integer.valueOf(input_.getText()),
                    Integer.valueOf(input_.getText())}; //db*/

            int[] stats = {103, 28, 1, 21, 357, 66, 2, 1, 58, 220, 350, 9, 64, 125}; //db
            double[] weights = {1, 1, 1, 1, 1};
            String[] dispValues; // Values to be displayed
            dispValues = StatCalculator.calculate(is_pitcher.isSelected(), stats, weights);

            output_pow.setText(dispValues[POW]);
            output_con.setText(dispValues[CON]);
            output_spd.setText(dispValues[SPD]);
            output_fld.setText(dispValues[FLD]);
            output_arm.setText(dispValues[ARM]);
            output_t1.setText(dispValues[T1]);
            output_t2.setText(dispValues[T2]);
        }
    }
}
