package codeup;


import java.util.Scanner;

public class _1503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] a = new int [N][N];
		
		int k = 1;
		boolean sw = true;
		for (int i = 0; i < a.length; i++) {
			// 방법1) 홀수형일 때, 정방향 짝수형일 때 역방향
			// 방법2) 한 번은 정방향, 한 번은 역방향
			
			// 정방향 : j : 0 1 2 3 4 ... N-1
			if (sw) 
				for (int j = 0; j < a.length; j++) 
					a[i][j] = k++;
				
			// 역방향 : j : N-1 ... 4 3 2 1 0
			if (!sw )
				for (int j = N-1; j >= 0; j--) 
					a[i][j] = k++;
					
					sw = !sw;
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}		
		
		
		
		
	}
}
