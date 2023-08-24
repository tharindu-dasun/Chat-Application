package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane loginFormContext;
    public TextField txtUserName;
    public Button btnLogin;
    static String userName;

    public void LogInAction(ActionEvent actionEvent) throws IOException {
        userName=txtUserName.getText();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LoginFormController.class.getResource("../view/Client_Form.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }
}
