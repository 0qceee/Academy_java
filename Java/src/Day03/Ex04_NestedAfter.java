package Day03;

import java.util.Scanner;

public class Ex04_NestedAfter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	     // 응시자격이 있는 경우에만 점수 입력받기
	      int 학년 = sc.nextInt();
	      
	      if(학년 !=4 ) {
	    	  System.out.println("응시자격이 없습니다.");
	      } else {
	    	  System.out.println("학년 : ");
	    	  int 점수 = sc.nextInt();
	    	  if( 점수 >= 60) {
	    		   System.out.println("합격!");
	    	  } else {
	    		  System.out.println("불합격!");
	    	  }
	      }
	      sc.close();
	}

}
