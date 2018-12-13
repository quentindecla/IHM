package Controller;
//scroolpane
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;

import com.jfoenix.controls.JFXButton;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Verbes_Irreguliers_DController {

	@FXML
	private VBox v_box;
	@FXML
	private HBox hbox1;
	@FXML
	private TextArea PRET_avoir;
	@FXML
	private TextArea PP_avoir;
	@FXML
	private TextArea PRET_etre;
	@FXML
	private TextArea PP_etre;
	@FXML
	private TextArea PRET_trouver;
	@FXML
	private TextArea PP_trouver;
	@FXML
	private TextArea PRET_marcher;
	@FXML
	private TextArea PP_marcher;
	@FXML
	private TextArea PRET_construire;
	@FXML
	private TextArea PP_construire;
	@FXML
	private TextArea PRET_finir;
	@FXML
	private TextArea PP_finir;
	@FXML
	private TextArea PRET_tenir;
	@FXML
	private TextArea PP_tenir;
	@FXML
	private TextArea PRET_choisir;
	@FXML
	private TextArea PP_choisir;
	@FXML
	private JFXButton return_btn;
	@FXML
	private JFXButton check_btn;
	@FXML
	private AnchorPane scene_verb_irre;
	
	public void retour_Atelier() throws Exception{     
		Stage stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/Atelier.fxml")); 	
		Scene scene = new Scene(root);
		stage.setTitle("Exercice");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
				
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)scene_verb_irre.getScene().getWindow();
		screen.close();
	}

	
	public void validation() {
		String imp_avoir = PRET_avoir.getText();
		String pp_avoir = PP_avoir.getText();
		String imp_etre = PRET_etre.getText();
		String pp_etre = PP_etre.getText();
		String imp_trouver = PRET_trouver.getText();
		String pp_trouver = PP_trouver.getText();
		String imp_marcher = PRET_marcher.getText();
		String pp_marcher = PP_marcher.getText();
		String imp_construire = PRET_construire.getText();
		String pp_construire = PP_construire.getText();
		String imp_finir = PRET_finir.getText();
		String pp_finir = PP_finir.getText();
		String imp_tenir = PRET_tenir.getText();
		String pp_tenir = PP_tenir.getText();
		String imp_choisir = PRET_choisir.getText();
		String pp_choisir = PP_choisir.getText();
		
		if (imp_avoir.equals("") || pp_avoir.equals("") || imp_etre.equals("") || pp_etre.equals("") || imp_trouver.equals("") || pp_trouver.equals("") || imp_marcher.equals("") || pp_marcher.equals("") || imp_construire.equals("") || pp_construire.equals("") || imp_finir.equals("") || pp_finir.equals("") || imp_tenir.equals("") || pp_tenir.equals("") || imp_choisir.equals("") || pp_choisir.equals("")){
		}
		else
		{	if (imp_avoir.toUpperCase().equals("AVIONS")) {
				//System.out.println("bien dans boucle");
				PRET_avoir.setStyle("-fx-background-color: lime");
			}else
			{	PRET_avoir.setStyle("-fx-background-color: firebrick");
			}
			if (pp_avoir.toUpperCase().equals("EU")) {
				PP_avoir.setStyle("-fx-background-color: lime");
			}else
			{	PP_avoir.setStyle("-fx-background-color: firebrick");
			}
		
		
			if (imp_etre.toUpperCase().equals("ÉTAIS")) {
				PRET_etre.setStyle("-fx-background-color: lime");
			}else
			{	PRET_etre.setStyle("-fx-background-color: firebrick");
			}
			if (pp_etre.toUpperCase().equals("ÉTÉ")) {
				PP_etre.setStyle("-fx-background-color: lime");
			}else
			{	PP_etre.setStyle("-fx-background-color: firebrick");
			}
		
		
			if (imp_trouver.toUpperCase().equals("TROUVAIS")) {
				PRET_trouver.setStyle("-fx-background-color: lime");
			}else
			{	PRET_trouver.setStyle("-fx-background-color: firebrick");
			}
			if (pp_trouver.toUpperCase().equals("TROUVÉ")) {
				PP_trouver.setStyle("-fx-background-color: lime");
			}else
			{	PP_trouver.setStyle("-fx-background-color: firebrick");
			}
		
		
			if (imp_marcher.toUpperCase().equals("MARCHAIENT")) {
				PRET_marcher.setStyle("-fx-background-color: lime");
			}else
			{	PRET_marcher.setStyle("-fx-background-color: firebrick");
			}
			if (pp_marcher.toUpperCase().equals("MARCHÉ")) {
				PP_marcher.setStyle("-fx-background-color: lime");
			}else
			{	PP_marcher.setStyle("-fx-background-color: firebrick");
			}
		
		
			if (imp_construire.toUpperCase().equals("CONSTRUISIEZ")) {
				PRET_construire.setStyle("-fx-background-color: lime");
			}else
			{	PRET_construire.setStyle("-fx-background-color: firebrick");
			}
			if (pp_construire.toUpperCase().equals("CONSTRUIT")) {
				PP_construire.setStyle("-fx-background-color: lime");
			}else
			{	PP_construire.setStyle("-fx-background-color: firebrick");
			}
		
		
			if (imp_finir.toUpperCase().equals("FINISSIONS")) {
				PRET_finir.setStyle("-fx-background-color: lime");
			}else
			{	PRET_finir.setStyle("-fx-background-color: firebrick");
			}
			if (pp_finir.toUpperCase().equals("FINI")) {
				PP_finir.setStyle("-fx-background-color: lime");
			}else
			{	PP_finir.setStyle("-fx-background-color: firebrick");
			}
		
		
			if (imp_tenir.toUpperCase().equals("TENAIT")) {
				PRET_tenir.setStyle("-fx-background-color: lime");
			}else
			{	PRET_tenir.setStyle("-fx-background-color: firebrick");
			}
			if (pp_tenir.toUpperCase().equals("TENU")) {
				PP_tenir.setStyle("-fx-background-color: lime");
			}else
			{	PP_tenir.setStyle("-fx-background-color: firebrick");
			}
		
		
			if (imp_choisir.toUpperCase().equals("CHOISISSAIT")) {
				PRET_choisir.setStyle("-fx-background-color: lime");
			}else
			{	PRET_choisir.setStyle("-fx-background-color: firebrick");
			}
			if (pp_choisir.toUpperCase().equals("CHOISI")) {
				PP_choisir.setStyle("-fx-background-color: lime");
			}else
			{	PP_choisir.setStyle("-fx-background-color: firebrick");
			}
		
		}
	}

}
