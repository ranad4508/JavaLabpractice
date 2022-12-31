/*
 Write a program to read the contents written in the “file1.txt”.
 */
package LAB8;

import java.io.FileInputStream;
import java.io.IOException;

public class Assignment2_Read {

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\JavaPrograms\\file1.txt");
        int i = 0;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }
        fin.close();
    }

}
