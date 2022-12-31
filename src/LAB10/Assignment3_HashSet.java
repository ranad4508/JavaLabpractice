/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB10;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Dinesh
 */
public class Assignment3_HashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Java");
        hs.add("C programming");
        hs.add("C#");
        hs.add("PHP");
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
