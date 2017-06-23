package cn.itcast.zeus.service.impl;

import cn.itcast.common.Exception.HelperException;
import cn.itcast.zeus.dao.Repository.DemoRepository;
import cn.itcast.zeus.dao.entity.Demo;
import cn.itcast.zeus.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by tmh0214 on 17/6/22.
 */

@Transactional(rollbackFor = Exception.class)
@Service
public class DemoServiceImpl implements DemoService {

    private Logger logger =  LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    DemoRepository demoRepo;

    @Override
    public Demo selectDemoById(Integer id) {
        return demoRepo.selectDemoById(id);
    }

    @Override
    public List<Demo> selectDemosByClassId(Integer classId) {
        return demoRepo.selectDemosByClassId(classId);
    }



    @Override
    public void testTra()throws HelperException {
        Demo demo = demoRepo.selectDemoById(1);
        demo.setUserClass(100);
        logger.warn("========>>>>>>>> 开始更新 <<<<<<<=========");
        demoRepo.update(demo);
        logger.warn("========>>>>>>>> 更新结束<<<<<<<=========");

//        手动抛出异常
        throw new HelperException("更新失败！！！");

    }
}
