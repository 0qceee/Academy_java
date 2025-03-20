package Day09.Ex02_Wrapper;


public class DoubleEx {
	
	public static void main(String[] args) {
		// Double
		// double -> Double
		// : 실수타입인 double 기본타입을 객체화한 클래스
		Double d = 3.14;
		System.out.println( d.toString() + 0.06 );				// 실수형 -> 문자열
		System.out.println( Double.parseDouble("3.14") + 0.06 );// 문자열 -> 실수형
		
		// double a = null; - 기본타입은 null 지정 불가 *null < 참조자료형이 가져와야 할 곳이 비어있을 때 사용
		Double b = null; // 참조자료형
	}

}
