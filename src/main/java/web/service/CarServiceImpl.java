package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 1, 2007));
        cars.add(new Car("BMW", 2, 2015));
        cars.add(new Car("Jeep", 15, 2024));
        cars.add(new Car("Toyota", 4, 1998));
        cars.add(new Car("Volkswagen", 12, 2005));
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> newCars = cars.stream().limit(count).collect(Collectors.toList());
        return newCars;
    }
}
