package java_class;
import java.util.Scanner;
import java.util.ArrayList;

class HowMany {
    private static int registered = 0;
    private int rect;
    
    public HowMany(int rect) {
        this.rect = rect;
        registered++;
    }
    
    public static int getRegistered() {
        return registered;
    }
}

public class Activity2 {

    public static void main(String[] args) {
        ArrayList<Rectangle> rects = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요");
            int width = scan.nextInt();
            int height = scan.nextInt();
            
            if( width == 0 && height ==0) {
                break;
            }
            Rectangle rect = new Rectangle(width);
            rect.setHeight(height);
            rects.add(rect);        
        }
        
        for( Rectangle rect: rects) {
            System.out.printf("가로 길이는: %d", rect.getWidth()).println();
            System.out.printf("세로 길이는: %d", rect.getHeight()).println();
            System.out.printf("넓이는: %d", rect.area()).println();
            System.out.println("----------------------------");
            
        }
        
        System.out.println("Rectangle 인스턴스 개수는 : " + Rectangle.getCount());
    }

}
