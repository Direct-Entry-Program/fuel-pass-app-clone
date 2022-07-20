package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.IOException;
import java.net.URL;

public class AdminLoginFormController {

    private static final String ADMIN_PASSWORD = "dep9admin";
    public PasswordField txtPassword;
    public AnchorPane pneAdminLoginForm;

    public void txtPassword_OnAction(ActionEvent actionEvent) throws IOException {
        if (!txtPassword.getText().equals(ADMIN_PASSWORD)){

            URL resource = this.getClass().getResource("/audio/smartphone_vibrating_alarm_silent-7040.mp3");
            Media media = new Media(resource.toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();

            new Alert(Alert.AlertType.ERROR,"Wrong password").showAndWait();
            txtPassword.clear();
            txtPassword.requestFocus();
            return;
        }
        URL resource = this.getClass().getResource("/view/ControlCenterForm.fxml");
        AnchorPane controlCenter = FXMLLoader.load(resource);
        AnchorPane pneContainer = (AnchorPane) pneAdminLoginForm.getParent();
        pneContainer.getChildren().clear();
        pneContainer.getChildren().add(controlCenter);



    }

    public void initialize(){
        Platform.runLater(txtPassword::requestFocus);
    }
}
