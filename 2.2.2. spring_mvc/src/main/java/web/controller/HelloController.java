package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.sevice.ServiceCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
	private List<Car> cars = new ArrayList<>();

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		for (int i = 1; i <= 5; i++ ) {
			cars.add(new Car("fuel" + i, "transmission" + i, "model" + i));
		}
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String printCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {
		ServiceCar serviceCar = new ServiceCar();
		model.addAttribute("cars", serviceCar.getCars(cars, count));
		return "cars";
	}

	
}