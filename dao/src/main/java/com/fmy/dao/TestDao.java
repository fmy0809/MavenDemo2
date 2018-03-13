package com.fmy.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Administrator on 2018/3/11.
 */
@Repository
public interface TestDao {
    @Select("select * from testdb ")
    Map<String,Object> getTest();
}
