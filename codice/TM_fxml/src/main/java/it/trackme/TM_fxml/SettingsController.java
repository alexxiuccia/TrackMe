package it.trackme.TM_fxml;
import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;;

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
    
    @FXML
    private Button btnDiary;

    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
    	txtName.setText(App.utente.getNome());
    	txtSurname.setText(App.utente.getCognome());
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	String formattedString = App.utente.getDatanascita().format(formatter);
    	txtDate.setText(formattedString);
    	txtMail.setText(App.utente.getNomeutente());
    	txtGoal.setText(App.utente.getCalgoal().toString());
    	
    	
        btnDiary.setOnAction(event -> {
            
    		
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
