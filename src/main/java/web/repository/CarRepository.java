package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    private static final List<Car> carList = new ArrayList<>(8);

    public CarRepository() {
        carList.add(new Car("BMW", "5M", 15000.0));
        carList.add(new Car("LADA", "PRIORA", 3000.0));
        carList.add(new Car("AUDI", "Q5", 12000.0));
        carList.add(new Car("TOYOTA", "CROWN", 9000.0));
        carList.add(new Car("BMW", "3", 11000.0));
    }

    public List<Car> getAllCars() {
        return carList;
    }

}
