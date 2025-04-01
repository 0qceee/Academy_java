package ClassRoom;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 화폐 단위: 큰 금액부터 작은 금액까지
        int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        // 전체 화폐 매수 합계
        int[] totalUnitCount = new int[10];

        // 각 사람의 정보를 저장할 리스트
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> amounts = new ArrayList<>();
        // { 0 5 4 3 2 1 } 와 같이 화폐 매수를 저장하는 배열의 리스트
        ArrayList<int[]> personUnitCounts = new ArrayList<>();

        // 입력 받기
        while (true) {
            String name = scanner.next();
            // equalsIgnoreCase << 대소문자 구분 없이 같다면 break;
            if (name.equalsIgnoreCase("QUIT")) break;

            int amount = scanner.nextInt();

            // 개인별 화폐 매수 저장
            // unitCount = { 50000, 10000, 5000, ... }
            int[] unitCount = new int[10];
            int remaining = amount;

            for (int i = 0; i < units.length; i++) {
                unitCount[i] = remaining / units[i];
                remaining %= units[i];
                totalUnitCount[i] += unitCount[i]; // 전체 합계 누적
            }

            // 리스트에 저장
            names.add(name);
            amounts.add(amount);
            personUnitCounts.add(unitCount);
        }

        // 출력 헤더
        System.out.println("성명\t총금액\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");

        // 저장한 사람 정보 출력
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s\t%d", names.get(i), amounts.get(i));
            int[] counts = personUnitCounts.get(i);
            for (int count : counts) {
                System.out.printf("\t%d", count);
            }
            System.out.println();
        }

        // 전체 화폐 매수 출력
        System.out.print("전체 화폐매수:");
        for (int count : totalUnitCount) {
            System.out.printf("\t%d", count);
        }
    }
}
