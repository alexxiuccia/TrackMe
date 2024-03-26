package it.trackme.TM_fxml;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;;

public class SettingsController implements Initializable{
	

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtGoal;

    @FXML
    private TextField txtMail;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSurname;
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
    	txtName.setText(App.utente.getNome());
    	txtSurname.setText(App.utente.getCognome());
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	String formattedString = App.utente.getDatanascita().format(formatter);
    	txtDate.setText(formattedString);
    	txtMail.setText(App.utente.getNomeutente());
    	txtGoal.setText(App.utente.getCalgoal().toString());
    }

}
