package com.mako.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
//        inputStream();
//        fileReader();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine(); //readLine()讀取一行，蒐集字元直到跳行字元再給你
            while (line != null) { //readLine()碰到跳行字元就會無視，故用null
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read(); //ASCII number
            while (n != -1) {
                System.out.print((char)n); //轉型char印出
                n = fr.read(); //讀新的資料
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputStream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            FileInputStream is = new FileInputStream(file);
            int n = is.read(); //ASCII number
            while(n != -1) {
                System.out.print((char)n); //轉型char印出
                n = is.read(); //讀新的資料
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("message");
        System.out.println("File open success");
    }
}
