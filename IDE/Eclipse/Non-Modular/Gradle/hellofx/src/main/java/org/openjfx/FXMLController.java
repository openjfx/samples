package org.openjfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText("Hello, JavaFX");
    }    
}
