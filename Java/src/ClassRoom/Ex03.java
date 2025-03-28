package ClassRoom;

public class Ex03 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int ten = i / 10;
			int one = i % 10;
			if ((ten !=0 && ten % 3 == 0) && (one !=0 && one % 3 == 0))
				System.out.println("**");
			else if ((ten !=0 && ten % 3 == 0) || (one !=0 && one % 3 == 0))
				System.out.println("*");
			else System.out.println(i);
		}
	}
}

//if ((ten !=0 && ten % 3 == 0) && (one !=0 && one % 3 == 0))
//(ten !=0 && ten % 3 == 0) || (one !=0 && one % 3 == 0)