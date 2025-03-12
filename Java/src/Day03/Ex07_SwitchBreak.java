package Day03;

import java.util.Scanner;

public class Ex07_SwitchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 입력 받은 정수를 5로 나눈 나머지가
		// 2이하일 때"*" 출력
		// 그렇지 않으면 "**" 출력
		// - switch 문을 이용하시오.
		
		switch (num % 5) {
		case 0: System.out.println("*");  break;
		case 1: System.out.println("*");  break;
		case 2: System.out.println("**"); break;
		case 3: System.out.println("**"); break;
		case 4: System.out.println("**"); break;
		}
		// break가 없으면 아래줄로 내려감
		switch (num % 5) {
		case 0: 
		case 1: 
		case 2: System.out.println("*"); 	break;
		case 3: 
		case 4: System.out.println("**"); 	break;
	}
		//default 사용
		switch (num % 5) {
		case 0: 
		case 1: 
		case 2: System.out.println("*"); 	break;
		default: System.out.println("**"); 	break;
	}	
}
}