package com.zhangjc.classLoad;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by YJ on 2018/1/2.
 */
public class ManageFactory {
    private static final Map<String, loadInfo> loadMap = new HashMap<String, loadInfo>();
    private static final String CLASS_PATH = "E:/work/java/project/project-01-idea/workspace/springbc";
    private static final String MY_MANAGE = "com.zhangjc.classLoad.MyClassLoader";

    public BaseManage getManage(String name){
        File loadFile = new File(CLASS_PATH + name.replace("\\.","/"));
        long modifyTime = loadFile.lastModified();
        //如果为空，需重新加载该类的JVM
        if(loadMap.get(name) == null){
            return loadClass(name,modifyTime);
        }
        //如果时间戳变了，需重新加载该类的JVM
        else if(loadMap.get(name) != null){
            return loadClass(name,modifyTime);
        }
        return  loadMap.get(name).getBaseManage();



    }

    public BaseManage loadClass(String name, long time){

        MyClassLoader loader = new MyClassLoader(CLASS_PATH);
        Class<?> loadClass = null;
//        loadClass = loader.loadClass(name);
        return null;

    }


}
