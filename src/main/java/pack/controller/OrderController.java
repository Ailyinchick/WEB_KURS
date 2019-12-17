package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pack.Service.ChooseCar;
import pack.Service.OrderService;
import pack.Service.UserService;
import pack.dao.OrderRepos;
import pack.model.Orders;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class OrderController {

    @Autowired
    ChooseCar chooseCar;

    @Autowired
    UserService userService;

    @Autowired
    OrderRepos orderRepos;

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/takeOrder")
    public String takeOrder(ModelMap modelMap) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Orders orders = new Orders();
        orders.setCar(chooseCar.getCarType());
        orders.setDate(formatter.format(new Date()));
        orders.setOwner(userService.getUserByUsername(getPrincipal()).getLogin());

        orderService.write(orders);

        modelMap.addAttribute("statistic", orderRepos.findAll(Orders.class, orderRepos.getBeanToBeAutowired()));
        return "statistic";
    }

    private static String getPrincipal() {
        String userName = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
}
