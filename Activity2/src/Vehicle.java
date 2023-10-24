// Vehicle 클래스 정의
class Vehicle {
    String brand;
    String color;
    int speed;

    public Vehicle(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void honk() {
        System.out.println("종류 : " + brand);
    }
}

class Car extends Vehicle {
    public Car(String brand, String color, int speed) {
        super(brand, color, speed);
    }

    public void openDoors() {
        System.out.println("색상 : " + color);
    }
    
    public void aaa() {
    	System.out.println("속도 : " + speed + "km/h");
    }
}

// Motorcycle 클래스 정의 (Vehicle 클래스 상속)
class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String color, int speed) {
        super(brand, color, speed);
    }

    public void openDoors() {
        System.out.println("색상 : " + color);
    }
    public void aaa() {
    	System.out.println("속도 : " + speed + "km/h");
    }
}
