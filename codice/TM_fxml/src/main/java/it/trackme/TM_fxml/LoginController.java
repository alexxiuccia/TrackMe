package it.trackme.TM_fxml;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//import it.trackme.TM_logic.GestisciUtente;
import javafx.fxml.Initializable;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegister;

    @FXML
    private PasswordField pwdUser;

    @FXML
    private TextField txtUser;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		
		// TODO Auto-generated method stub		
		 btnLogin.setOnAction(event -> {
	            String username = txtUser.getText();
	            String password = pwdUser.getText();
	            // Qui puoi aggiungere la logica per il login utilizzando le credenziali inserite
	            // Ad esempio, puoi controllare se username e password sono corretti e avviare una nuova finestra o eseguire altre operazioni
	            System.out.println("Username: " + username);
	            System.out.println("Password: " + password);
	           // if(GestisciUtente.accessoUtente(null, password))
	          //  GestisciUtente.accessoUtente()
	            if(1==1)
	            {
	            	  
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
	            	 
	            }
	        });
		
	}

}
