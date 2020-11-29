package pl.kognitywistyka.ppa202101.backend;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SampleController {
	
	protected Scene otherScene;
	protected Stage mainStage;

	protected Scene scene;

	public Stage getMainStage() {
		return mainStage;
	}

	public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
	}

	public Scene getOtherScene() {
		return otherScene;
	}

	public void setOtherScene(Scene otherScene) {
		this.otherScene = otherScene;
	}


	public void setScene(Scene scene){
		this.scene=scene;
	}

	@FXML TextArea textArea;

	@FXML public void about(ActionEvent event) {
		textArea.textProperty().set("You clicked on 'About'");
	}

	@FXML public void podmianka(ActionEvent event) throws IOException {

		//mainStage.setScene(otherScene);

		try{
			FXMLLoader SceneLoader = new FXMLLoader(getClass().getResource("Other.fxml"));
			BorderPane SceneRoot = SceneLoader.load();
			OtherController OtherController = SceneLoader.getController();

			scene.setRoot(SceneRoot);

			OtherController.setScene(this.scene);
			OtherController.setMainStage(this.mainStage);

		} catch (IOException e1) {
			e1.printStackTrace();
		}


	}
	
}
