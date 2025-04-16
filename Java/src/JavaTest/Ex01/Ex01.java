package JavaTest.Ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5명 학생 배열 길이
		int []array = new int[5];
		
		// 입력받기
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		// 버블정렬
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp; 
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// 줄 바꿈
		System.out.println();
		
		// 버블정렬 - 내림차순
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for (int i : array) {
			System.out.print( i + " ");
		}
		
		
		sc.close();
	}
}
