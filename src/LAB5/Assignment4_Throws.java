/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

import java.io.*;

public class Assignment4_Throws {

    public static void findFile() throws IOException {
        // code that may produce IOException
        File newFile = new File("D://file1.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
            System.out.println("File found");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
