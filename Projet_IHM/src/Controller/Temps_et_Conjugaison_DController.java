package Controller;


import javafx.fxml.FXML;

import java.beans.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Labeled;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ChoiceBox;

public class Temps_et_Conjugaison_DController implements Initializable {
	@FXML
	private ChoiceBox<String> choice_box1;
	@FXML
	private ChoiceBox<String> choice_box2;
	@FXML
	private ChoiceBox<String> choice_box10;
	@FXML
	private ChoiceBox<String> choice_box9;
	@FXML
	private ChoiceBox<String> choice_box7;
	@FXML
	private ChoiceBox<String> choice_box8;
	@FXML
	private ChoiceBox<String> choice_box6;
	@FXML
	private ChoiceBox<String> choice_box5;
	@FXML
	private ChoiceBox<String> choice_box4;
	@FXML
	private ChoiceBox<String> choice_box3;
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
	
	public void ouverture_conjug() throws Exception{
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
	
	public void exo_debutant_text_trou() throws Exception{
		if((choice_box1.getValue() == null) || (choice_box2.getValue() == null) || (choice_box3.getValue() == null) || (choice_box10.getValue() == null) || (choice_box4.getValue() == null) || (choice_box5.getValue() == null) || (choice_box6.getValue() == null) || (choice_box7.getValue() == null) || (choice_box8.getValue() == null) || (choice_box9.getValue() == null)){
			System.out.println("Erreur, vous n'avez pas rempli tous les champs !");
		}
		}
	
	
	public void launch_validation_ex1() throws Exception{
		String selectedChoice1 = choice_box1.getSelectionModel().getSelectedItem();
		String selectedChoice2 = choice_box2.getSelectionModel().getSelectedItem();
		String selectedChoice3 = choice_box3.getSelectionModel().getSelectedItem();
		String selectedChoice4 = choice_box4.getSelectionModel().getSelectedItem();
		String selectedChoice5 = choice_box5.getSelectionModel().getSelectedItem();
		String selectedChoice6 = choice_box6.getSelectionModel().getSelectedItem();
		String selectedChoice7 = choice_box7.getSelectionModel().getSelectedItem();
		String selectedChoice8 = choice_box8.getSelectionModel().getSelectedItem();
		String selectedChoice9 = choice_box9.getSelectionModel().getSelectedItem();
		String selectedChoice10 = choice_box10.getSelectionModel().getSelectedItem();
		Button btn_confirm = new Button();
		
	
		btn_confirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hello World!");
            }
        });
		if((choice_box1.getValue() == null) || (choice_box2.getValue() == null) || (choice_box3.getValue() == null) || (choice_box10.getValue() == null) || (choice_box4.getValue() == null) || (choice_box5.getValue() == null) || (choice_box6.getValue() == null) || (choice_box7.getValue() == null) || (choice_box8.getValue() == null) || (choice_box9.getValue() == null)){
			System.out.println("Erreur, vous n'avez pas rempli tous les champs !");
			choice_box1.getStylesheets().add("-fx-background-color: red");
		}
		else if(selectedChoice1 != "vivions"){
	 
	        choice_box1.getStylesheets().add("-fx-background-color: red");
	        
			Stage ex1_stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../FXML/Temps_et_Conjugaison_D.fxml")); 	
			Scene ex1_scene = new Scene(root);
			ex1_stage.setTitle("Exercice - Temps & Conjugaison");
			ex1_stage.setScene(ex1_scene);
			ex1_stage.setResizable(false);
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
