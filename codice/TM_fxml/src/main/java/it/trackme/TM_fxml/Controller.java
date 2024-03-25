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
import javafx.scene.control.TextField;


public class Controller implements Initializable {
	
	 @FXML
	    private Button btnDiary;

	    @FXML
	    private Button btnDish;

	    @FXML
	    private Button btnRecipe;

	    @FXML
	    private Button btnRecipes;

	    @FXML
	    private Button btnSettings;

	    @FXML
	    private Button btnStats;

	    @FXML
	    private Button btnWorkout;

	    @FXML
	    private ComboBox<?> combo;

	    @FXML
	    private TextField nr;

	    @FXML
	    private TextField txt;
	    
	    
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchDashboard(ActionEvent event) {
		//Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
		// stage = ((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	
	public void handleClicks(javafx.event.ActionEvent mouseEvent) {
		
	/*	if (mouseEvent.getSource() == btnDashboard) {
            loadStages("Dashboard.fxml");
        } else if (mouseEvent.getSource() == btnStudents) {		///ERRORE BOTTONI NON RICONOSCIUTI
            loadStages("Students.fxml");
        } else if (mouseEvent.getSource() == btn_Timetable) {
            loadStages("Timetable.fxml");
        }*/
	}
	
	
	
	private void loadStages (String fxml)
    {
    	try {
        	
       	 Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene (root));
            stage.show();
       	
       } catch (Exception e)
       {
       	e.printStackTrace();
       }
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
