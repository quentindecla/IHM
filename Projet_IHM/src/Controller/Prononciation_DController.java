package Controller;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;

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
import javafx.scene.control.Label;

public class Prononciation_DController implements Initializable{

	@FXML
	private JFXTextArea rep1, rep2, rep3, rep4, rep5, rep6, rep7, rep8;
	@FXML
	private ImageView img_q1, img2_q1, img_q2, img2_q2, img_q3, img2_q3, img_q4, img2_q4, img_q5, img2_q5, img_q6, img2_q6, img_q7, img2_q7, img_q8, img2_q8;
	@FXML
	private ImageView audio1, audio2, audio3, audio4, audio5, audio6, audio7, audio8;
	@FXML
	private JFXButton btn_valider, btn_retour;
	@FXML
	private Label correction1, correction2, correction3, correction4, correction5, correction6, correction7, correction8;
	@FXML
	private AnchorPane prononciation_container;
	
	private AudioInputStream A1_play, A2_play, A3_play, A4_play, A5_play, A6_play, A7_play, A8_play;
	
	public void check_answers() {
		if((!rep1.getText().equals("")) && (!rep2.getText().equals("")) && (!rep3.getText().equals("")) && (!rep4.getText().equals(""))
			&& (!rep5.getText().equals("")) && (!rep6.getText().equals("")) && (!rep7.getText().equals("")) && (!rep8.getText().equals(""))) {
				if(rep1.getText().toUpperCase().equals("BONJOUR")) {
					img_q1.setVisible(true);
					img2_q1.setVisible(false);
				}
				else {
					img2_q1.setVisible(true);
					img_q1.setVisible(false);
					correction1.setVisible(true);
				}
				
				if(rep2.getText().toUpperCase().equals("ATTAQUER")) {
					img_q2.setVisible(true);
					img2_q2.setVisible(false);
				}
				else {
					img2_q2.setVisible(true);
					img_q2.setVisible(false);
					correction2.setVisible(true);
				}
				
				if(rep3.getText().toUpperCase().equals("SUCRE")) {
					img_q3.setVisible(true);
					img2_q3.setVisible(false);
				}
				else {
					img2_q3.setVisible(true);
					img_q3.setVisible(false);
					correction3.setVisible(true);
				}
				
				if(rep4.getText().toUpperCase().equals("ÉCHEC")) {
					img_q4.setVisible(true);
					img2_q4.setVisible(false);
				}
				else {
					img2_q4.setVisible(true);
					img_q4.setVisible(false);
					correction4.setVisible(true);
				}
				
				if(rep5.getText().toUpperCase().equals("SUPPORTER")) {
					img_q5.setVisible(true);
					img2_q5.setVisible(false);
				}
				else {
					img2_q5.setVisible(true);
					img_q5.setVisible(false);
					correction5.setVisible(true);
				}
				
				if(rep6.getText().toUpperCase().equals("IMPOSSIBLE")) {
					img_q6.setVisible(true);
					img2_q6.setVisible(false);
				}
				else {
					img2_q6.setVisible(true);
					img_q6.setVisible(false);
					correction6.setVisible(true);
				}
				
				if(rep7.getText().toUpperCase().equals("ENCHANTER")) {
					img_q7.setVisible(true);
					img2_q7.setVisible(false);
				}
				else {
					img2_q7.setVisible(true);
					img_q7.setVisible(false);
					correction7.setVisible(true);
				}
				
				if(rep8.getText().toUpperCase().equals("DORMIR")) {
					img_q8.setVisible(true);
					img2_q8.setVisible(false);
				}
				else {
					img2_q8.setVisible(true);
					img_q8.setVisible(false);
					correction8.setVisible(true);
				}
				
				audio1.setVisible(true);
				audio2.setVisible(true);
				audio3.setVisible(true);
				audio4.setVisible(true);
				audio5.setVisible(true);
				audio6.setVisible(true);
				audio7.setVisible(true);
				audio8.setVisible(true);
		}
		else {
			System.out.println("Vous n'avez pas répondu à toutes les questions !");
		}
	}
	
	public void play_audio1() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		File f = new File("./audio/bonjour.wav");
		A1_play = AudioSystem.getAudioInputStream(f.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(A1_play);
		clip.start();
	}
	
	public void play_audio2() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		File f = new File("./audio/attaquer.wav");
		A2_play = AudioSystem.getAudioInputStream(f.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(A2_play);
		clip.start();
	}
	
	public void play_audio3() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		File f = new File("./audio/sucre.wav");
		A3_play = AudioSystem.getAudioInputStream(f.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(A3_play);
		clip.start();
	}
	
	public void play_audio4() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		File f = new File("./audio/echec.wav");
		A4_play = AudioSystem.getAudioInputStream(f.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(A4_play);
		clip.start();
	}
	
	public void play_audio5() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		File f = new File("./audio/supporter.wav");
		A5_play = AudioSystem.getAudioInputStream(f.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(A5_play);
		clip.start();
	}
	
	public void play_audio6() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		File f = new File("./audio/impossible.wav");
		A6_play = AudioSystem.getAudioInputStream(f.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(A6_play);
		clip.start();
	}
	
	public void play_audio7() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		File f = new File("./audio/enchanter.wav");
		A7_play = AudioSystem.getAudioInputStream(f.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(A7_play);
		clip.start();
	}
	
	public void play_audio8() throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		File f = new File("./audio/dormir.wav");
		A8_play = AudioSystem.getAudioInputStream(f.toURI().toURL());
		Clip clip = AudioSystem.getClip();
		clip.open(A8_play);
		clip.start();
	}
	
	public void back_to_Atelier() throws Exception {
		//Ouverture Ecran Atelier au clic bouton
		Stage atelier_stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../FXML/Atelier.fxml")); 	
		Scene atelier_scene = new Scene(root);
		atelier_stage.setTitle("Workshop");
		atelier_stage.setScene(atelier_scene);
		atelier_stage.setResizable(false);
		atelier_stage.show();
						
		//Fermeture de l'ecran actuel
		Stage screen = (Stage)prononciation_container.getScene().getWindow();
		screen.close();
		System.out.println("Fermeture de Prononciation");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
