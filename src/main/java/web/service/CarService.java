package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public List<Car> getCarList(int count) {
        List<Car> listCars = carRepository.getAllCars();

        if (count >= 5) {
            return listCars;
        } else {
            return listCars.subList(0, Math.min(count, listCars.size()));
        }

    }
}
