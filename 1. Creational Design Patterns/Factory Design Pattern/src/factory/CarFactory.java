package factory;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 12:54 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class CarFactory {
    public Car createCar(CarType carType) {
        return switch (carType) {
            case GTR -> new Gtr();
            case LAMBO -> new Lambo();
            case MUSTANG -> new Mustang();
            case AUDI -> new Audi();
            default -> null;
        };
    }
}
