package Controller;


import javafx.fxml.FXML;



import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
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
	@FXML
	private JFXButton btn_confirm;
	@FXML
	private JFXButton btn_retour;
	

	
	public void initialize_cb() {
		choice_box1.setItems(FXCollections.observableArrayList("vécûmes", "vivions"));
		choice_box2.setItems(FXCollections.observableArrayList("annonça", "annonçait"));
		choice_box3.setItems(FXCollections.observableArrayList("passèrent", "passaient"));
		choice_box4.setItems(FXCollections.observableArrayList("loua", "louait"));
		choice_box5.setItems(FXCollections.observableArrayList("laboura", "labourait"));
		choice_box6.setItems(FXCollections.observableArrayList("tomba", "tombait"));
		choice_box7.setItems(FXCollections.observableArrayList("marchai", "marchais"));
		choice_box8.setItems(FXCollections.observableArrayList("vis", "voyais"));
		choice_box9.setItems(FXCollections.observableArrayList("écrivit", "écrivait"));
		choice_box10.setItems(FXCollections.observableArrayList("téléphona", "téléphonait"));
	}
	
	
	public void retour_Atelier() throws Exception{     
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../FXML/Atelier.fxml")); 	
			Scene scene = new Scene(root);
			stage.setTitle("MultiLingo - Workshop");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
					
			//Fermeture de l'ecran actuel
			Stage screen = (Stage)scene_tps_conjug.getScene().getWindow();
			screen.close();
	}
	
	@FXML public void validation (ActionEvent event) {
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
		
		//System.out.println("Tu as bien cliqué sur valider");
		
		if(selectedChoice1 == "vivions"){
			choice_box1.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice1 == "vécûmes"){
			choice_box1.setStyle("-fx-background-color: firebrick");
		}
		
		if(selectedChoice2 == "annonça"){
			choice_box2.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice2 == "annonçait"){
			choice_box2.setStyle("-fx-background-color: firebrick");
		}
		
		if(selectedChoice3 == "passaient"){
			choice_box3.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice3 == "passèrent"){
			choice_box3.setStyle("-fx-background-color: firebrick");
		}
		
		if(selectedChoice4 == "loua"){
			choice_box4.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice4 == "louait"){
			choice_box4.setStyle("-fx-background-color: firebrick");
		}
		
		if(selectedChoice5 == "labourait"){
			choice_box5.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice5 == "laboura"){
			choice_box5.setStyle("-fx-background-color: firebrick");
		}
		
		if(selectedChoice6 == "tomba"){
			choice_box6.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice6 == "tombait"){
			choice_box6.setStyle("-fx-background-color: firebrick");
		}
		
		if(selectedChoice7 == "marchais"){
			choice_box7.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice7 == "marchai"){
			choice_box7.setStyle("-fx-background-color: firebrick");
		}
		
		if(selectedChoice8 == "vis"){
			choice_box8.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice8 == "voyais"){
			choice_box8.setStyle("-fx-background-color: firebrick");
		}
		
		if(selectedChoice9 == "écrivait"){
			choice_box9.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice9 == "écrivit"){
			choice_box9.setStyle("-fx-background-color: firebrick");
		}
		
		if(selectedChoice10 == "téléphona"){
			choice_box10.setStyle("-fx-background-color: lime");
		}
		else if(selectedChoice10 == "téléphonait"){
			choice_box10.setStyle("-fx-background-color: firebrick");
		}
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initialize_cb();
	}
}
