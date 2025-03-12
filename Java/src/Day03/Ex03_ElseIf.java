package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		
		/**
		 * 성적을 입력받아서, 성적에 따른 학점 A~F를 출력하시오
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		char grade = 'F';
		
		/**
		 * if
		 * 90이상 A / 80이상 B / 70이상 C / 60이상 D / 60미만 F
		 */
		
		if (score >= 90 && score <= 100) grade = 'A';
		if (score >= 80 && score < 90) grade = 'B';
		if (score >= 70 && score < 80) grade = 'C';
		if (score >= 60 && score < 70) grade = 'D';
		if (score < 60 && score >= 0) grade = 'F';
		
		// ----------------------------
		
		
		if (score >= 90 && score <=100) 
			System.out.println("A");
		else if (score >= 80) 
			System.out.println("B");
		else if (score >= 70) 
			System.out.println("C");
		else if (score >= 60) 
			System.out.println("D");
		else if (score < 60) 
			System.out.println("F");
	
		sc.close();
}
}