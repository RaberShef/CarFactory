package com.berksefkatli.carfactory.controller;

import com.berksefkatli.carfactory.service.CarFactoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarFactoryController {

    private final CarFactoryService carFactoryService;

    public CarFactoryController(CarFactoryService carFactoryService) {
        this.carFactoryService = carFactoryService;
    }

    @PostMapping(path = "/produce", produces = "application/json")
    @ResponseBody
    public String produce(@RequestParam("carType") String carType) {
        return carFactoryService.produce(carType);
    }

}
