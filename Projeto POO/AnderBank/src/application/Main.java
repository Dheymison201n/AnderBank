package application;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import FXML.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("MenuInicial.fxml").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}













/*public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		 Parent = RootPaneContainer = FXMLLoader.load(getClass().getResource("MenuInicial.fxml"));
		 primaryStage.getScene(new Scene(root));
		 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
*/