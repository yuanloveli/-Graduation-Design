package com.dq.springboot_recruit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月10日 上午9:49:27
* 设置项目欢迎页面
*/
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "forward:index_jober.html";
    }
}
