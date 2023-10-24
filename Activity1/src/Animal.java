// Animal 클래스 정의
class Animal {
    String species;
    String name;
    int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("동물은 소리를 낸다");
    }
}

class Cat extends Animal {
    String Color;

    public Cat(String name, int age, String Color) {
        super("고양이", "고양이", age);
        this.Color = Color;
    }

    @Override
    public void makeSound() {
        System.out.println("야옹야옹");
    }

    // Cat 클래스 고유의 메소드 정의
    public void drop() {
        System.out.println(name + "가 컵을 떨군다.");
    }
}

// Dog 클래스 정의 (Animal 클래스 상속)
class Dog extends Animal {
    String breed;

    // 생성자
    public Dog(String name, int age, String breed) {
        super("강아지", "강아지", age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍멍멍");
    }

    public void fetch() {
        System.out.println(name + "가 난리를 친다.");
    }
}
