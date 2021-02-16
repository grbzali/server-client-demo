package kodluyoruz;

import kodluyoruz.server.ServerThread;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        new ServerThread().start();
        Thread.sleep(10000);
        PrintWriter writer = new PrintWriter(Singleton.getSocket().getOutputStream(), true);
        Singleton.getSocket();
        Singleton.sendMessage("gurbuz");
        Thread.sleep(5000);
        Singleton.sendMessage("ali");
    }
}
