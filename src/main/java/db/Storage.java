package db;

import model.Car;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Serhii Klunniy
 */
public class Storage {
    private static int index = 0;
    private static Car[] cars = new Car[index];


    static {
        Car car1 = new Car("audi");
        Car car2 = new Car("mercedes");

        addCar(car1);
        addCar(car2);
    }

    public static void addCar(Car car) {
            cars = Arrays.copyOf(cars, cars.length + 1);
            cars[index++] = car;
    }


    public static Car[] getCars() {
        return cars;
    }


}
