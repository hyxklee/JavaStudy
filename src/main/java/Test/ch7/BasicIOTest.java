package Test.ch7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BasicIOTest {
    public static void main(String[] args){
        InputStream in = System.in;
        OutputStream out = System.out;

        int input;
        try{
            System.out.printf("## Input 1~3 char: ");
            input = in.read();
            System.out.println("## 1byte read and print");
            System.out.println(input);
            out.write(input);
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
