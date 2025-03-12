package codeup;

import java.util.Scanner;

public class _1156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		
		int num = sc.nextInt();
		if( num % 2 == 1) { System.out.println("odd");}
		else { System.out.println("even"); };
		
	}
}
