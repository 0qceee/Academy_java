package Day02;

import java.util.Scanner;

public class Ex07_Boolean {

	
	public static void main(String[] args) {
		//boolean
		// : true(참), flase(거짓) 논리값만 가지는 자료형
		boolean check1 = false;
		boolean check2 = true;
		
		Scanner sc = new Scanner(System.in);
		boolean on = sc.nextBoolean();		// 논리값(true,flase) 를 입력받는 메소드
		
		if(on) {
			System.out.println("전원 ON");
			
		}
		else {
			System.out.println("전원 OFF");
			
		}
		sc.close();
	}
}
