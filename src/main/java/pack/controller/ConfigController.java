package pack.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pack.Service.ChooseCar;

@Controller
public class ConfigController {

    @Autowired
    ChooseCar chooseCar;

    @GetMapping(value = "/configCar")
    public String configCar(@RequestParam String body, @RequestParam String color, ModelMap modelMap) {
        modelMap.addAttribute("config", chooseCar.getCarByConfig(StartController.type, body, color));
        return "order";
    }

}
