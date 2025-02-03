/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 12:42 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        SingleTon singleTon3 = SingleTon.getInstance();

        System.out.println("1 and 2 :" + singleTon1.equals(singleTon2));
        System.out.println("2 and 3 :" + singleTon2.equals(singleTon3));
        System.out.println("1 and 3 :" + singleTon1.equals(singleTon3));

        System.out.println("1 : " + singleTon1.hashCode());
        System.out.println("2 : " + singleTon2.hashCode());
        System.out.println("3 : " + singleTon3.hashCode());
    }
}
