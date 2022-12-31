/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Assignment6_ByteArray {

    public static void main(String args[]) throws IOException {
        String file = "D://JavaPrograms//file1.txt";
        InputStream fins = null;
        try {
            fins = new FileInputStream(file);
            byte file_content[] = new byte[2*1024];
            int read_count;
            while ((read_count = fins.read(file_content)) > 0) {
                System.out.println(new String(file_content, 0, read_count - 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fins != null) {
                fins.close();
            }
        }
    }
}
