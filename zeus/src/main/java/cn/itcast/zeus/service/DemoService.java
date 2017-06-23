package cn.itcast.zeus.service;

import cn.itcast.common.Exception.HelperException;
import cn.itcast.zeus.dao.entity.Demo;
import java.util.List;

/**
 * Created by tmh0214 on 17/6/22.
 */
public interface DemoService {
    Demo selectDemoById(Integer id);

    List<Demo> selectDemosByClassId(Integer classId);

    void testTra() throws HelperException;
}
