package web.sevice;

import web.model.Car;

import java.util.List;

public class ServiceCar {
    public List<Car> getCars (List<Car>cars, int count) {
        if (count >= 1 && count < 5) {
            return cars.subList(0, count);
        }
        if (count >= 5) {
            return cars;
        }
        return null;
    }
}
