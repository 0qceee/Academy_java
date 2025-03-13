package Day04;

import java.util.Scanner;

public class Ex06_Arrays {

	public static void main(String[] args) {
		// 2행 3열
		// 정방 행렬
		// [][][]
		// [][][]
		
		// 비정방 행렬
		// [][]
		// [][][][]
		// [][][]
		
		int arr[][] = new int[3][];
		// [] -> [][]
		// [] -> [][][][]
		// [] -> [][][]
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		
		// 입력
		Scanner sc = new Scanner(System.in);
		// arr 2차원 배열에 정수를 입력받아보세요
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
	}
			System.out.println();
}
		// foreach 출력
		for (int[] a : arr) {   // ( arr=2차원 int[]=1차원 ) << 이것을 a라고 하고
			for (int b : a ){  // a로 반복
				System.out.print(b +" ");
			}
			System.out.println();
		}
}
}