package it.trackme.TM_fxml;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RecipeApp extends Application {

    private TextArea recipeTextArea;

    @Override
    public void start(Stage primaryStage) {
        // Creazione dei bottoni per selezionare le ricette
        Button pastaButton = new Button("Pasta al Pomodoro");
        Button chickenButton = new Button("Petto di Pollo");
        Button salmonButton = new Button("Salmone alla Piastra");

        // Creazione dell'area di testo per mostrare le ricette
        recipeTextArea = new TextArea();
        recipeTextArea.setEditable(false);
        recipeTextArea.setWrapText(true);

        // Disposizione dei componenti all'interno dell'AnchorPane
        AnchorPane.setTopAnchor(pastaButton, 20.0);
        AnchorPane.setLeftAnchor(pastaButton, 20.0);
        AnchorPane.setTopAnchor(chickenButton, 60.0);
        AnchorPane.setLeftAnchor(chickenButton, 20.0);
        AnchorPane.setTopAnchor(salmonButton, 100.0);
        AnchorPane.setLeftAnchor(salmonButton, 20.0);
        AnchorPane.setTopAnchor(recipeTextArea, 140.0);
        AnchorPane.setLeftAnchor(recipeTextArea, 20.0);
        AnchorPane.setRightAnchor(recipeTextArea, 20.0);
        AnchorPane.setBottomAnchor(recipeTextArea, 20.0);

        // Aggiunta dei bottoni e dell'area di testo all'AnchorPane
        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(pastaButton, chickenButton, salmonButton, recipeTextArea);

        // Gestione degli eventi dei bottoni
        pastaButton.setOnAction(event -> displayRecipe("Pasta al Pomodoro", "Ricetta per la pasta al pomodoro..."));
        chickenButton.setOnAction(event -> displayRecipe("Petto di Pollo", "Ricetta per il petto di pollo..."));
        salmonButton.setOnAction(event -> displayRecipe("Salmone alla Piastra", "Ricetta per il salmone alla piastra..."));

        // Creazione della scena e visualizzazione della finestra
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Recipe App");
        primaryStage.show();
    }

    // Metodo per mostrare la ricetta selezionata
    private void displayRecipe(String title, String recipe) {
        recipeTextArea.setText(title + ":\n\n" + recipe);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
