package com.zhangjc.classLoad;

/**
 * Created by YJ on 2018/1/17.
 * 后台线程一直监控热加载
 */
public class MsgHandler implements Runnable{
    @Override
    public void run() {
        while(true){
            BaseManage baseManage = ManageFactory.getManage(ManageFactory.MY_MANAGE);
            baseManage.logic();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
