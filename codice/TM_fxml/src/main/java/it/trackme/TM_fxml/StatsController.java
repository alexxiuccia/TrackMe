package it.trackme.TM_fxml;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import it.trackme.TM_logic.GestisciPianoAlimentare;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ProgressBar;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
			
			int current = Integer.parseInt(txtCurrent.getText());
			int goal = Integer.parseInt(txtxGoal.getText());
			
			//System.out.println(App.utente.getCalgoal().toString());
			// Calcola la percentuale
		    double percent = (double) current / goal;
		    
		    btnRefresh.setOnAction(event -> {
				try {
					Parent root;
					root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
					Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					Scene scene = new Scene(root);
					stage.setScene(scene);
					stage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			});
		
	}

}
