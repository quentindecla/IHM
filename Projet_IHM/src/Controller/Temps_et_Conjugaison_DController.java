package Controller;


import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;


import javafx.scene.control.ChoiceBox;

public class Temps_et_Conjugaison_DController implements Initializable {
	@FXML
	private ChoiceBox<String> choice_box1;
	@FXML
	private ChoiceBox choice_box2;
	@FXML
	private ChoiceBox choice_box10;
	@FXML
	private ChoiceBox choice_box9;
	@FXML
	private ChoiceBox choice_box7;
	@FXML
	private ChoiceBox choice_box8;
	@FXML
	private ChoiceBox choice_box6;
	@FXML
	private ChoiceBox choice_box5;
	@FXML
	private ChoiceBox choice_box4;
	@FXML
	private ChoiceBox choice_box3;
	@FXML
	private AnchorPane scene_tps_conjug;
	

	
	public void initialize_cb() {
		choice_box1.setItems(FXCollections.observableArrayList("gergerg", "gegerger", "gergerger"));//choice_box1.setItems(FXCollections.observableArrayList("vécumes", "vivions"));
		/*choice_box2.setItems(FXCollections.observableArrayList("annonça", "annonçait"));
		choice_box3.setItems(FXCollections.observableArrayList("passèrent", "passaient"));
		choice_box4.setItems(FXCollections.observableArrayList("loua", "louait"));
		choice_box5.setItems(FXCollections.observableArrayList("laboura", "labourait"));
		choice_box6.setItems(FXCollections.observableArrayList("tomba", "tombait"));
		choice_box7.setItems(FXCollections.observableArrayList("marchai", "marchais"));
		choice_box8.setItems(FXCollections.observableArrayList("vis", "voyais"));
		choice_box9.setItems(FXCollections.observableArrayList("écrivit", "écrivait"));
		choice_box10.setItems(FXCollections.observableArrayList("téléphona", "téléphonait"));*/
	}
	
	public void return_to_menu() throws Exception{
		//Ouverture Ecran Conjugaison et temps au clic bouton
		Stage mp_stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/AtelierController.fxml")); 	
		Scene mp_scene = new Scene(root);
		mp_stage.setTitle("Exercice");
		mp_stage.setResizable(false);
		mp_stage.setScene(mp_scene);
		mp_stage.show();
				
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)scene_tps_conjug.getScene().getWindow();
		screen.close();
		System.out.println("Fermeture de l'exercice de conjugaison");
	}
	
	public void exo_debutant() throws Exception{
		if((choice_box1.getValue() == null) || (choice_box2.getValue() == null) || (choice_box3.getValue() == null) || (choice_box10.getValue() == null) || (choice_box4.getValue() == null) || (choice_box5.getValue() == null) || (choice_box6.getValue() == null) || (choice_box7.getValue() == null) || (choice_box8.getValue() == null) || (choice_box9.getValue() == null)){
			System.out.println("Erreur, vous n'avez pas rempli tous les champs !");
		}
		else if(choice_box1.getValue() == "vivions"){
			System.out.println("choix verbe : " + choice_box1.getValue());
			
			Stage ex1_stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../FXML/Temps_et_Conjugaison_D.fxml")); 	
			Scene ex1_scene = new Scene(root);
			ex1_stage.setTitle("Exercice - Temps & Conjugaison");
			ex1_stage.setScene(ex1_scene);
			ex1_stage.show();
					
			//Fermeture de l'ecran actuel
			Stage screen = (Stage)scene_tps_conjug.getScene().getWindow();
			screen.close();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initialize_cb();
	}
}
