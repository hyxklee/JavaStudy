package Test.ch8;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.interfaces.EdECKey;
import java.text.ParseException;

public class HttpClientExam {
    public void start(){
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://kiosk.free.beeceptor.com/menu")).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // InputStream is = client.send(request, HttpResponse.BodyHandlers.ofInputStream()).body();
            System.out.println("reponse code: "+response.statusCode());
            System.out.println("reponse: "+response.body());
            printMenu(response.body());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void printMenu(String data) throws ParseException{
        JSONParser
    }
}

