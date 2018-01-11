//package com.zhangjc.classLoad;
//
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
///**
// * Created by YJ on 2018/1/2.
// */
//public class MyClassLoader extends ClassLoader{
//
//    private String classPath;
//
//
//    public MyClassLoader(String classPath){
//        super(ClassLoader.getSystemClassLoader());
//        this.classPath = classPath;
//    }
//
//    @Override
//    protected Class<?> findClass(String name) throws ClassNotFoundException {
//        byte[] data = this.loadClassData(name);
//        return this.defineClass(name,data,0,data.length);
//    }
//
//    /**
//     * 加载类加载的内容
//     * @param name
//     * @return
//     */
//    public byte[] loadClassData(String name) {
//        try {
//            name = name.replace(".", "//");
//            FileInputStream in = new FileInputStream(new File(classPath + name + ".class"));
//            ByteArrayOutputStream out = new ByteArrayOutputStream();
//            int b = 0;
//            while ((b = in.read()) != -1) {
//                out.write(b);
//            }
//            in.close();
//            return out.toByteArray();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
