package ClassRoom;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int N = sc.nextInt();
		
		int[] arr1 = new int[6];
		
		// 출력 N번 게임
		for (int i = 1; i <= N; i++) {
			System.out.print("[" + i + " 게임] : " );
			
			// 중복 제거
			for (int j = 0; j < arr1.length; j++) {
			    arr1[j] = random.nextInt(45) + 1;

			    for (int k = 0; k < j; k++) {
			        if (arr1[j] == arr1[k]) {
			            j--; // 중복이면 다시 뽑기
			            break;
			        }
			    }
			}
			
			// 오름차순 정리 
	        // 버블 정렬 - 오름차순
	        for (int i1 = 0; i1 < 6; i1++) {
	        	// 오름차순
	            for (int j1 = 0; j1 < 6 - i1 - 1; j1++) {
	                if (arr1[j1] >= arr1[j1 + 1]) {
	                    int temp = arr1[j1];
	                    arr1[j1] = arr1[j1 + 1];
	                    arr1[j1 + 1] = temp;
	                } 
	    
	            }
	            
	            
	        }
			
			
			// 출력
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[j] + " ");
			}
			
		
			System.out.println();
		}
		
		
		
		
		sc.close();
	}
}
