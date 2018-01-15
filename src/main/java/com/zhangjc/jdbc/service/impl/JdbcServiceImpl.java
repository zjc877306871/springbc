package com.zhangjc.jdbc.service.impl;

import com.zhangjc.jdbc.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by YJ on 2018/1/15.
 */
@Service
public class JdbcServiceImpl implements JdbcService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert() {
        jdbcTemplate.update("insert into teacher values (?,?)",05,"肖老师");
    }
}
