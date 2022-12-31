/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB9;


public class Assignment1_FractionalParts {

    public static void main(String[] args) {
        double value = 18.56;
        double fractional_part = value % 1;
        double integral_part = value - fractional_part;
        System.out.println("Original value: " + value);
        System.out.println("Integral part: " + integral_part);
        System.out.println("Fractional part: " + fractional_part);
    }
}
