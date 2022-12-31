/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

interface Phone {

    void model();
}

interface Laptop {

    void product();
}

class Brand implements Phone, Laptop {

    public void model() {
        System.out.println("Model: Xiaomi Poco X3 Pro");
    }

    public void product() {
        System.out.println("Model: Lenovo ThinkPad X13");
    }
}

public class Assignment3_MultipleInheritance {

    public static void main(String[] args) {
        Brand b = new Brand();
        b.model();
        b.product();
    }
}
