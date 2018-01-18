package com.zhangjc.jdbc.mapper;

import com.zhangjc.jdbc.entity.TeacherEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by YJ on 2018/1/15.
 */

@Component
public interface TeacherMapper {

    @Select("select * from teacher where tId = #{tId}")
    public TeacherEntity selectById(@Param("tId") String id);
}
