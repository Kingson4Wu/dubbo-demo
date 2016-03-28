package cn.test.dubbo.consumer.controller;

import cn.test.dubbo.registry.service.TestRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <a href = 'http://blog.csdn.net/congcong68/article/details/41113239'>@link</a>
 */
@RestController
public class IndexController {

    @Autowired
    private TestRegistryService testRegistryService;

    /** http://localhost:8081/dubbo-consumer/hello **/
    @RequestMapping("/hello")
    public String index(Model model) {
        String name = testRegistryService.hello("zz");
        System.out.println("xx==" + name);
        return name;
    }

}