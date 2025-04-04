package lombok.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 롬복
// : 롬복은 어노테이션을 이용하여 코드를 자동 생성해준다.

// @NoArgsConstructor		: 기본 생성자
// @AllArgsConstructor		: 모든 매개변수 생성자
// @ArgsConstructor			: 필수 생성자
// @NonNull					: null이 들어오지 못하도록 지정
//								* 필수 생성자의 매개변수로 지정
// @getter					: getter 메소드 자동 생성
// @setter					: setter 메소드 자동 생성
// @Tostring				: toString 메소드 자동 생성
// @Data					: @Getter,@Setter,@toString
//							  @RequiredArgsConstructor
//							  @EqualsHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Person {

	@NonNull private String name;
	@NonNull private int age;
	private double height;
	private double weight;
}
