package Test.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args){
        String serverIP = "127.0.0.1";
        int serverPort = 8080;

        try {
            Socket socket = new Socket(serverIP,serverPort);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true    );
            System.out.print("서버에 보낼 메시지를 입력: ");
            Scanner scan = new Scanner(System.in);
            String msg = scan.nextLine();
            out.println("이강혁> "+msg);

            String resp = in.readLine();
            System.out.println("Server response: "+resp);

            out.close();
            in.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
