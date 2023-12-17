module hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.hellofx to javafx.fxml;
    exports org.openjfx.hellofx;
}