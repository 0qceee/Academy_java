package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
private static Scene scene;
	
	/**
	 * Scene 의 컨테이너를 불러온 FXML 로 지정하는 메소드
	 */
	static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}
	
	/**
	 * Parent root 를 가져와서 바로 화면 이동하는 메소드
	 */
	static void setRoot(Parent root) throws IOException {
		scene.setRoot(root);
	}
	
	/**
	 * FXML 파일 지정하여 FXMLLoader 객체 반환
	 */
	static FXMLLoader getFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		return fxmlLoader;
	}
	
	/**
	 * FXML 파일 읽어오는 메소드
	 */
	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		scene = new Scene( loadFXML("Main") );
		stage.setScene(scene);
		stage.show();
	}
}
