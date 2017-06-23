package cn.itcast.zeus.dao.Repository.impl;

import cn.itcast.common.Exception.HelperException;
import cn.itcast.zeus.dao.Repository.DemoRepository;
import cn.itcast.zeus.dao.entity.Demo;
import cn.itcast.zeus.dao.entity.DemoExample;
import cn.itcast.zeus.dao.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tmh0214 on 17/6/22.
 */
@Repository
public class DemoRepositoryImpl implements DemoRepository{

    @Autowired
    DemoMapper demoMapper;

    @Override
    public List<Demo> selectDemosByClassId(Integer classId) {
        DemoExample demoExample = new DemoExample();
        demoExample.createCriteria().andUserClassEqualTo(classId);
        List<Demo> demos = demoMapper.selectByExample(demoExample);
        if(demos.isEmpty()){
            return null;
        }else{
            return demos;
        }
    }

    @Override
    public Demo selectDemoById(Integer id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Demo update(Demo demo) throws HelperException{
        int rel = demoMapper.updateByPrimaryKeySelective(demo);
        if(rel == 1){
            return demo;
        }else{
            throw new HelperException("Demo 更新异常");
        }
    }
}
