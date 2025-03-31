package ClassRoom;

import java.util.Scanner;

public class Ex09_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] currencyUnits = {500000, 100000, 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        
        String name;
        int amount = 0; // while문 바깥에서 선언
        int[] count = new int[currencyUnits.length]; // count도 바깥에서 선언
        
        while (true) {
            name = sc.next();
            if (name.equals("QUIT")) break;  
            
            amount = sc.nextInt(); // while문 안에서 값만 변경
            
            // 화폐 개수 초기화
            for (int i = 0; i < count.length; i++) {
                count[i] = 0;
            }
            
            // 화폐 개수 계산
            for (int i = 0; i < currencyUnits.length; i++) {
                count[i] = amount / currencyUnits[i]; // 해당 화폐 단위 개수 저장
                amount %= currencyUnits[i]; // 남은 금액 계산
            }

            // 출력
            System.out.print(name + " " + amount);
            for (int i = 0; i < count.length; i++) {
                System.out.print(" " + count[i]);
            }
            System.out.println();
        }
        
        sc.close(); // Scanner 닫기
    }
}
