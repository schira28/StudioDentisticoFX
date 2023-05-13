package schiralli.studiodentisticofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomePageController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to my new JavaFX Application!");
    }
}