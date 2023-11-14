import handler.ConsoleHandler;
import model.Car;
import repository.CarsDAO;
import repository.impl.CarsDAOImpl;

/**
 * Создать два машины, покласть их в массив, массив развернуть/реверс сделатьб
 * и вывести на экран
 */
public class Main {
    public static void main(String[] args) {
        String carName = ConsoleHandler.getNameCar();
        Car car = new Car(carName);

        CarsDAO carsDAO = new CarsDAOImpl();
        carsDAO.addCar(car);

        Car[] cars = carsDAO.getCars();

        for (Car owner : cars) {
            System.out.println(owner);
        }

    }
}
