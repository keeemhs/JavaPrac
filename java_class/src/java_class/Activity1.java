package java_class;
import java.util.*;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle square = new Rectangle();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt(); 
		
		square.setWidth(num1);
		square.setHeight(num2);
		
		System.out.println(square.getArea());
		
		scan.close();
	}
}
