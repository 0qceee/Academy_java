package ClassRoom;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	// 사용자 이름을 저장할 변수
    	String name;
    	
    	// 화폐 단위 배열을 선언하여 큰 금액부터 순서대로 저장
    	int []currencyUnits = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
    	
    	/**
    	 * 각 사람의 화폐 개수 계산
    	 */
    	
    	int amount = 0;
    	
    	// true는 항상 참(true)인 조건이므로 이 루프는 계속 실행 되다가 break;를 만나면 루프 종료
    	while (true) {
    		name = sc.next(); // 한 단어씩 ex) 제니 65434  -> 제니 따로 65434따로
    		if (name.equals("QUIT")) break;
    		
    		// 각 화폐 개수를 저장할 공간을 따로 확보
    		// currencyUnits를 직접 사용하지 않은 이유
    		// 만약 count 없이 currencyUnits를 직접 사용하려고 하면, 각 화폐 단위별 개수를
    		// 저장할 곳이 없음
    		// currencyUnits[i]는 고정된 값(화폐 단위)만 저장하는 배열이라 변경 불가능
    		// 따라서, 각 단위별 개수를 저장할 새로운 배열(count)가 필요함
    		int[] count = new int[currencyUnits.length];
    		
    		for (int i = 0; i < currencyUnits.length; i++) {
				count[i] = amount / currencyUnits[i]; // 현재 화폐 단위로 나눈 몫
				// amount %= currencyUnits 와 같음
				amount = amount % currencyUnits[i];	// 나머지 금액 업데이트(몫)
			}
    	}
    	
    	// 오류 난 부분 지피티 참조
    	
    	
    	sc.close();
    }
}