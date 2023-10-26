package java_generic;
import java.util.*;

public class CollectionActivity2 {
    public static void main(String[] args) {
        Map<String, Integer> nameAgeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름과 나이를 입력 (종료하려면 '종료' 입력)");

        while (true) {
            System.out.print("이름: ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                break;
            }

            System.out.print("나이: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            nameAgeMap.put(name, age);
        }

        System.out.println("========================");
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "세");
        }
    }
}
