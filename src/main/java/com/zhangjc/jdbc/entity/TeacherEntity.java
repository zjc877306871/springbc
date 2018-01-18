package com.zhangjc.jdbc.entity;

/**
 * Created by YJ on 2018/1/15.
 */
public class TeacherEntity {

    private String tId;
    private String tNmae;

    public String gettId() {
        return tId;
    }

    public String gettNmae() {
        return tNmae;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public void settNmae(String tNmae) {
        this.tNmae = tNmae;
    }
}
