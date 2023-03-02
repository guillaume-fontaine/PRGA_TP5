module binome1.binome2.tp5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens binome1.binome2.tp5 to javafx.fxml;
    exports binome1.binome2.tp5;
}