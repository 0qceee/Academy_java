package ClassRoom;

import java.util.Random;
import java.util.Scanner;

public class lottoPrtc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 게임? : ");
		int game = sc.nextInt();
		
		int[] array = new int[6];
		
		Random random = new Random();
		// game번째 게임
		for (int i = 1; i <= game; i++) {
			System.out.print("[" + i + "]" + "번째 게임 : ");
			
			// 6개 숫자 뽑기
			for (int j = 0; j < array.length; j++) {
				array[j] = (random.nextInt(45)) + 1;
			}
			
			// 중복 제거
			for (int j = i-1; j >= 0;) {
				if (array[i] == array[j]) 
					i--; 
					break;
			}
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.println();
		}
		}
	}