import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {




        URL resource = this.getClass().getResource("/view/SplashScreenForm.fxml");
        Parent splash = FXMLLoader.load(resource);

        Scene scene = new Scene(splash);

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
}
