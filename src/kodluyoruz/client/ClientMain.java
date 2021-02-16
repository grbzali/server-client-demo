package kodluyoruz.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    private Socket clientSocket;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        Scanner in = new Scanner(clientSocket.getInputStream());
        while (in.hasNextLine()) {
            String coordinates = in.nextLine(); // 125:14
            String[] test  = coordinates.split(":");
            int x = Integer.parseInt(test[0]);
            int y = Integer.parseInt(test[1]);

        }
    }

//    public void stopConnection() {
//        in.close();
//        //out.close();
//        clientSocket.close();
//    }

    public static void main(String args[]) {

    }
}