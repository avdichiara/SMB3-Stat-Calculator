import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * View for the calculator
 */
public class Main extends Application {
    final int MIN_WIDTH = 600;
    final int MIN_HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        //root.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
        // Initialize primaryStage
        primaryStage.setTitle("SMB3 Stat Calculator");
        primaryStage.setScene(new Scene(root, MIN_WIDTH, MIN_HEIGHT));
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("./images/SMB3SC_logo.png"));
        primaryStage.show();
        root.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
