abstract class Student {
    String name;
    String school;
    int age;
    int studentNumber;

    public abstract void todo();
}

class Kim extends Student {
    public Kim(String name, String school, int age, int studentNumber) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    @Override
    public void todo() {
        System.out.println("점심은 김가네 김밥");
    }
}

class Baek extends Student {
    public Baek(String name, String school, int age, int studentNumber) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자");
    }
}

public class Main {
    public static void main(String[] args) {
        Kim kimStudent = new Kim("김땡떙", "상문고", 18, 33333);
        Baek baekStudent = new Baek("백땡땡", "대학교", 23, 77777);

        kimStudent.todo();
        baekStudent.todo();
    }
}
