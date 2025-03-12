package Day03;

public class Ex10_WhileSum {

	public static void main(String[] args) {
		//1부터 1000까지의 합계를 구하시오
		// 1+2+3 .. + 999+1000 = ???
		
		int a = 1;
		int sum = 0;
		while (a <= 1000) {
			sum += a++;
			
			// sum = sum + a
			// a = a + 1
			
			// sum = sum + a++
		}
			System.out.println(sum);
	}
}
