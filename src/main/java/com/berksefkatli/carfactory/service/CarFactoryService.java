package com.berksefkatli.carfactory.service;

import com.berksefkatli.carfactory.model.Cabrio;
import com.berksefkatli.carfactory.model.Car;
import com.berksefkatli.carfactory.model.Hatchback;
import com.berksefkatli.carfactory.model.Sedan;
import org.springframework.stereotype.Service;

@Service
public class CarFactoryService {

    public String produce(String carType) {
        Car car;
        switch (carType) {
            case "cabrio":
                car = new Cabrio();
                break;
            case "sedan":
                car = new Sedan();
                break;
            case "hatchback":
                car = new Hatchback();
                break;
            default:
                return "Unknown car type received, must be of type 'cabrio', 'sedan' or 'hatchback'";
        }
        return car.getType() + " Car has produced.";
    }
}
