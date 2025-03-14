package Day05.Ex04_상속;

public class Jiwoo {

	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu();
		pikachu.energy = 100;
		pikachu.type = "전기";
		
		System.out.println("::::: 피카츄 :::::");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격A : " + pikachu.aAttack());
		System.out.println("공격B : " + pikachu.bAttack());
		System.out.println();
		
		Pikachu pikachu20 = new Pikachu(150,"진화");
		
		System.out.println("::::: 피카츄 (Lv.20) :::::");
		System.out.println("에너지 : " + pikachu20.energy);
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("공격A : " + pikachu20.aAttack());
		System.out.println("공격B : " + pikachu20.bAttack());
		System.out.println();
		
		Raichu Raichu = new Raichu();
		
		System.out.println("::::: 라이츄 (Lv.20) :::::");
		System.out.println("에너지 : " + Raichu.energy);
		System.out.println("타입 : " + Raichu.type);
		System.out.println("공격A : " + Raichu.aAttack());
		System.out.println("공격B : " + Raichu.bAttack());
		System.out.println("공격C : " + Raichu.cAttack());
		System.out.println();
	}
}
