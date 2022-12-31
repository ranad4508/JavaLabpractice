/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB10;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Dinesh
 */
public class Assignment2_LinkedList {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Rana");
        l.add("java");
        l.addFirst("Dinesh");
        l.addLast("web technology");
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
