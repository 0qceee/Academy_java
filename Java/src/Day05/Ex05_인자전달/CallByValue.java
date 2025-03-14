package Day05.Ex05_인자전달;

public class CallByValue {

	public static int sum(int a, int b) {
			a = 100;
			b = 200;
			int sum = a + b;
			System.out.println("::::sum() 메소드::::");
			System.out.println("(a, b) : " + a + ", " + b);
			return sum;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(":::: main() 메소드 호출 ::::");
		System.out.println("(a, b) : " + a + ", " + b);
		
		int sum = sum(a, b);
		System.out.println("sum : " + sum);
		
		System.out.println(":::: sum() 메소드 호출 ::::");
		System.out.println("(a, b) : " + a + ", " + b);
	}
	// sum : 괄호 칸 잘못 적은 것이 있으니 다시 영상보고 채울 것
}
