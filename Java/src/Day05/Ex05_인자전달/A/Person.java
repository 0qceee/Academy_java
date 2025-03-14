package Day05.Ex05_인자전달.A;

public class Person {

	
	// 변수 : 이름, 나이, 키, 체중
	public String name;
	protected int age;
	int height;
	private int weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	// 생성자
	// - 기본 생성자

	// - 모든 매개변수 생성자
	
	// getter, setter
	//toString
}
