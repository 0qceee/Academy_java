package Day07.Singleton.Test;

public class Test {
	public static void main(String[] args) {
	
		class Person {
		    String name;
		    int age = 10;

		    void work() {
		        System.out.println("일을 합니다.");
		    }
		}

		class Student extends Person {
		    String major;
		    int age = 20;

		    void work() {
		        System.out.println("공부 합니다.");
		    }
		}
		
		Person person = new Student();		// 업캐스팅
		Student student = (Student) person;	// 다운캐스팅
		
		// 예러 : System.out.println( person.major );
		// * 업캐스팅을 전제하지 않으면 에러가 발생한다.
		
		System.out.println(student.age);
		student.work();

	
	}
}