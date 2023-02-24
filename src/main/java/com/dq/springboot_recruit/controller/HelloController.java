package com.dq.springboot_recruit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yuanli
 * @date 2023/2/23 17:21
 */

@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "forward:index_jober.html";
    }
}
