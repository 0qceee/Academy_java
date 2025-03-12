package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		/** 정보처리기사 합격기준
		 *  응시자격 	: 대학교 4학년
		 *  점수  	: 60점 이상
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		/**
		 * 합격
		 * 불합격
		 * 응시자격이 없습니다
		 */
		// if문 안에 if문 또 들어가는 것은 권장하지 않음 밑의 것을 쓸 것
		if (year == 4) {
		if (score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		} else {
			System.out.println("응시자격이 없습니다");
		}
	
	
	// 방법1
		if(year == 4 && score >= 60) {
		System.out.println("합격!");
	}	else if(year == 4) {
		System.out.println("불합격!");
		}
		else {
		System.out.println("응시자격이 없습니다.");
	}
	
	
	// 방법2
      if (year !=4) {
		System.out.println("응시자격이 없습니다.");
		// 4학년 충족되었으니 점수만 봄
	} else if (score >=60) {
		System.out.println("합격!");
	} else{
		System.out.println("불합격!");
	}
      System.out.println();

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
	// 다시 영상보고 작성하기 마지막부분