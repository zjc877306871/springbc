package com.zhangjc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by YJ on 2017/12/28.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello world";
    }
}
