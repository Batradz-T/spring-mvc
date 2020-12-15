package web.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceCar {
    @Autowired
    private CarDao carDao;

    public List<Car> getCars (int count) {
        return carDao.getCars(count);

    }
}
