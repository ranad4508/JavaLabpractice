/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

public class Assignment2_MultipleCatchBlock {

    public static void main(String args[]) {
        try {
            int a[] = new int[7];
            a[4] = 30 / 0;
        } catch (ArithmeticException e) {

            System.out.println("Warning: ArithmeticException");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning:ArrayIndexOutOfBoundsException");
        } catch (Exception e) {

            System.out.println("Warning: Some Other exception");
        }
    }
}
