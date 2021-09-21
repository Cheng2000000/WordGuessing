package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuizSceneController {
	
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void submit(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("QuizScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void replay(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("QuizScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void skip(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("QuizScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
