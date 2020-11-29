package pl.kognitywistyka.ppa202101.backend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class OtherController {
	
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

	@FXML public void podmianka(ActionEvent event) {

		//mainStage.setScene(otherScene);

		try{
			FXMLLoader SceneLoader2 = new FXMLLoader(getClass().getResource("Sample.fxml"));
			BorderPane SceneRoot2 = SceneLoader2.load();
			SampleController SampleController= SceneLoader2.getController();


			scene.setRoot(SceneRoot2);

			SampleController.setScene(this.scene);
			SampleController.setScene(this.scene);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
