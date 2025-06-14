package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	// 화면 A, B 객체 선언
	private Scene sceneA, sceneB;
	
	@Override
	public void start(Stage stage) throws Exception {
		// Scene(화면) A 생성
		// StackPane 레이아웃 생성
		StackPane layoutA = new StackPane();
		// 레이아웃 지정 sceneA 생성
		sceneA = new Scene(layoutA, 300, 200);
		// 버튼 생성
		Button switchButton = new Button("B 화면으로 이동");
		// 레이아웃 아래 버튼 지정
		layoutA.getChildren().add(switchButton);
		// 버튼 클릭 이벤트 정의 : 
		// e : 이벤트
		switchButton.setOnAction( e -> stage.setScene(sceneB) );
		
		// Scene(화면) B 생성
		Button backButton = new Button("A 화면으로 이동");			// 버튼 생성
		backButton.setOnAction( e -> stage.setScene(sceneA) );	// 화면A로 이동하는 클릭 이벤트
		StackPane layoutB = new StackPane(backButton);			// 레이아웃에 버튼 지정
		sceneB = new Scene(layoutB, 300, 200);					// Scene에 레이아웃 지정
		
		// 시작화면 Scene 설정
		stage.setScene(sceneA);						// 화면 A로 시작
		stage.setTitle("Java Fx - Scene 화면 이동");	// 윈도우 타이틀 설정
		stage.show(); 								// 윈도우 출력
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
