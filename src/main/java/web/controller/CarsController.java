package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {
    CarService carService;
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
        public String getCarPage (@RequestParam(value = "count", required = false) Integer count, Model model) {       //@PathVariable(value = "count", required = false) int count, Model model
        model.addAttribute(carService.getCars(count));
        return "car";
        }

}
