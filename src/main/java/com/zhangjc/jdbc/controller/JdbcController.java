package com.zhangjc.jdbc.controller;

import com.zhangjc.jdbc.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YJ on 2018/1/15.
 */
@RestController
public class JdbcController {

    @Autowired
    private JdbcService jdbcService;

    @RequestMapping("/jdbcIndex")
    public String jdbcIndex(){
        jdbcService.insert();
        return "success";
    }

}
