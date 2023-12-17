module hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    
    opens org.openjfx.hellofx to javafx.fxml;
    exports org.openjfx.hellofx;
}