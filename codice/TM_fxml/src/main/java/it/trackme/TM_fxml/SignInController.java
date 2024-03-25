package it.trackme.TM_fxml;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


public class SignInController {

		@FXML
	    private Button btnSub;

	    @FXML
	    private ComboBox<String> comboLife;

	    @FXML
	    private DatePicker dateBirth;

	    @FXML
	    private TextField txtHeight;

	    @FXML
	    private TextField txtMail;

	    @FXML
	    private TextField txtName;

	    @FXML
	    private TextField txtPwd;

	    @FXML
	    private TextField txtSurname;

	    @FXML
	    private TextField txtWeight;

   /* @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Aggiungi le opzioni alla ComboBox
        comboLife.getItems().addAll("non molto attivo", "leggermente attivo", "attivo", "molto attivo");
    }*/
}
