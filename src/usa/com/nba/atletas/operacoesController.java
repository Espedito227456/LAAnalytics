package usa.com.nba.atletas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class operacoesController {
	
	@FXML
	MenuItem mniFechar;
	
	@FXML
	Stage palco;
	
	@FXML
	private void fecharTela(ActionEvent event) {
		palco = (Stage) mniFechar.getParentPopup().getOwnerWindow();
		palco.close();
	}
	
}
