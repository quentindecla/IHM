package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import com.jfoenix.controls.JFXButton;

public class OutilController {
	@FXML
	private JFXButton back_mp_1, practice_tps;
	@FXML
	private TabPane outil_container;

	public void Go_To_Mp() throws Exception{
		//Ouverture Ecran Atelier au clic bouton
		Stage mp_stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/Menu_Principal.fxml")); 	
		Scene mp_scene = new Scene(root);
		mp_stage.setTitle("Main Menu");
		mp_stage.setScene(mp_scene);
		mp_stage.setResizable(false);
		mp_stage.show();
						
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)outil_container.getScene().getWindow();
		screen.close();
		System.out.println("Fermeture de l'atelier");
	}
	
	public void Go_To_Temps() throws Exception {
		Stage tps_stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/Temps_et_Conjugaison_D.fxml")); 	
		Scene tps_scene = new Scene(root);
		tps_stage.setTitle("Exercise - Tense & Conjugation");
		tps_stage.setScene(tps_scene);
		tps_stage.setResizable(false);
		tps_stage.show();
				
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)outil_container.getScene().getWindow();
		screen.close();
		System.out.println("Fermeture de l'atelier");

	}
	
	public void Go_To_Grammaire() throws Exception{
		//Ouverture Ecran Atelier au clic bouton
		Stage grammaire_stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/Grammaire_D.fxml")); 	
		Scene grammaire_scene = new Scene(root);
		grammaire_stage.setTitle("Exercice - Grammar");
		grammaire_stage.setScene(grammaire_scene);
		grammaire_stage.setResizable(false);
		grammaire_stage.show();
						
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)outil_container.getScene().getWindow();
		screen.close();
		System.out.println("Fermeture de l'atelier");
	}
}
