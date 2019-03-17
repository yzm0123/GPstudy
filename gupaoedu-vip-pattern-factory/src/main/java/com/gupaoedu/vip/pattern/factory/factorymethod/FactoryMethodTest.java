package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.Icourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IcourseFactory icourseFactory = new JavaCourseFactory();
        Icourse javaCourse = icourseFactory.create();
        javaCourse.record();
    }

}
