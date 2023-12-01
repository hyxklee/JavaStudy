package Test.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args){
        int serverPort = 8080;
        try {
            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("server is listening on port "+serverPort);
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String msg = in.readLine();
                System.out.println(msg);

                out.println("이 메시지는 서버에서 클라이언트로 전송되는 확인 메시지 입니다!");

                out.close();
                in.close();
                socket.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
