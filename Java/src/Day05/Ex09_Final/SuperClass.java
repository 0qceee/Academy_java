package Day05.Ex09_Final;

public class SuperClass {

	
	// final 메소드
	public final void finalMethod() {
		System.out.println("final 메소드입니다.");
	}
}


class subClass extends SuperClass {
// final 메소드는 오버라이딩 할 수 없다	
}