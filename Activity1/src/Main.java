public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("야옹이", 3, "검은색");
        myCat.makeSound();
        myCat.drop();

        Dog myDog = new Dog("멍멍이", 5, "리트리버");
        myDog.makeSound();
        myDog.fetch();
    }
}
