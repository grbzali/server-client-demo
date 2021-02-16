package kodluyoruz;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Singleton {
    private static Socket socket;

    public static Socket getSocket() {
        return socket;
    }

    public static void setSocket(Socket socket) {
        Singleton.socket = socket;
    }

    public static PrintWriter getWriter() throws IOException {
        return new PrintWriter(socket.getOutputStream(), true);
    }

    public static void sendMessage(String message) throws IOException {
        getWriter().println(message);
    }

}
