package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;

public class AtelierController implements Initializable{
	@FXML
	private Button return_to_menu;
	@FXML
	private ImageView fr_flag;
	@FXML
	private ChoiceBox<String> difficulty_cb;
	@FXML
	private AnchorPane screen_atelier;
	
	public void initialize_cb() {
		difficulty_cb.setItems(FXCollections.observableArrayList("Débutant", "Intermédiaire", "Expert"));
	}
	
	public void return_to_menu() throws Exception{
		//Ouverture Ecran Atelier au clic bouton
		Stage mp_stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/Menu_Principal.fxml")); 	
		Scene mp_scene = new Scene(root);
		mp_stage.setTitle("Menu Principal");
		mp_stage.setScene(mp_scene);
		mp_stage.show();
				
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)screen_atelier.getScene().getWindow();
		screen.close();
		System.out.println("Fermeture de l'atelier");
	}
	
	public void launch_ex1() throws Exception{
		if(difficulty_cb.getValue() == null) {
			System.out.println("Erreur, vous n'avez pas choisi de difficulté !");
		}
		else if(difficulty_cb.getValue() == "Débutant"){
			System.out.println("Difficulté : " + difficulty_cb.getValue());
			
			Stage ex1_stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../FXML/Temps_et_Conjugaison_D.fxml")); 	
			Scene ex1_scene = new Scene(root);
			ex1_stage.setTitle("Exercice - Temps & Conjugaison");
			ex1_stage.setScene(ex1_scene);
			ex1_stage.show();
					
			//Fermeture de l'ecran actuel
			Stage screen = (Stage)screen_atelier.getScene().getWindow();
			screen.close();
		}
	}
	
	public void launch_ex2() throws Exception{
		if(difficulty_cb.getValue() == null) {
			System.out.println("Erreur, vous n'avez pas choisi de difficulté !");
		}
		else if(difficulty_cb.getValue() == "Débutant"){
			System.out.println("Difficulté : " + difficulty_cb.getValue());
			
			Stage ex2_stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../FXML/Grammaire_D.fxml")); 	
			Scene ex2_scene = new Scene(root);
			ex2_stage.setTitle("Exercice - Grammaire");
			ex2_stage.setScene(ex2_scene);
			ex2_stage.show();
					
			//Fermeture de l'ecran actuel
			Stage screen = (Stage)screen_atelier.getScene().getWindow();
			screen.close();
		}
	}
	
	public void launch_ex3() throws Exception{
		if(difficulty_cb.getValue() == null) {
			System.out.println("Erreur, vous n'avez pas choisi de difficulté !");
		}
		else if(difficulty_cb.getValue() == "Débutant"){
			System.out.println("Difficulté : " + difficulty_cb.getValue());
			
			Stage ex3_stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../FXML/Verbes_Irreguliers_D.fxml")); 	
			Scene ex3_scene = new Scene(root);
			ex3_stage.setTitle("Exercice - Verbes Irréguliers");
			ex3_stage.setScene(ex3_scene);
			ex3_stage.show();
					
			//Fermeture de l'ecran actuel
			Stage screen = (Stage)screen_atelier.getScene().getWindow();
			screen.close();
		}
	}
		
	public void launch_ex4() throws Exception{
		if(difficulty_cb.getValue() == null) {
			System.out.println("Erreur, vous n'avez pas choisi de difficulté !");
		}
		else if(difficulty_cb.getValue() == "Débutant"){
			System.out.println("Difficulté : " + difficulty_cb.getValue());
			
			Stage ex4_stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../FXML/Grammaire.fxml")); 	
			Scene ex4_scene = new Scene(root);
			ex4_stage.setTitle("Exercice - Prononciation_D");
			ex4_stage.setScene(ex4_scene);
			ex4_stage.show();
					
			//Fermeture de l'ecran actuel
			Stage screen = (Stage)screen_atelier.getScene().getWindow();
			screen.close();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initialize_cb();
	}

}
