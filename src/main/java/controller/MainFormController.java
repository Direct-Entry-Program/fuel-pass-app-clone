package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class MainFormController {

    public AnchorPane pneContainer;
    public AnchorPane pneLogin;

    public void initialize() throws IOException {
        URL resource = this.getClass().getResource("/view/WelcomeForm.fxml");
        AnchorPane welcomeForm = FXMLLoader.load(resource);

        pneContainer.getChildren().add(welcomeForm);
        AnchorPane.setRightAnchor(welcomeForm,0.0);
        AnchorPane.setLeftAnchor(welcomeForm,0.0);
        AnchorPane.setBottomAnchor(welcomeForm,0.0);
        AnchorPane.setTopAnchor(welcomeForm,0.0);



    }

    public void imgLogo_OnMouseClicked(MouseEvent mouseEvent) throws IOException {
        pneContainer.getChildren().clear();
        initialize();
    }

    public void pneLogin_OnMouseClicked(MouseEvent mouseEvent) throws IOException {


        pneContainer.getChildren().clear();

        URL resource = this.getClass().getResource("/view/AdminLoginForm.fxml");
        AnchorPane loginForm = FXMLLoader.load(resource);

        pneContainer.getChildren().add(loginForm);
        AnchorPane.setLeftAnchor(loginForm,0.0);
        AnchorPane.setRightAnchor(loginForm,0.0);
        AnchorPane.setBottomAnchor(loginForm,0.0);
        AnchorPane.setTopAnchor(loginForm,0.0);
    }

    public void pneLogin_OnkeyReleased(KeyEvent keyEvent) throws IOException {
        if (keyEvent.getCode() == KeyCode.ENTER ||keyEvent.getCode() == KeyCode.SPACE){
            pneLogin_OnMouseClicked(null);
        }
    }
}
