package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("some_model_01", 001, 1000));
        carList.add(new Car("some_model_02", 002, 2000));
        carList.add(new Car("some_model_03", 003, 3000));
        carList.add(new Car("some_model_04", 004, 4000));
        carList.add(new Car("some_model_05", 005, 5000));
    }
    @Override
    public List<Car> getCars(Integer count) {
        if(count != null && count >= 0 && count <= this.carList.size()) {
            return this.carList.subList(0, count);
        }
        return this.carList;
    }
}