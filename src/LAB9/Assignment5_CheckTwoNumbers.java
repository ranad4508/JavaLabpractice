/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB9;

public class Assignment5_CheckTwoNumbers {

    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;
        System.out.print("The result is: " + calculate(firstNumber, secondNumber));
    }

    public static boolean calculate(int p, int q) {
        if (p == 15 || q == 15) {
            return true;
        }
        return ((p + q) == 15 || Math.abs(p - q) == 15);

    }
}
