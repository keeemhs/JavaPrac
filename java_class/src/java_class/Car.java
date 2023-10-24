package java_class;

public class Car {
	// 접근제어자
	// public: 같은 클래스o, 같은패키지o, 자식클래스o,전체o
	// 
	
	// 멤버 변수
	private int speed;
	
	// 생성자
	// 클래스명과 동일해야 함
	public Car(int speed) {
		this.speed = speed;
	}
	
	public void start() {
		System.out.println("Car Start");
	}
	
	public void increaseSpeed(int speed) {
		this.speed = this.speed + speed;
	}

	// setter메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	// getter 메소드
	public int getSpeed() {
		return this.speed;
	}
	
	
}
