package it.trackme.TM_fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import it.trackme.jooq.generated.tables.records.UserRecord;



/**
 * JavaFX App
 */
public class App extends Application {

  /*  private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }*/
	
	public static UserRecord utente = null;

    public static void main(String[] args) {
        launch(); 
    }
	
	
	 @Override
	   public void start(Stage stage) {
	    	
	    
	       try {
	        	
	        	 Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
	             Scene scene = new Scene(root);
	             stage.setScene(scene);
	             stage.show();
	        	
	        } catch (Exception e)
	        {
	        	e.printStackTrace();
	        }
	        
	 }

}