package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // This Method Is Called when the JavaFX application starts.
    // It Loads the `home.fxml` File and displays it on the stage.
    @Override
    public void start(Stage primaryStage) {
        try {
            // Loads the `home.fxml` file, which contains the user interface for the application.
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));

            // Creates a new scene and sets the stage's scene to it.
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            // Shows the stage.
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

