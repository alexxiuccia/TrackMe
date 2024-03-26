package it.trackme.TM_fxml;

import java.net.URL;
import java.util.ResourceBundle;

import it.trackme.TM_logic.GestisciPianoAlimentare;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class StatsController implements Initializable {


    @FXML
    private Button btnRefresh;

    @FXML
    private ProgressBar prog;

    @FXML
    private TextField txtCurrent;

    @FXML
    private TextField txtxGoal;

    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
			
			txtCurrent.setText(String.valueOf(GestisciPianoAlimentare.consumoDelGiorno(App.utente.getIduser())));
			txtxGoal.setText(App.utente.getCalgoal().toString());
			System.out.println(String.valueOf(GestisciPianoAlimentare.consumoDelGiorno(App.utente.getIduser())));
			
			//System.out.println(App.utente.getCalgoal().toString());
			
		
		
	}

}
