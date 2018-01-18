package com.zhangjc.jdbc.controller;

import com.zhangjc.jdbc.entity.TeacherEntity;
import com.zhangjc.jdbc.mapper.TeacherMapper;
import com.zhangjc.jdbc.service.JdbcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YJ on 2018/1/15.
 */
@RestController
public class JdbcController {

    Logger logger = LoggerFactory.getLogger(JdbcController.class);
    @Autowired
    private JdbcService jdbcService;

    @Autowired
    private TeacherMapper teacherMapper;
    @RequestMapping("/jdbcIndex")
    public String jdbcIndex(){
        jdbcService.insert();
        logger.info("对了么");
        return "success";
    }

    @RequestMapping("/getTeacher")
    public String getTeacher(@RequestParam("id") String id){
        TeacherEntity teacherEntity =  teacherMapper.selectById(id);
        System.out.print(teacherEntity.gettNmae());
        return "success";
    }

}
