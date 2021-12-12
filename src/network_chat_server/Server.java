package network_chat_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        // создаем серверный сокет
        ServerSocket serverSocket = new ServerSocket(3443);
        System.out.println("SRV started...");

        // ждем клиента
        Socket socket = serverSocket.accept();
        System.out.println("Client connected");

        // получаем потоки ввода-вывода
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        //
        Scanner in = new Scanner(is);
        PrintStream out = new PrintStream(os);

        // читаем из сети и пишем в сеть
        out.println("What is your name? ");
        out.println("Hi: " + in.nextLine());
    }
}
