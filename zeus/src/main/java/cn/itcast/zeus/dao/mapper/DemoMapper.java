package cn.itcast.zeus.dao.mapper;

import cn.itcast.zeus.dao.entity.Demo;
import cn.itcast.zeus.dao.entity.DemoExample;
import java.util.List;

public interface DemoMapper {
    long countByExample(DemoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Demo record);

    int insertSelective(Demo record);

    List<Demo> selectByExample(DemoExample example);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}