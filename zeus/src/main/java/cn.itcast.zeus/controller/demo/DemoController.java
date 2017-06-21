package cn.itcast.zeus.controller.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tmh0214 on 17/6/21.
 */

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(value = "/luck")
    public String demo(){
        return "Luck Day!!!";
    }
}
