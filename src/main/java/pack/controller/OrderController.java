package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pack.Service.ChooseCar;
import pack.Service.OrderService;
import pack.dao.OrderRepos;
import pack.model.Orders;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class OrderController {

    @Autowired
    ChooseCar chooseCar;

    @Autowired
    OrderRepos orderRepos;

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/takeOrder")
    public String takeOrder(@RequestParam String nickname, ModelMap modelMap) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Orders orders = new Orders();
        orders.setCar(chooseCar.getCarType());
        orders.setDate(formatter.format(new Date()));
        orders.setOwner(nickname);

        orderService.write(orders);

        modelMap.addAttribute("statistic", orderRepos.findAll(Orders.class, orderRepos.getBeanToBeAutowired()));
        return "statistic";
    }
}
