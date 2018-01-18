package com.zhangjc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YJ on 2017/12/28.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("终于解决了");
        return "hello world";
    }


}
