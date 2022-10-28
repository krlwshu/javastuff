package com.company;
import java.io.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        try {

            File file = new File("c:\\filepath.mp3");
            FileInputStream in = new FileInputStream(file);
            FileOutputStream fout = new FileOutputStream("c:\\fileout.mp3");
            BufferedInputStream bufIn = new BufferedInputStream(in);
            BufferedOutputStream bufOut = new BufferedOutputStream(fout);

            int line;
            while((line=in.read()) != -1){

                bufOut.write(line);

            }

            out.close();
        } catch (Exception e){
            e.getStackTrace();
        }

    }
}
