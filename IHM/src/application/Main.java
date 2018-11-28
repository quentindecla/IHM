package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*matthieu.coumates@capgemini.com*/

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Magazines.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Magazines");
		primaryStage.setScene(scene);
		primaryStage.show();
		/* balba*/
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
