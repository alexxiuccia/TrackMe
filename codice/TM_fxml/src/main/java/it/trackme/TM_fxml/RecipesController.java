package it.trackme.TM_fxml;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class RecipesController implements Initializable {


		@FXML
	    private Button btn1;

	    @FXML
	    private Button btn2;

	    @FXML
	    private Button btn3;  

	    @FXML
	    private Button diarybtn;

	    @FXML
	    private Text txtNomeRicetta;

	    @FXML
	    private TextArea txtRicetta;

    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub		
		 btn1.setOnAction(event -> {
			 
			 
			 
				try {
					txtRicetta.clear();
					// String filePath = "/Ricetta1.txt";
					String content;
					// content = readFile(filePath);
					InputStream inputStream = getClass().getResourceAsStream("Ricetta1.txt");
					if (inputStream != null) {
						BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
						String line;
						while ((line = reader.readLine()) != null) {
							txtRicetta.appendText(line + "\n");
							// System.out.println(line);
						}
						reader.close();
					} else {
						System.err.println("Impossibile trovare il file Ricetta1.txt");
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
           
	            
	        });
		 
		 btn2.setOnAction(event -> {
			 
			 
			 
				try {
					txtRicetta.clear();
					// String filePath = "/Ricetta1.txt";
					String content;
					// content = readFile(filePath);
					InputStream inputStream = getClass().getResourceAsStream("Ricetta2.txt");
					if (inputStream != null) {
						BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
						String line;
						while ((line = reader.readLine()) != null) {
							txtRicetta.appendText(line + "\n");
							// System.out.println(line);
						}
						reader.close();
					} else {
						System.err.println("Impossibile trovare il file Ricetta1.txt");
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        
	            
	        });
		 
		 
			diarybtn.setOnAction(event -> {

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
		 
			btn3.setOnAction(event -> {

				try {
					txtRicetta.clear();
					// String filePath = "/Ricetta1.txt";
					String content;
					// content = readFile(filePath);
					InputStream inputStream = getClass().getResourceAsStream("Ricetta3.txt");
					if (inputStream != null) {
						BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
						String line;
						while ((line = reader.readLine()) != null) {
							txtRicetta.appendText(line + "\n");
							// System.out.println(line);
						}
						reader.close();
					} else {
						System.err.println("Impossibile trovare il file Ricetta1.txt");
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			});
		 
		 
		 
		 
		 
		
	}

	private String readFile(String filePath) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            contentBuilder.append(line).append("\n");
        }
        br.close();
        return contentBuilder.toString();
    }
	
}
