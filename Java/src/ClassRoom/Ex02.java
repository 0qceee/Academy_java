package ClassRoom;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int oddSum = 0;		// 홀수의 합
		int evenSum = 0;	// 짝수의 합
		
		StringBuilder oddExpression = new StringBuilder();	//홀수 수식 저장
		StringBuilder evenExpression = new StringBuilder();	//짝수 수식 저장
		
		// 1부터 N까지 반복
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 1) {
				oddSum += i;
				if (oddExpression.length() > 0) {
					oddExpression.append("+");
					}
				oddExpression.append(i);
			} else {
				evenSum += i;
				if (evenExpression.length() > 0) {
					evenExpression.append("+");
					}
				evenExpression.append(i);
			}
		}
		
		System.out.println(oddExpression.toString() + "=" + oddSum);
		System.out.println(evenExpression.toString() + "=" + evenSum);
		
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) System.out.print(i + " ");
		}
		
	}
}
