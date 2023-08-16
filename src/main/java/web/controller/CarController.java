package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.repository.CarRepository;
import web.model.Car;


import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarRepository carRepository;
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", defaultValue = "5") int count, Model model){
        List<Car> listCars = carRepository.getAllCars();
        List<Car> carsToShow;

        if (count >= 5) {
            carsToShow = listCars;
        } else {
            carsToShow = listCars.subList(0, Math.min(count, listCars.size()));
        }

        model.addAttribute("cars", carsToShow);
        return "cars";
    }
}
