import factory.Car;
import factory.CarFactory;
import factory.CarType;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 1:03 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car mustang = carFactory.createCar(CarType.MUSTANG);
        Car audi = carFactory.createCar(CarType.AUDI);
        Car gtr = carFactory.createCar(CarType.GTR);
        Car lambo = carFactory.createCar(CarType.LAMBO);

        System.out.println("Car 1: " + mustang.getDetails());
        System.out.println("Car 2: " + audi.getDetails());
        System.out.println("Car 3: " + gtr.getDetails());
        System.out.println("Car 4: " + lambo.getDetails());
    }
}
