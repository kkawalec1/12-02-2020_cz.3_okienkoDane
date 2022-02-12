package aplikacja;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private Button HomePotwierdzButton;
    @FXML
    private ChoiceBox<String> HomePlecChoiceBox;
    @FXML
    private TextField HomeImieTextField;
    @FXML
    private TextField HomeNazwiskoTextField;
    @FXML
    private TextField HomeWiekTextField;

    public void register(ActionEvent event) throws IOException {
        String HomeImie = HomeImieTextField.getText();
        String HomeNazwisko = HomeNazwiskoTextField.getText();
        String HomeWiek = HomeWiekTextField.getText();
        String HomePlec = HomePlecChoiceBox.getValue();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Feedback.fxml"));
        Parent root = loader.load();
        FeedBackController feedBackController = loader.getController();
        feedBackController.displayData(HomeImie, HomeNazwisko, HomeWiek, HomePlec);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        HomePlecChoiceBox.getItems().add(0, "Mężczyzna");
        HomePlecChoiceBox.getItems().add(1, "Kobieta");
        HomePlecChoiceBox.getItems().add(2, "Inna");
    }



}
