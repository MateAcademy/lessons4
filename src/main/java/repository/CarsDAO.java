package repository;

import model.Car;

/**
 * @author Serhii Klunniy
 */
public interface CarsDAO {

    public void addCar(Car car);

    public Car[] getCars();
}
