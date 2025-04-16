package ClassRoom.Ex14;

import java.io.*;
import java.util.*;

	// 학생 정보 저장
class Student {
    int no;
    String name;
    int score;
    String group;
    // 생성자
    public Student(int no, String name, int score, String group) {
        this.no = no;
        this.name = name;
        this.score = score;
        this.group = group;
    }
}

public class Main {
    public static void main(String[] args) {
    	// student 객체들을 저장할 리스트 생성
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/JavaTest/Ex03/student.txt"))) {
            String line;
            // 한 줄씩 읽기
            while ((line = br.readLine()) != null) {
            	
                // 1/김수로/90/프론트엔드 형태를 나누기
                String[] parts = line.split("/");
                // Object이므로 parseInt 변형
                int no = Integer.parseInt(parts[0]);
                String name = parts[1];
                int score = Integer.parseInt(parts[2]);
                String group = parts[3];

                students.add(new Student(no, name, score, group));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 정렬: 성적 내림차순, 성적 같으면 번호 오름차순
        students.sort((s1, s2) -> {
            if (s2.score != s1.score)
                return s2.score - s1.score;
            else
                return s1.no - s2.no;
        });

        // 출력 printf("%-4s,%-6s") = 각각 4칸,6칸을 확보함.
        System.out.println("번호\t이름\t성적\t반");
        System.out.println();
        for (Student s : students) {
            System.out.println(s.no + "\t" + s.name + "\t" + s.score + "\t" + s.group);
            System.out.println();
        }
    }
}
