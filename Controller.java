import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * MVC for the calculator
 */
public class Controller {
    protected static final int POW = 0, CON = 1, SPD = 2, FLD = 3,
                            ARM = 4, T1 = 5, T2 = 6;

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
    @FXML
    private void calculateEvent(ActionEvent event) {
        event.consume();

        //private int[] stats = new int[?];
        int[] stats = {103, 28, 1, 21, 357, 66, 2, 1, 58, 220, 350, 9, 64, 125}; //db
        double[] weights = {1, 1, 1, 1, 1};
        String[] dispValues = {"", "", "", "", "", "", ""}; // Values to be displayed
        System.out.println("Calculating...");
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
