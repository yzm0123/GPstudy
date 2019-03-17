package com.gupaoedu.vip.pattern.factory.simplefactory;

import  com.gupaoedu.vip.pattern.factory.Icourse;
import  com.gupaoedu.vip.pattern.factory.JavaCourse;

public class CourseFactory {
    public Icourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else {
            return null;
        }
    }

    public Icourse createCourse (Class clazz){
        if (clazz != null){
            try {
                return (Icourse)clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
