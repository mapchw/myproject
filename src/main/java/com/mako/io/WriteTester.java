package com.mako.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkDir = new File("D:\\jk");
        jkDir.mkdir(); //創建資料夾"jk"
//        jkDir.mkdirs(); //創建多層次的資料夾

        FileWriter fw = new FileWriter("D:\\jk\\output.txt");
        fw.write("abc");
        fw.flush(); //把資料沖到目的地
        fw.close(); //關閉串流
    }
}
