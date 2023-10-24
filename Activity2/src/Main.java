public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("버스", "초록", 80);
        myCar.honk(); 
        myCar.openDoors();
        myCar.aaa();

        System.out.println("--------------");
        
        Motorcycle myMotorcycle = new Motorcycle("자전거", "검정", 20);
        myMotorcycle.honk();
        myMotorcycle.openDoors();
        myMotorcycle.aaa();
    }
}
