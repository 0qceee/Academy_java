package application;
	

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;


public class Main extends Application {

	/**
	 * start()
	 * : 화면 시작 메소드
	 */
	@Override
	public void start(Stage stage) throws Exception {
		// 단일 stage 객체로부터 화면이 시작된다.
		
		// Scene을 지정하기 위한 Group 객체 <- 컨테이너
		Group root = new Group();
		
		// Scene 생성
		Scene scene = new Scene(root);
		
		/* Stage 설정*/
		stage.setTitle("프로그램 이름");
		// 프로그램 아이콘 지정
		Image icon = new Image("icon.png");
				stage.getIcons().add(icon);
				
		// 윈도우 크기 지정 - px 단위
		stage.setWidth(600);
		stage.setHeight(600);
		
		// 윈도우 출력 위치 지정
		stage.setX(100);
		stage.setY(200);
		// * 화면 정가운데 위치 지정
		// stage.centerOnScreen();
		
		// 크기 조절 활성화 설정
		stage.setResizable(false);		// 크기 조절 비활성화
		
		// 전체화면모드
		stage.setFullScreen(true);
		// 전체화면 종료 힌트 텍스트 지정
		stage.setFullScreenExitHint("전체화면 종료 (Q)");
		// Q 입력 시 전체화면 종료
		stage.setFullScreenExitKeyCombination( KeyCombination.valueOf("Q") );
		
		// Scene을 Stage에 지정
		stage.setScene(scene);
		// Stage 출력
		stage.show();
	}
	
	
	// 프로그램의 시작점이 되는 메소드
	public static void main(String[] args) {
		launch(args);		// 프로그램 시작 준비 작업 후 -> start() 호출
	}
}
