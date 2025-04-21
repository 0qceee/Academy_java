package JavaTest.Ex02;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        // Book 객체 생성
        Book b1 = new Book("123123", "이게 자바다", "감자바", "자바 감자바", 33000);
        Book b2 = new Book("112112", "정보처리기사", "김조은", "국가기술자격", 45000);
        Book b3 = new Book("001001", "실무 DB", "박디비", "디비디비딥", 60000);

        // 컬렉션에 추가
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        
        // 출력
        System.out.println("########### 조은 스터디 도서관 ###########");
        for (Book book : books) {
        	System.out.printf("%-10s | %-12s | %-8s | %-14s | %,6d원%n",
        	        book.getIsbn(), book.getTitle(), book.getWriter(), book.getContent(), book.getPrice());
        }
    }
}