package sample;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.skin.TextFieldSkin;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.css.*;

public class Controller {

    @FXML
    private Button LoginButton, backBttn, signupBttn;


    public void handleLoginButton() throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("Account.fxml"));

        Stage window = (Stage) LoginButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void handleBackButton() throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        Stage window = (Stage) backBttn.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void handleSignUp() throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("Signup.fxml"));

        Stage window = (Stage) signupBttn.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
