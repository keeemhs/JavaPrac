package java_oop;

// 추상클래스
abstract class Animals {
	private int age;
	// 추상메소드
	abstract public void sound();
	
	// 일반메소드
	public void sleep() {
		System.out.println("쿨쿨");
	}
}
// 추상클래스Animal을 상속받는 Chicken클래스
class Chicken extends Animals {
	@Override
	public void sound() {
		System.out.println("꼬꼬댁");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		// 추상클래스는 인스턴스화 할 수 없음
		// Animals animal = new Animals();
		
		Chicken chicken = new Chicken();
		chicken.sound();
		chicken.sleep();

	}

}
