package cn.itcast.zeus.service.impl;

import cn.itcast.zeus.dao.Repository.DemoRepository;
import cn.itcast.zeus.dao.entity.Demo;
import cn.itcast.zeus.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tmh0214 on 17/6/22.
 */
@Service
public class DemoServiceImpl implements DemoService {

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


}
