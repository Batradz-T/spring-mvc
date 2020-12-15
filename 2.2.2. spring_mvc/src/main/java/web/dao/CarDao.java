package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private   List<Car> cars = new ArrayList<>();

    public CarDao() {
        for (int i = 1; i <= 5; i++) {
            cars.add(new Car("fuel" + i, "transmission" + i, "model" + i));
        }
    }

    public List<Car> getCars (int count) {
        if (count >= 1 && count < 5) {
            return cars.subList(0, count);
        }
        if (count >= 5) {
            return cars;
        }
        return null;
    }
}
