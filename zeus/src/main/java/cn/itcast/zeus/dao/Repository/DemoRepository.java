package cn.itcast.zeus.dao.Repository;

import cn.itcast.zeus.dao.entity.Demo;

import java.util.List;

/**
 * Created by tmh0214 on 17/6/22.
 */
public interface DemoRepository {

    List<Demo> selectDemosByClassId(Integer classId);

    Demo selectDemoById(Integer id);
}
