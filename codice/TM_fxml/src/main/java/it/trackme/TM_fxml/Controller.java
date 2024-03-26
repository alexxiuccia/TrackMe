package it.trackme.TM_fxml;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import it.trackme.TM_logic.GestisciAlimento;
import it.trackme.TM_logic.GestisciComposizioneRicetta;
import it.trackme.TM_logic.GestisciCreazionePasto;
import it.trackme.TM_logic.GestisciPasto;
import it.trackme.TM_logic.GestisciRicetta;
import it.trackme.TM_logic.GestisciWorkout;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class Controller implements Initializable {
	

	@FXML
    private Button btnMeal;

    @FXML
    private Button btnFood;

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
    private ComboBox<String> comboWhich;

    @FXML
    private ListView<String> listFood;

    @FXML
    private ListView<String> listRecipes;
    
    @FXML
    private TextField nr;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtAmountDish;
    

    @FXML
    private TextField txtFoodAmount;

    @FXML
    private TextField txtCarbs;

    @FXML
    private TextField txtFat;

    @FXML
    private TextField txtFood;

    @FXML
    private TextField txtProtein;

    @FXML
    private TextField txtRecName;

	    
	    
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	Map<String, Integer> food;
	Map<Integer, Integer> foodAmount;
	

	Map<String, Integer> recipe;
	
	public void switchDashboard(ActionEvent event) {
		//Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
		// stage = ((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	
	
	
	/*public void handleClicks(ActionEvent event) {
		
		if (event.getSource() == btnDiary) {
           // loadStages("Dashboard.fxml");
        } else if (event.getSource() == btnStats) {		
            loadStages("Students.fxml");
        } else if (event.getSource() == btnRecipes) {
        	 System.out.println("Username: ");
        	try {
				Parent root;
				root = FXMLLoader.load(getClass().getResource("Recipes.fxml"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else if (event.getSource() == btnSettings) {
            loadStages("Settings.fxml");
        }
		
	}*/
	
	
	
	
	
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
		food=new HashMap<String, Integer>();
		recipe=new HashMap<String, Integer>();
		foodAmount=new HashMap<Integer, Integer>();
		
		comboWhich.getItems().removeAll(comboWhich.getItems());
		comboWhich.getItems().addAll("colazione", "pranzo", "cena", "spuntino");
		comboWhich.getSelectionModel().select("pranzo");
		
		
		
		System.out.println(App.utente.getNomeutente());
		// TODO Auto-generated method stub
		btnRecipes.setOnAction(event -> {     	  
					try {
						Parent root;
						root = FXMLLoader.load(getClass().getResource("Recipes.fxml"));
						Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
						Scene scene = new Scene(root);
						stage.setScene(scene);
						stage.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}   	 
	            
	        });
		
		btnStats.setOnAction(event -> {
			try {
				Parent root;
				root = FXMLLoader.load(getClass().getResource("Stats.fxml"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		
		btnWorkout.setOnAction(event -> {
			int calorie = Integer.parseInt(nr.getText());
			GestisciWorkout.inserisciWorkout(App.utente.getIduser(), calorie);
		});
		
		btnFood.setOnAction(event -> {
			String name = txtFood.getText();		
			float fat = Float.parseFloat(txtFat.getText());	
			float protein = Float.parseFloat(txtProtein.getText());	
			float carbs = Float.parseFloat(txtCarbs.getText());	
			int amount = Integer.parseInt(txtFoodAmount.getText());	
			
			Integer id = GestisciAlimento.inserisciNuovoAlimento(name, carbs, protein, fat);
			if(id!=null) {
				food.put(name, id);
				foodAmount.put(id, amount);
				listFood.getItems().add(name);
				txtFood.clear();
				txtFat.clear();
				txtCarbs.clear();
				txtProtein.clear();
				txtFoodAmount.clear();
			}
			
		});
		
		btnRecipe.setOnAction(event -> {
			String name = txtRecName.getText();		
			int amount = Integer.parseInt(txtAmount.getText());	
			
			Integer id = GestisciRicetta.nuovaRicetta(name, amount);
			if(id!=null) {
				for(String k : food.keySet()) { //mappa di chiavi con id del cibo 
					GestisciComposizioneRicetta.ComposizioneRicetta(id,food.get(k), foodAmount.get(food.get(k)) );
				}
				
				food.clear();
				listFood.getItems().clear();
				txtRecName.clear();
				txtAmount.clear();
				
				recipe.put(name, id);
				listRecipes.getItems().add(name);
				
			}
			
		});
		
		btnMeal.setOnAction(event -> {
			String tipo = comboWhich.getValue();		
			int amount = Integer.parseInt(txtAmountDish.getText());	
			
			Integer id = GestisciPasto.inserisciPasto(App.utente.getIduser(), LocalDate.now(), tipo);
			if(id!=null) {
				for(String k : recipe.keySet()) { //mappa di chiavi con id del cibo 
					GestisciCreazionePasto.creazionePasto(id, recipe.get(k), amount);
				}
				
				recipe.clear();
				listRecipes.getItems().clear();
				txtAmountDish.clear();
			}
			
		});
		
		btnSettings.setOnAction(event -> {
			try {
				Parent root;
				root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
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
