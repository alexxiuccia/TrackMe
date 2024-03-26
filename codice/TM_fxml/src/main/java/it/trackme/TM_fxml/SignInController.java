package it.trackme.TM_fxml;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.trackme.TM_logic.GestisciUtente;
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
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class SignInController implements Initializable {

	@FXML
	private Button btnSub;

	@FXML
	private ComboBox<String> comboLife;

	@FXML
	private DatePicker dateBirth;

	@FXML
	private Spinner<Integer> txtHeight;

	@FXML
	private TextField txtMail;

	@FXML
	private TextField txtName;

	@FXML
	private TextField txtPwd;

	@FXML
	private TextField txtSurname;

	@FXML
	private Spinner<Integer> txtWeight;

	@FXML
	private Spinner<Integer> txtAnni;

	/*
	 * @Override public void initialize(URL location, ResourceBundle resources) { //
	 * Aggiungi le opzioni alla ComboBox
	 * comboLife.getItems().addAll("non molto attivo", "leggermente attivo",
	 * "attivo", "molto attivo"); }
	 */

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comboLife.getItems().removeAll(comboLife.getItems());
		comboLife.getItems().addAll("non molto attivo", "leggermente attivo", "attivo", "molto attivo");
		comboLife.getSelectionModel().select("attivo");

		// Creazione di SpinnerValueFactory separati per ogni Spinner
		SpinnerValueFactory<Integer> weightValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 200,
				50);
		SpinnerValueFactory<Integer> heightValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 200,
				50);
		SpinnerValueFactory<Integer> anniValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 200, 50);

		// Impostazione dei SpinnerValueFactory per gli Spinner
		txtWeight.setValueFactory(weightValueFactory);
		txtHeight.setValueFactory(heightValueFactory);
		txtAnni.setValueFactory(anniValueFactory);

		// Opzionalmente, puoi abilitare l'editabilità degli Spinner
		txtWeight.setEditable(true);
		txtHeight.setEditable(true);
		txtAnni.setEditable(true);

		// TODO Auto-generated method stub
		btnSub.setOnAction(event -> {
			String username = txtMail.getText();
			String name = txtName.getText();
			String surname = txtSurname.getText();

			LocalDate selectedDate = dateBirth.getValue();

			String password = txtPwd.getText();

			int peso = txtWeight.getValue();
			int altezza = txtHeight.getValue();
			int anni = txtAnni.getValue();
			String attivita = comboLife.getValue();

			int calories = (int) ((10 * peso) + (6.25 * altezza) - (5 * anni));

			if (GestisciUtente.registraUtente(username, name, surname, selectedDate, peso, altezza, anni, attivita,
					password, calories)) {
				System.out.println("Username: " + username);
				System.out.println("Password: " + password);
				App.utente = GestisciUtente.accessoUtente(username, password);
				if (App.utente != null) {
					System.out.println(App.utente);
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
			} else {
				System.err.println("Fallita registrazione");
			}

		});
	}
}
