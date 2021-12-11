package network_chat_two;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Application implements Runnable { // реализуем интерфейс Runnable

    public void run() { // Этот метод будет выполняться в отдельном потоке
        System.out.println("Старт отдельного потока");
        try {
            //Thread.sleep(10000);
            System.out.println("Стартуем серверный сокет");
            //
            // создаем серверный сокет на порту 1234
            ServerSocket server = new ServerSocket(1234);
            while(true) {
                System.out.println("Waiting...");

                // ждем клиента
                Socket socket = server.accept();
                System.out.println("Client connected!");

                // получаем потоки ввода и вывода
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();

                // создаем удобные средства ввода и вывода
                Scanner in = new Scanner(is);
                PrintStream out = new PrintStream(os);

                // читаем из сети и пишем в сеть
                out.println("Welcome to mountains!");
                String input = in.nextLine();
                while (!input.equals("bye")){
                    out.println(input + "-" + input + "-" +
                            input.substring(input.length() / 2) + "...");
                    input = in.nextLine();
                }
                socket.close();
            }
            //
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Закончили что-то делать в отдельном потоке");
    }
}
