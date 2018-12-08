package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Menu_PrincipalController implements Initializable{
	@FXML
	private Button atelier_btn;
	@FXML
	private AnchorPane screen_container;
	@FXML
	private Button leave_btn;
	@FXML
	private Label intro_label;

	public void Open_Atelier() throws Exception{
		//Ouverture Ecran Atelier au clic bouton
		Stage atelier_stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Atelier.fxml"));
		Scene atelier_scene = new Scene(root);
		atelier_stage.setTitle("Atelier");
		atelier_stage.setScene(atelier_scene);
		atelier_stage.show();
		
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)screen_container.getScene().getWindow();
		screen.close();
		System.out.println("Fermeture du menu principal");
	}
	
	private void initialize_label() {
		intro_label.setText("Bienvenue, ici apprendre fran�ais blablabla\r\n" + 
				"d�couvrir mon pays ? L'onglet magazine blabla\r\n" + 
				"Vous souhaitez �valuer botre lvl, go exercice dans atelier\r\n" + 
				"si vous avez des doutes ou questions en avant pour Outil aidera vous\r\n");
	}

	public void Leave() {
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)screen_container.getScene().getWindow();
		screen.close();
		System.out.println("Fermeture de l'application");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initialize_label();
	}
}