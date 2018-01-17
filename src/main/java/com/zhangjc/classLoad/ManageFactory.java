package com.zhangjc.classLoad;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by YJ on 2018/1/2.
 */
public class ManageFactory {
    private static final Map<String, loadInfo> loadMap = new HashMap<String, loadInfo>();
    private static final String CLASS_PATH = "E:/work/java/project/project-01-idea/workspace/springbc";
    public static final String MY_MANAGE = "com.zhangjc.classLoad.BaseManageImpl";

    public static BaseManage getManage(String name){
        BaseManage manage = null;
        File loadFile = new File(CLASS_PATH + name.replace("\\.","/"));
        long modifyTime = loadFile.lastModified();
        //如果为空，需重新加载该类的JVM
        if(loadMap.get(name) == null){
           loadClass(name,modifyTime);
        }
        //如果时间戳变了，需重新加载该类的JVM
        else if(loadMap.get(name) != null){
            loadClass(name,modifyTime);
        }
        manage = loadMap.get(name).getBaseManage();
        return manage;


    }

    public static void loadClass(String name, long time){

        MyClassLoader myClassLoader = new MyClassLoader(CLASS_PATH);
        Class<?> loadClass = null;
        try {
            loadClass = myClassLoader.loadClass(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        BaseManage manage = newInstance(loadClass);
        loadInfo loadInfo = new loadInfo(myClassLoader,time);
        loadInfo.setBaseManage(manage);
        loadMap.put(name,loadInfo);

    }

    //通过反射方式创建baseManage及其子类对象
    private static BaseManage newInstance(Class<?> loadClass) {

        try {
            return (BaseManage)loadClass.getConstructor(new Class[]{}).newInstance(new Object[]{});
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }


}
