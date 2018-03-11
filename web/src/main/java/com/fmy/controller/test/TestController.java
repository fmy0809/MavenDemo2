package com.fmy.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/3/11.
 */
@Controller
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String say(){
        return "Hello demo2!";
    }
}
