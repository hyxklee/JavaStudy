package Test.ch8;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HttpsUrlTest {
    public static void main(String[] args){
        final String site = "https://kiost.free.beeceptor.com/menu";
        try{
            URL url = new URL(site);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            while((inputLine = in.readLine())!= null){
                System.out.println(inputLine);
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
