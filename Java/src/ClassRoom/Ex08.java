package ClassRoom;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력
		int N = sc.nextInt();
		
		// 숫자 증가
		int count =0;
		
		// N열 N행 배열 생성
		int[][] arrays = new int[N][N];
		
		
		// N열 기준 홀수 짝수 분류
		for (int i = 0; i < arrays.length; i++) {
			
			// 홀수 열(인덱스)
			if (i%2==0) {
				// 순방향 - 오름차순
				for (int j = 0; j < arrays[i].length; j++) {
					count++;
					arrays[i][j] = count;
				}
				
			} 
			// 짝수 열
			else {
				for (int j = N-1; j >= 0; j--) {
					count++;
					arrays[i][j] = count;
				}
				
			}
		}
		
		
		// 출력
		
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays.length; j++) {
				System.out.print(arrays[i][j] + " ");
			}
			System.out.println();
		
		}
		sc.close();
		
	}
}