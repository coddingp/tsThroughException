package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        char[] array = new char[3];
//        String s = null;
//        System.out.println(s.length());
//        System.out.println(array[5]);
        System.out.println("Hello");
        File FileF = new File("FileF.txt");
//        FileInputStream fis = new FileInputStream(FileF);
//        fis.read();
        FileOutputStream fos = new FileOutputStream("FileF.txt");
        for (int i = 65; i < 90; i++) {
            fos.write(i);
        }

        try {
            System.out.println(array[5]);
            System.out.println("trying to make an error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception " + e +" was cought");
        }
        finally {
            assert System.out != null;
            System.out.println("It is an final block");
        }
        FileInputStream fis = new FileInputStream(FileF);
        for (int i = 65; i < 90; i++) {
            fos.write(i);
            String fisInt = Arrays.toString(new int[]{fis.read()});
            System.out.println(fisInt);
        }
//
        fis.close();
        fos.close();


    }
}
