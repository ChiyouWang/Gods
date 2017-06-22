package cn.itcast.zeus.controller.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tmh0214 on 17/6/22.
 */
@RestController
public class indexController {

    @RequestMapping(value = "/")
    public String index(){
        return "Welcome zeus system";
    }
}
