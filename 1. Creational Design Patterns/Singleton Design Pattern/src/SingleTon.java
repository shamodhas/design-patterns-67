/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 12:41 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class SingleTon {
    private static SingleTon instance;
//    private String connection;

    private SingleTon() {
//        connection = "hello";
        System.out.println("SinglTon instance created");
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

//    public String getConnection() {
//        return connection;
//    }
}





