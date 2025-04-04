package Day07.Singleton.Singleton;

public class SigletonTest {

	public static void main(String[] args) {
		// Sigleton singleton = new Singleton(); < 생성안됨
		
		Singleton s01 = Singleton.getInstance();
		Singleton s02 = Singleton.getInstance();
		
		// 인스턴스가 메모리 공간에 하나로 할당되어 있는지 확인
		System.out.print("s01과 s02가 같은지 여부 : ");
		System.out.println( s01 == s02);
		
	}
}