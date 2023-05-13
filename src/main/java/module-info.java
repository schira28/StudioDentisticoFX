module schiralli.studiodentisticofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens schiralli.studiodentisticofx to javafx.fxml;
    exports schiralli.studiodentisticofx;
}