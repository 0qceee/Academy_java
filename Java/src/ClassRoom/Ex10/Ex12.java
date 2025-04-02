package ClassRoom.Ex10;

import java.util.*;

/**
 * HashSet 사용해서 "중복 없는" 숫자들을 모으고
 * ArrayList와 Collections.sort()를 사용해 "오름차순 정렬"을 함
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("몇 게임? ");
        int n = scanner.nextInt(); // 사용자로부터 게임 수 입력받기

        for (int i = 1; i <= n; i++) {
            // 중복 방지를 위해 Set 사용
            Set<Integer> lottoSet = new HashSet<>();

            // 로또 번호가 6개가 될 때까지 반복
            while (lottoSet.size() < 6) {
                int number = random.nextInt(45) + 1; // 1 ~ 45 범위의 난수
                lottoSet.add(number); // Set이라 중복은 자동으로 제거됨
            }

            // Set을 정렬하려면 List로 변환 후 정렬
            List<Integer> lottoList = new ArrayList<>(lottoSet);
            Collections.sort(lottoList);

            // 출력
            System.out.print("[" + i + " 게임] : ");
            for (int num : lottoList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
