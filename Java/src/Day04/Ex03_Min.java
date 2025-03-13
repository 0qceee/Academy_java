package Day04;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		// 첫 번째 줄에 입력할 개수 N을 입력받고
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오
		// N개의 정수 중, 최솟값을 구하시오
		// (입력)
		// 5   // N = 5개
		// 90 60 70 100 55        // 배열에 저장
		// (출력)
		// 최솟값 : 100
		
		/*
		 * (순서도 짜기)
		 * 1. 정수 하나를 입력 받아서 N에 대입
		 * 2. N개의 요소를 갖는 배열 arr 선언 및 생성
		 * 3. N번 반복하면서 정수를 입력받아 배열 arr에 순서대로 대입한다
		 * 4. 배열을 반복해서 최댓값 max를 배열 i번째 요소랑 비교
		 * 5. 두 요소 중에서 더 큰 요소를 min에 대입
		 * 6. 반복 끝나고, min를 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		// 1. 정수 하나를 입력 받아서 N에 대입
		int N = sc.nextInt();
		// 2. N개의 요소를 갖는 배열 arr 선언 및 생성
		int arr[] = new int[N];
		// 3. N번 반복하면서 정수를 입력받아 배열 arr에 순서대로 대입한다
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 4.
		int min = Integer.MAX_VALUE; // Integer.MIN_VALUE << 음수 문제 때문에 int값중 가장 작은 값
		
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				// 5.
				min = arr[i];
			}
		}
		// 6.
		System.out.println("최솟값 : " + min);
		
		
		sc.close();
		
	}
}
