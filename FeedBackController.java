package aplikacja;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FeedBackController {
    @FXML
    private Label IMIELabel;
    @FXML
    private Label NAZWISKOLabel;
    @FXML
    private Label WIEKLabel;
    @FXML
    private Label PLECLabel;
    @FXML
    private Button WYJDZ;
    public void displayData(String IMIE, String NAZWISKO, String WIEK, String PLEC) {
        IMIELabel.setText(IMIE);
        NAZWISKOLabel.setText(NAZWISKO);
        WIEKLabel.setText(WIEK);
        PLECLabel.setText(PLEC);
    }
}
