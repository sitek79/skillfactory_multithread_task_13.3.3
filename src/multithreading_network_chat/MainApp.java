package multithreading_network_chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainApp {
    public MainApp() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        // создаем серверный сокет на порту 1234
        ServerSocket server = new ServerSocket(1234);
        while(true) {
            System.out.println("Waiting...");
            // ждем клиента из сети
            Socket socket = server.accept();
            System.out.println("Client connected!");
            // создаем клиента на своей стороне
            Client client = new Client(socket);
            // запускаем поток
            // получаем экземпляр так:
            Thread thread = new Thread(client);
            // или так:
            //Thread thread = new Thread (new Client(s));
            // или так
            //new Thread (new Client(s)).start();
            thread.start();
        }
    }
}
