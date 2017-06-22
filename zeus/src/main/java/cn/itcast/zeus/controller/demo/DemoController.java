package cn.itcast.zeus.controller.demo;

import cn.itcast.zeus.dao.entity.Demo;
import cn.itcast.zeus.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tmh0214 on 17/6/21.
 */

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/luck")
    public String demo(){
        return "Luck Day!!!";
    }

    @RequestMapping(value = "/getDemo")
    public Demo DemoDemo(){
        return demoService.selectDemoById(1);
    }

    @RequestMapping(value = "/test")
    public List<Demo> testquery(){
        return demoService.selectDemosByClassId(1);
    }

}
