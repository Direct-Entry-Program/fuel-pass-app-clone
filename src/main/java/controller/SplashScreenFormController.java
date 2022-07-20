package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

public class SplashScreenFormController {
    public Label lblLoading;
    public Rectangle pgbcontainer;
    public Rectangle pgbload;


    public void initialize() throws IOException {
        Timeline timeline = new Timeline();

        var ke1 = new KeyFrame(Duration.millis(300), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblLoading.setText("Loading user details..");
                pgbload.setWidth(pgbload.getWidth()+25);

            }
        });
        var ke2 = new KeyFrame(Duration.millis(600), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblLoading.setText("Loading data..");
                pgbload.setWidth(pgbload.getWidth()+30);

            }
        });
        var ke3 = new KeyFrame(Duration.millis(900), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblLoading.setText("Setting up UI..");
                pgbload.setWidth(pgbload.getWidth()+15);

            }
        });
        var ke4 = new KeyFrame(Duration.millis(1500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblLoading.setText("Setting up UI..");

                pgbload.setWidth(pgbcontainer.getWidth());

                try {
                    URL resource = this.getClass().getResource("/view/MainForm.fxml");
                    Parent load = FXMLLoader.load(resource);

                    Scene scene = new Scene(load);

                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.centerOnScreen();
                    stage.setTitle("National Fuel Pass App");
                    stage.show();
                    lblLoading.getScene().getWindow().hide();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        timeline.getKeyFrames().addAll(ke1,ke2,ke3,ke4);
        timeline.playFromStart();





    }
}
