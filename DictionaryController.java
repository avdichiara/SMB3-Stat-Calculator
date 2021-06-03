import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DictionaryController {
    @FXML
    private Label dict_title;
    @FXML
    private Label dict_desc;
    @FXML
    private Label dict_more;

    private final String TOTAL_NUM = "The total number of ";

    public void initialize() {
        dict_more.setOnMouseEntered(event1 -> {
            dict_more.setUnderline(true);
        });
        dict_more.setOnMouseExited(event1 -> {
            dict_more.setUnderline(false);
        });
    }

    @FXML
    private void removeFocus() {
        dict_title.getParent().requestFocus();
    }

    @FXML
    private void getInfo_games(MouseEvent event) {
        event.consume();
        dict_title.setText("Games");
        dict_desc.setText(TOTAL_NUM + "games that the player has played in.");
        dict_more.setText("See more about games played at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/games-played"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_ab(MouseEvent event) {
        event.consume();
        dict_title.setText("AB");
        dict_desc.setText(TOTAL_NUM + "at bats that the player has had.");
        dict_more.setText("See more about at bats at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/at-bat"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_runs(MouseEvent event) {
        event.consume();
        dict_title.setText("Runs");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored.");
        dict_more.setText("See more about runs at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/run"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_hits(MouseEvent event) {
        event.consume();
        dict_title.setText("Hits");
        dict_desc.setText(TOTAL_NUM + "hits that the player has.");
        dict_more.setText("See more about runs at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/hit"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_2b(MouseEvent event) {
        event.consume();
        dict_title.setText("2B");
        dict_desc.setText(TOTAL_NUM + "doubles that the player has hit.");
        dict_more.setText("See more about doubles at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/double"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_3b(MouseEvent event) {
        event.consume();
        dict_title.setText("3B");
        dict_desc.setText(TOTAL_NUM + "triples that the player has hit.");
        dict_more.setText("See more about triples at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/triple"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_hr(MouseEvent event) {
        event.consume();
        dict_title.setText("HR");
        dict_desc.setText(TOTAL_NUM + "home runs that the player has hit.");
        dict_more.setText("See more about home runs at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/home-run"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_rbi(MouseEvent event) {
        event.consume();
        dict_title.setText("RBI");
        dict_desc.setText(TOTAL_NUM + "runs that were scored as a result of the player's at bat.");
        dict_more.setText("See more about RBI at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/runs-batted-in"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_sb(MouseEvent event) {
        event.consume();
        dict_title.setText("SB");
        dict_desc.setText(TOTAL_NUM + "bases that the player has stolen.");
        dict_more.setText("See more about stolen bases at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/stolen-base"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_cs(MouseEvent event) {
        event.consume();
        dict_title.setText("CS");
        dict_desc.setText(TOTAL_NUM + "times that the player has attempted to steal a base but was tagged out.");
        dict_more.setText("See more about CS at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/caught-stealing"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_bb(MouseEvent event) {
        event.consume();
        dict_title.setText("BB");
        dict_desc.setText(TOTAL_NUM + "walks (or base on balls) that the player has given up as a result of " +
                "bad pitching.");
        dict_more.setText("See more about walks at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/walk"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_so(MouseEvent event) {
        event.consume();
        dict_title.setText("SO");
        dict_desc.setText(TOTAL_NUM + "times that the player has struck out.");
        dict_more.setText("See more about strike outs at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/strikeout"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_gdp(MouseEvent event) {
        event.consume();
        dict_title.setText("GDP");
        dict_desc.setText(TOTAL_NUM + "times that the player has hit a ground ball that resulted in multiple outs.");
        dict_more.setText("See more about GDP at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/ground-into-double-play"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_hbp(MouseEvent event) {
        event.consume();
        dict_title.setText("HBP");
        dict_desc.setText(TOTAL_NUM + "times that the player has been hit by a pitch.");
        dict_more.setText("See more about HBP at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/hit-by-pitch"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_sh(MouseEvent event) {
        event.consume();
        dict_title.setText("SH");
        dict_desc.setText(TOTAL_NUM + "successful sacrifice bunts that the player has hit. A sacrifice bunt is " +
                "when a batter sacrifices himself (intentionally gets out) in order to advance a runner.");
        dict_more.setText("See more about sacrifice bunts at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/sacrifice-bunt"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_sf(MouseEvent event) {
        event.consume();
        dict_title.setText("SF");
        dict_desc.setText(TOTAL_NUM + "successful sacrifice flies that the player has hit. A sacrifice fly is " +
                "when a batter hits a fly-ball into the outfield or foul territory in order to let a runner score.");
        dict_more.setText("See more about sacrifice flies at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/sacrifice-fly"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_ibb(MouseEvent event) {
        event.consume();
        dict_title.setText("IBB");
        dict_desc.setText(TOTAL_NUM + "times that the player has been intentionally walked.");
        dict_more.setText("See more about IBB at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/intentional-walk"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_seasons(MouseEvent event) {
        event.consume();
        dict_title.setText("Seasons");
        dict_desc.setText(TOTAL_NUM + "seasons that the player has played in.");
        /*dict_more.setText("See more about runs at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/run"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });*/
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(false);
    }
    @FXML
    private void getInfo_avg_left(MouseEvent event) {
        event.consume();
        dict_title.setText("AVG Left");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
        dict_more.setText("See more about AVG at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/batting-average"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_avg_right(MouseEvent event) {
        event.consume();
        dict_title.setText("AVG Right");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
        dict_more.setText("See more about AVG at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/batting-average"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_slg_left(MouseEvent event) {
        event.consume();
        dict_title.setText("SLG Left");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
        dict_more.setText("See more about SLG at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/slugging-percentage"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_slg_right(MouseEvent event) {
        event.consume();
        dict_title.setText("SLG Right");
        dict_desc.setText(TOTAL_NUM + "runs that the player has scored."); //@todo
        dict_more.setText("See more about SLG at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/slugging-percentage"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_p_ip(MouseEvent event) {
        event.consume();
        dict_title.setText("IP");
        dict_desc.setText(TOTAL_NUM + "innings that the player has pitched.");
        dict_more.setText("See more about IP at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/innings-pitched"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_p_hr(MouseEvent event) {
        event.consume();
        dict_title.setText("HR");
        dict_desc.setText(TOTAL_NUM + "home runs that the player has given up.");
        dict_more.setText("See more about home runs at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/home-run"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_p_bb(MouseEvent event) {
        event.consume();
        dict_title.setText("BB");
        dict_desc.setText(TOTAL_NUM + "walks (or base on balls) that the player has given up.");
        dict_more.setText("See more about walks at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/walk"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_p_so(MouseEvent event) {
        event.consume();
        dict_title.setText("SO");
        dict_desc.setText(TOTAL_NUM + "strike outs that the player has thrown.");
        dict_more.setText("See more about strike outs at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/strikeout"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_p_era(MouseEvent event) {
        event.consume();
        dict_title.setText("ERA");
        dict_desc.setText(TOTAL_NUM + "runs that the player allowed per 9 innings.");
        dict_more.setText("See more about ERA at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/earned-run-average"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_po(MouseEvent event) {
        event.consume();
        dict_title.setText("PO");
        dict_desc.setText(TOTAL_NUM + "putouts that the player has earned. A putout is when a fielder " +
                "successfully completes an out.");
        dict_more.setText("See more about putouts at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/putout"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_assists(MouseEvent event) {
        event.consume();
        dict_title.setText("Assists");
        dict_desc.setText(TOTAL_NUM + "assists that the player has earned. An assist is given to a player " +
                "who touches the ball right before another gets a putout.");
        dict_more.setText("See more about assists at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/assist"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_errors(MouseEvent event) {
        event.consume();
        dict_title.setText("Errors");
        dict_desc.setText(TOTAL_NUM + "errors that the player has made.");
        dict_more.setText("See more about errors at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/error"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
    @FXML
    private void getInfo_innings(MouseEvent event) {
        event.consume();
        dict_title.setText("Innings");
        dict_desc.setText(TOTAL_NUM + "innings that the player has played in.");
        dict_more.setText("See more about innings played at MLB.com.");
        dict_more.onMouseClickedProperty().set(event1 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mlb.com/glossary/standard-stats/innings-played"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        dict_title.setVisible(true);
        dict_desc.setVisible(true);
        dict_more.setVisible(true);
    }
}
