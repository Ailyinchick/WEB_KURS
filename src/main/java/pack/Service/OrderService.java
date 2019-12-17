package pack.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pack.dao.OrderRepos;
import pack.model.Orders;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepos orderRepos;

    @Transactional
    public void write(Orders orders) {
        orderRepos.testingCreateMethod(orders, orderRepos.getBeanToBeAutowired());
    }

}
