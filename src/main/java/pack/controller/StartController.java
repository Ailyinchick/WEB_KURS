package pack.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {
    public static String type;

    @GetMapping(value = "/")
    public String start() {
        return "start";
    }

    @GetMapping(value = "/selectJiga")
    public String selectJiga(ModelMap modelMap) {
        type = "жигуль";
        modelMap.addAttribute("car", "Жигуль");
        return "carPage";
    }

    @GetMapping(value = "/selectBentley")
    public String selectFerrari(ModelMap modelMap) {
        type = "ведро";
        modelMap.addAttribute("car", "Ведро");
        return "carPage";
    }

}
