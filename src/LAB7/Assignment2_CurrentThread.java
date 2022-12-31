package LAB7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dinesh
 */
public class Assignment2_CurrentThread extends Thread {

    @Override
    public void run() {
        // print currently executing thread   
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        Assignment2_CurrentThread t1 = new Assignment2_CurrentThread();
        t1.setName("Main Thread");
        t1.start();
        System.out.println("The Thread name is " + t1.currentThread().getName());
    }

}
