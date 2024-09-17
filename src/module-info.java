module LaAnalitics {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens usa.com.nba.atletas to javafx.graphics, javafx.fxml;
}
