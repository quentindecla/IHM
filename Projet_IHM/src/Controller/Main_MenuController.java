package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main_MenuController implements Initializable{
	@FXML
	private AnchorPane mm_eng;
	@FXML
	private JFXButton back_btn;
	
	public void Back_To_French_Menu() throws Exception{
		Stage mp_fr_stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/Menu_Principal.fxml"));
		Scene mp_fr_scene = new Scene(root);
		mp_fr_stage.setTitle("Atelier");
		mp_fr_stage.setScene(mp_fr_scene);
		mp_fr_stage.setResizable(false);
		mp_fr_stage.show();
		System.out.println("Back To French Menu");
				
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)mm_eng.getScene().getWindow();
		screen.close();
	}
	
	@Override	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
