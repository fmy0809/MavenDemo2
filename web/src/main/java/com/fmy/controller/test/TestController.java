package com.fmy.controller.test;

import com.fmy.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2018/3/11.
 */
@Controller
public class TestController {

    @Autowired
    private TestDao testDao;

    @GetMapping("/test")
    @ResponseBody
    public String say(){
        return "Hello demo2!";
    }

    @GetMapping("/test/dao")
    @ResponseBody
    public Map<String,Object> getTest(){

        return testDao.getTest();
    }
}
