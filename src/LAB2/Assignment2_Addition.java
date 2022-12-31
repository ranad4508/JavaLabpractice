/*
 * Write a program to perform the addition of two numbers without using the + operator.
 */
package LAB2;

public class Assignment2_Addition {

    public static void main(String args[]) {
        int firstNumber = 10;//declare variable
        int secondNumber = 12;//declare variable
        //using for loop for calculating sum without using + operator
        for (int i = 0; i < secondNumber; i++) {
            firstNumber++;//incrementing first number
        }
        System.out.println("Your sum is : " + firstNumber);//display the sum
    }
}
