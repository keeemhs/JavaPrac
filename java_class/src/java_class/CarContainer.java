package java_class;

public class CarContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car(50);
		Car kia = new Car(20);
		
		// 잘못된 접근방법
//		bmw.speed = 120;
//		kia.speed = 90;
		
		bmw.start();
		kia.start();
		
//		bmw.setSpeed(120);
//		kia.setSpeed(90);
		
//		int bmwSpeed = bmw.getSpeed();
//		bmwSpeed = bmwSpeed + 100;
//		bmw.setSpeed(bmwSpeed);
//		
//		int kiaSpeed = kia.getSpeed();
//		kiaSpeed = kiaSpeed + 80;
//		kia.setSpeed(kiaSpeed);
		
		bmw.increaseSpeed(120);
		kia.increaseSpeed(100);
		
		System.out.println("bmw : " + bmw.getSpeed());
		System.out.println("kia : " + kia.getSpeed());
		
	}

}
