package cn.itcast.zeus.controller.demo;

import cn.itcast.common.Exception.HelperException;
import cn.itcast.common.controller.BaseController;
import cn.itcast.zeus.dao.entity.Demo;
import cn.itcast.zeus.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by tmh0214 on 17/6/21.
 */

@RestController
@RequestMapping(value = "/demo")
public class DemoController extends BaseController{

    /**
     * 测试基础构建
     */

    private Logger logger =  LoggerFactory.getLogger(DemoController.class);

    @Autowired
    DemoService demoService;

    /**
     * 测试： web 入口
     * @return
     */
    @RequestMapping(value = "/luck")
    public Map<String, Object> demo(){
        return success("Luck Day");
    }

    /**
     * 测试：  mybatis 整合
     * @return
     */
    @RequestMapping(value = "/getDemo")
    public Map<String, Object> DemoDemo(){
        Demo demo = demoService.selectDemoById(1);
        return success(demo);
    }

    /**
     * 测试：  mybatis 插件 动态sql 查询
     * @return
     */
    @RequestMapping(value = "/test")
    public Map<String, Object> testquery() {
        List<Demo> demos = demoService.selectDemosByClassId(1);
        return success(demos);
    }

    /**
     * 测试：  自定义异常
     * @return
     */
    @RequestMapping(value = "/exception")
    public Map<String, Object> exception() {
        try{
            String a = "异常测试";
            throw new HelperException("测试异常类" + a);
        } catch (HelperException e) {
            return fail(e.getMessage());
        }
    }

    /**
     * 测试：  log打印
     * @return
     */
    @RequestMapping(value = "/log")
    public Map<String, Object> log() {
        logger.warn("============>>>>>>  测试log打印 tom<<<<<< ========= ");
        return success();
    }

    /**
     * 事务测试
     * @return
     */
    @RequestMapping(value = "/tra")
    public Map<String, Object> tra() {
        try{
            demoService.testTra();
            return success();
        }catch(HelperException e){
            return fail(e.getMessage());
        }
    }



}
