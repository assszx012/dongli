package com.huawei.it.io;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo {


    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("demo.txt");
            String str = "ni\r\nhao";
            fw.write(str);
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

}
