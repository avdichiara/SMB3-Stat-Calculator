import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class DictionaryController {
    @FXML
    private Label dict_title;
    @FXML
    private Label dict_desc;

    private final String TOTAL_NUM = "The total number of ";

    @FXML
    private void getInfo_games(MouseEvent event) {
        event.consume();
        dict_title.setText("Games");
        dict_desc.setText(TOTAL_NUM + "games that the player has played in.");
    }
    @FXML
    private void getInfo_ab(MouseEvent event) {
        event.consume();
        dict_title.setText("AB");
        dict_desc.setText(TOTAL_NUM + "at bats that the player has had.");
    }
    @FXML
    private void getInfo_runs(MouseEvent event) {
        event.consume();
        dict_title.setText("Runs");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored.");
    }
    @FXML
    private void getInfo_hits(MouseEvent event) {
        event.consume();
        dict_title.setText("Hits");
        dict_desc.setText(TOTAL_NUM + "hits that the player has.");
    }
    @FXML
    private void getInfo_2b(MouseEvent event) {
        event.consume();
        dict_title.setText("2B");
        dict_desc.setText(TOTAL_NUM + "doubles that the player has hit.");
    }
    @FXML
    private void getInfo_3b(MouseEvent event) {
        event.consume();
        dict_title.setText("3B");
        dict_desc.setText(TOTAL_NUM + "triples that the player has hit.");
    }
    @FXML
    private void getInfo_hr(MouseEvent event) {
        event.consume();
        dict_title.setText("HR");
        dict_desc.setText(TOTAL_NUM + "home runs that the player has hit.");
    }
    @FXML
    private void getInfo_rbi(MouseEvent event) {
        event.consume();
        dict_title.setText("RBI");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_sb(MouseEvent event) {
        event.consume();
        dict_title.setText("SB");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_cs(MouseEvent event) {
        event.consume();
        dict_title.setText("CS");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_bb(MouseEvent event) {
        event.consume();
        dict_title.setText("BB");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_so(MouseEvent event) {
        event.consume();
        dict_title.setText("SO");
        dict_desc.setText(TOTAL_NUM + "times that the player has struck out.");
    }
    @FXML
    private void getInfo_gdp(MouseEvent event) {
        event.consume();
        dict_title.setText("GDP");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_hbp(MouseEvent event) {
        event.consume();
        dict_title.setText("HBP");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_sh(MouseEvent event) {
        event.consume();
        dict_title.setText("SH");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_sf(MouseEvent event) {
        event.consume();
        dict_title.setText("SF");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_ibb(MouseEvent event) {
        event.consume();
        dict_title.setText("IBB");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_seasons(MouseEvent event) {
        event.consume();
        dict_title.setText("Seasons");
        dict_desc.setText(TOTAL_NUM + "seasons that the player has played in.");
    }
    @FXML
    private void getInfo_avg_left(MouseEvent event) {
        event.consume();
        dict_title.setText("AVG Left");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_avg_right(MouseEvent event) {
        event.consume();
        dict_title.setText("AVG Right");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_slg_left(MouseEvent event) {
        event.consume();
        dict_title.setText("SLG Left");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_slg_right(MouseEvent event) {
        event.consume();
        dict_title.setText("SLG Right");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_p_ip(MouseEvent event) {
        event.consume();
        dict_title.setText("IP");
        dict_desc.setText(TOTAL_NUM + "innings that the player has pitched.");
    }
    @FXML
    private void getInfo_p_hr(MouseEvent event) {
        event.consume();
        dict_title.setText("HR");
        dict_desc.setText(TOTAL_NUM + "home runs that the player has given up.");
    }
    @FXML
    private void getInfo_p_bb(MouseEvent event) {
        event.consume();
        dict_title.setText("BB");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_p_so(MouseEvent event) {
        event.consume();
        dict_title.setText("SO");
        dict_desc.setText(TOTAL_NUM + "strike outs that the player has thrown.");
    }
    @FXML
    private void getInfo_p_era(MouseEvent event) {
        event.consume();
        dict_title.setText("ERA");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_po(MouseEvent event) {
        event.consume();
        dict_title.setText("PO");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_assists(MouseEvent event) {
        event.consume();
        dict_title.setText("Assists");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
    }
    @FXML
    private void getInfo_errors(MouseEvent event) {
        event.consume();
        dict_title.setText("Errors");
        dict_desc.setText(TOTAL_NUM + "errors that the player has made.");
    }
    @FXML
    private void getInfo_innings(MouseEvent event) {
        event.consume();
        dict_title.setText("Innings");
        dict_desc.setText(TOTAL_NUM + "innings that the player has played in.");
    }
}
