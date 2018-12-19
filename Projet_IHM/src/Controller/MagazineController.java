package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;

import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;

public class MagazineController {
	@FXML
	private TabPane tabpane;
	@FXML
	private Tab localisation;
	@FXML
	private JFXButton btn1;
	@FXML
	private JFXButton btn2;
	@FXML
	private JFXButton btn3;

	public void Back_to_Menu() throws Exception{     
		Stage stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/Menu_Principal.fxml")); 	
		Scene scene = new Scene(root);
		stage.setTitle("MultiLingo - Workshop");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
				
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)tabpane.getScene().getWindow();
		screen.close();
	}

}
