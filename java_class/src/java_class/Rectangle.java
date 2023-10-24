package java_class;

public class Rectangle {
    private static int registered = 0;
    private int width;
    private int height;
    private static int COUNT;
    
    public static int getCount() {
    	return COUNT;
    }
    
    public Rectangle(int width) {
    	COUNT++;
    	this.width = width;
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public static int getRegistered() {
        return registered;
    }
}