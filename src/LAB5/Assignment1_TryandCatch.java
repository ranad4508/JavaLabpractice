/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

import java.util.*;
public class Assignment1_TryandCatch {
    public static void main(String[]args){
        try{
            int a[] = new int[-8];
            System.out.println("Array Size: "+ a.length);
        }catch(NegativeArraySizeException e){
            System.out.println("Exception : "+e);
        }
    }
}
