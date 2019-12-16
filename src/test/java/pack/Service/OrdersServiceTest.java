package pack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import pack.config.HibernateConfig;
import pack.config.WebConfig;
import pack.dao.OrderRepos;
import pack.model.Orders;


@ComponentScan(basePackages = "pack")
@ContextConfiguration(classes = {WebConfig.class, HibernateConfig.class})
@WebAppConfiguration
@PropertySource("classpath:db.properties")
@PropertySource(value = "classpath:hibernate.properties")
public class OrdersServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderRepos orderRepos;

    @Test
    public void testWrite() {
        System.out.println(orderService.getAll());
    }
}