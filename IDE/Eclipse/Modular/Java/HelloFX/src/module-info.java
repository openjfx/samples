module hellofx {
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.base;
	requires transitive javafx.graphics;
	
	opens org.openjfx to javafx.fxml;
	exports org.openjfx;
}