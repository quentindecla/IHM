package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Grammaire_DController implements Initializable{
	@FXML
	private JFXRadioButton true1, true2, true3, true4, true5, true6, true7, true8;
	@FXML
	private JFXRadioButton false1, false2, false3, false4, false5, false6, false7, false8;
	@FXML
	private Pane correc_q2, correc_q5, correc_q7;
	@FXML
	private ImageView img_q1, img2_q1, img_q2, img2_q2, img_q3, img2_q3, img_q4, img2_q4, img_q5, img2_q5, img_q6, img2_q6, img_q7, img2_q7, img_q8, img2_q8;
	@FXML
	private JFXButton btn_valider, btn_retour;
	@FXML
	private AnchorPane grammaire_container;
	@FXML
	private ToggleGroup group = new ToggleGroup();
	@FXML
	private ToggleGroup group1 = new ToggleGroup();
	@FXML
	private ToggleGroup group2 = new ToggleGroup();
	@FXML
	private ToggleGroup group3 = new ToggleGroup();
	@FXML
	private ToggleGroup group4 = new ToggleGroup();
	@FXML
	private ToggleGroup group5 = new ToggleGroup();
	@FXML
	private ToggleGroup group6 = new ToggleGroup();
	@FXML
	private ToggleGroup group7 = new ToggleGroup();
	
	
	
	public void check_answers() {
		if((true1.isSelected() || false1.isSelected()) && (true2.isSelected() || false2.isSelected()) && (true3.isSelected() || false3.isSelected())
			&& (true4.isSelected() || false4.isSelected()) && (true5.isSelected() || false5.isSelected()) && (true6.isSelected() || false6.isSelected())
			&& (true7.isSelected() || false7.isSelected()) && (true8.isSelected() || false8.isSelected())){
				//Question 1
				if(true1.isSelected()){
					img_q1.setVisible(true);
					img2_q1.setVisible(false);
				}
				else if(false1.isSelected()) {
					img2_q1.setVisible(true);
					img_q1.setVisible(false);
				}
				
				//Question 2
				if(true2.isSelected()){
					img2_q2.setVisible(true);
					img_q2.setVisible(false);
				}
				else if(false2.isSelected()) {
					img_q2.setVisible(true);
					img2_q2.setVisible(false);
				}
				
				//Question 3
				if(true3.isSelected()){
					img_q3.setVisible(true);
					img2_q3.setVisible(false);
				}
				else if(false3.isSelected()) {
					img2_q3.setVisible(true);
					img_q3.setVisible(false);
				}
				
				//Question 4
				if(true4.isSelected()){
					img_q4.setVisible(true);
					img2_q4.setVisible(false);
				}
				else if(false4.isSelected()) {
					img2_q4.setVisible(true);
					img_q4.setVisible(false);
				}
				
				//Question 5
				if(true5.isSelected()){
					img2_q5.setVisible(true);
					img_q5.setVisible(false);
				}
				else if(false5.isSelected()) {
					img_q5.setVisible(true);
					img2_q5.setVisible(false);
				}
				
				//Question 6
				if(true6.isSelected()){
					img_q6.setVisible(true);
					img2_q6.setVisible(false);
				}
				else if(false6.isSelected()) {
					img2_q6.setVisible(true);
					img_q6.setVisible(false);
				}
				
				//Question 7
				if(true7.isSelected()){
					img2_q7.setVisible(true);
					img_q7.setVisible(false);
				}
				else if(false7.isSelected()) {
					img_q7.setVisible(true);
					img2_q7.setVisible(false);
				}
				
				//Question 8
				if(true8.isSelected()){
					img_q8.setVisible(true);
					img2_q8.setVisible(false);
				}
				else if(false8.isSelected()) {
					img2_q8.setVisible(true);
					img_q8.setVisible(false);
				}
					
				correc_q2.setVisible(true);
				correc_q5.setVisible(true);
				correc_q7.setVisible(true);
				
		}
		else {
			System.out.println("Vous n'avez pas répondu à toutes les questions !");
		}
	}
	
	public void back_btn() throws Exception{
		//Ouverture Ecran Atelier au clic bouton
		Stage atelier_stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/Atelier.fxml")); 	
		Scene atelier_scene = new Scene(root);
		atelier_stage.setTitle("MultiLingo - Workshop");
		atelier_stage.setScene(atelier_scene);
		atelier_stage.setResizable(false);
		atelier_stage.show();
						
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)grammaire_container.getScene().getWindow();
		screen.close();
		System.out.println("Fermeture de Grammaire");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
