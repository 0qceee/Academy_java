package ClassRoom;

import java.util.Scanner;

public class Ex02_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		
		StringBuilder oddS = new StringBuilder();
		StringBuilder evenS = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 1) {
				oddSum += i;
				if (oddS.length() > 0) {
					oddS.append("+");
				} oddS.append(i);
			} else {
				evenSum += i;
				if (evenS.length() > 0) {
					evenS.append("+");
				} evenS.append(i);
			}
		}
		System.out.println(oddS.toString() + "=" + oddSum);
		System.out.println(evenS.toString() + "=" + evenSum);
		
	}
	
}
