package repository.impl;

import db.Storage;
import handler.ConsoleHandler;
import model.Car;
import repository.CarsDAO;

/**
 * @author Serhii Klunniy
 */
public class CarsDAOImpl implements CarsDAO {
    @Override
    public void addCar(Car car) {
        if (car == null)
            return;
        Storage.addCar(car);
    }

    @Override
    public Car[] getCars() {
        return Storage.getCars();
    }
}
