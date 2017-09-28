package com.springboot01.springboot01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/27/ 21:48 星期三<BR>
 * <p>
 * <B>系统名称：</B>springbootq<BR>
 * <B>概要说明：</B>springboot
 * 的测试 controller 控制层。
 * <BR>
 */
//@RequestMapping("/test01")
@RestController
public class TestController {


    // 从配置文件里面获取 数据。还可以根据 什么 前缀来获取 数据。
    @Value("${com.springboot.name}")
    private String name;

    @Value("${com.springboot.title}")
    private String title;

    @Value("${com.springboot.desc}")
    private String desc;



    // http://localhost:8080  就会进入这个里面来。
//    @PostMapping("/")
    @GetMapping("/")
    public String index() {
        return "kobe，" + name + "，" + title + "，" + desc;
    }

    //带参数的方法处理
    @RequestMapping("/{myName}")
    public String home(@PathVariable String myName){
        System.out.println("====：" + myName);
        return "你好,同学，"+myName;
    }

}
