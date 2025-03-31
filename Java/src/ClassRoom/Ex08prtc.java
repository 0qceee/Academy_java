package ClassRoom;

import java.util.Scanner;

public class Ex08prtc {

	public static void main(String[] args) {
		//정수 N 입력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		// 증가하는 수 count 초기화
		int count = 0;
		
		//배열 설정
		for (int i = 0; i < arr.length; i++) {
			
			// 인덱스가 짝수 = 홀수 열
			if (i%2==0) {
				for (int j = 0; j < arr.length; j++) {
					count++;
					arr[i][j] = count;
				}
			}
			// 인덱스가 홀수 = 짝수 열
			else {
				for (int j = N-1; j >= 0; j--) {
					count++;
					arr[i][j] = count;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
