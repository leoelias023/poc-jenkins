package com.example.cadastroveiculo.controller;

import com.example.cadastroveiculo.entities.Brand;
import com.example.cadastroveiculo.entities.Car;
import com.example.cadastroveiculo.repositories.CarRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    CarRepository carRepository;

    @ModelAttribute("brands")
    public List<Brand> brands() {
        return Arrays.asList(Brand.values());
    }

    @ModelAttribute("cars")
    public Iterable<Car> allCars() {
        return carRepository.findAll();
    }

    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    public String addCar(@ModelAttribute Car car) {
        carRepository.save(car);
        return "redirect:/";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("car", new Car());
        return "index";
    }

}
