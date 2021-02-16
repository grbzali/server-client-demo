package kodluyoruz.server;

import kodluyoruz.Singleton;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(12345);
            Singleton.setSocket(serverSocket.accept());

//            out = new PrintWriter(clientSocket.getOutputStream(), true);
//            Thread.sleep(5000);
//            out.println("hello client");
//            in.close();
//            out.close();
//            clientSocket.close();
//            serverSocket.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
