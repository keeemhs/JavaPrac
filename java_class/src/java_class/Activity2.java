package java_class;
import java.util.ArrayList;
import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            if ((width == 0) && (height == 0)) {
                break;
            }

            Rectangle rectangle = new Rectangle();
            rectangle.setWidth(width);
            rectangle.setHeight(height);
            rectangles.add(rectangle);
        }

        for (Rectangle rectangle : rectangles) {
        	System.out.println("가로 길이는: " + rectangle.getWidth());
        	System.out.println("세로 길이는: " + rectangle.getHeight());
            System.out.println("넓이는: " + rectangle.getArea());
            System.out.println("-----------------------");
        }
    }
}
