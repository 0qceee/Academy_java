package JavaTest.Ex03;

import java.io.*;
import java.util.*;

public class Manager {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        getTxtToList(students); // 텍스트에서 LinkedList로 데이터 읽기

        // 정렬: 성적 내림차순, 성적이 같으면 번호 오름차순
        students.sort((s1, s2) -> {
            if (s2.score != s1.score)
                return s2.score - s1.score;
            else
                return s1.no - s2.no;
        });

        // 정렬된 학생 출력
        System.out.println("번호\t이름\t성적\t반");
        for (Student s : students) {
            System.out.println(s.no + "\t" + s.name + "\t" + s.score + "\t" + s.className);
        }
    }

    // getTxtToList 메소드는 여기 안에 있어도 되고 따로 빼도 됨
    public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
        try {
            File file = new File("src/JavaTest/Ex03/student.txt");
            Scanner sc = new Scanner(file);
            Student std;

            while (sc.hasNextLine()) {
                String stn = sc.nextLine();
                String[] data = stn.split("/");
                int no = Integer.parseInt(data[0]);
                String name = data[1];
                int score = Integer.parseInt(data[2]);
                String className = data[3];
                std = new Student(no, name, score, className);
                list.offer(std);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}