package network_chat_two;

public class MainApp2 {
    static Application application;

    public static void main(String[] args) {
        application = new Application();

        Thread myThready = new Thread(application);        //Создание потока "myThready"
        myThready.start();                                //Запуск потока

        System.out.println("Главный поток завершён...");
    }
}
