/*
 * program to evaluate the arithmetic expression ((a + b / c * d - e) * (f - g)). Read the
values a, b, c, d, e, f, g from the standard input device.
 */
package LAB2;

import java.util.Scanner;
public class Assignment3_ArithmeticExpression {
    public static void main(String args[]){
        float expression = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        float a = sc.nextFloat();
        System.out.print("Enter number b : ");
        float b = sc.nextFloat();
        System.out.print("Enter number c : ");
        float c = sc.nextFloat();
        System.out.print("Enter number d : ");
        float d = sc.nextFloat();
        System.out.print("Enter number e : ");
        float e = sc.nextFloat();
        System.out.print("Enter number f : ");
        float f = sc.nextFloat();
        System.out.print("Enter number g : ");
        float g = sc.nextFloat();
        expression = expression + ((a+b/c*d-e)*(f-g));
        System.out.println("The output of arithmetic expression is : "+expression);
    }
}
