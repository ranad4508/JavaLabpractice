/*
 *A class called Rectangle, which models a rectangle with a length and a width (in
 float), is designed as shown in the following class diagram. Write the Rectangle
 class.
 */
package LAB3;

class Rectangle {

    float length = 1.0f;
    float width = 1.0f;

    Rectangle() {
    }

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }

}

public class Assignment3_Rectangle {

    public static void main(String args[]) {
        Rectangle rec = new Rectangle();
        rec.setWidth(2);
        rec.setLength(3);
        System.out.println("Area of rectangle : " + rec.getArea());
        System.out.println("Perimeter of rectangle : " + rec.getPerimeter());
        System.out.println("String : " + rec.toString());
    }
}
