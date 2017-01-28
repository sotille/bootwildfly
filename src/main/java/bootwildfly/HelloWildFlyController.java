package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWildFlyController
{

    @RequestMapping("hell")
    public String sayHello()
    {
        return ("Hello, SpringBoot on Wildfly");
    }

    @RequestMapping("hell1")
    public String sayHello1()
    {
        return ("Hello, SpringBoot on Wildfly");
    }
}