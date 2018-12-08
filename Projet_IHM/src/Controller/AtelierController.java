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
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initialize_cb();
	}

}
