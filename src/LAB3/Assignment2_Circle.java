/*
 * A class called Circle, which models a circle with a radius, is designed as shown in the
 following class diagram. Write the Circle class.
 */
package LAB3;

import static java.lang.Math.PI;

class Circle {

    double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
// method to calculate area

    public double getArea() {
        return PI * radius * radius;
    }
    public double getCircumference(){
        return 2*PI*radius;
    }
    public String toString() {
   return "Circle[radius =" +radius+"]";
}
}

public class Assignment2_Circle {

    public static void main(String[] args) {
        //create first circle object with
        Circle c1 = new Circle();
        //call getArea() method for object c1
        System.out.println("Area of circle : " + c1.getArea());
        //call getCircumference() method for object c1
        System.out.println("Circumference of circle : "+c1.getCircumference());
        System.out.println("String : "+c1.toString());
        
    }
}
