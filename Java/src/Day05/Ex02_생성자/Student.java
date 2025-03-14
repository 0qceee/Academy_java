package Day05.Ex02_생성자;

// 학생
// - 변수		: 이름, 나이, 학번, 전공
// - 메소드	: 공부하기, 성적 평균 구하기
public class Student {

	// 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	// 생성자
	// * 단축키 : alt + shift + S -> O
	// TODO : 기본 생성자
	public Student() {
		this("이름 없음", 0);
		
	}
	// TODO : 매개변수가 있는 생성자
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		stdNo = "000000";
		major = "전공없음";
	}

	// 메소드
	// * 접근지정자 반환타입 메소드명(매개변수) {}
	// - 공부하기
	// * void : 반환타입 없음 (return 생략가능)
	// - void 로 지정해도 return을 메소드를 종료시키는 용도로 사용할 수 있다.
	public void study(String subject) {
		System.out.println( subject + "(을/를) 공부합니다.");
	}
	
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}

	// - 성적 평균 구하기
	public double getAverage(int score1, int score2) {
		// TODO : 평균을 구하여 반환해보세요
		
		// int sum = score1 + score2;
		double average = 0.0;
		average = (double) ((score1 + score2) / 2);
		return average;
	}
	
	public double getAverage(int score1, int score2, int score3) {
		
		double average = 0.0;
		average = (double) ((score1 + score2 + score3) / 3);
		return average;
	}
	
	public double getAverage(int[] scores) {
		double average = 0.0;
		int sum = 0;
		/*
		 * for (int i = 0; i < scores.length; i++) { sum += sum[i];
		 * 
		 * }
		 */
		for (int score : scores) {
			sum += score;
			average = (double) sum / scores.length;
			return average;
		}
		return average;
	}
	
}
