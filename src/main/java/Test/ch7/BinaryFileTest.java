package Test.ch7;

import java.io.*;

public class BinaryFileTest {
    public static void main(String[] args){
        try{
            BufferedInputStream is = new BufferedInputStream(new FileInputStream("a.jpg"));
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("b.jpg"));

            byte[] buffer = new byte[16384];
            while(is.read(buffer) != -1){
                os.write(buffer);
            }
            is.close();
            os.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
