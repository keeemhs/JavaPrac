package java_generic;
import java.util.*;

public class CollectionActivity1 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("정수를 입력하세요 (종료하려면 -1을 입력)");
        
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        scanner.close();
    }
}
