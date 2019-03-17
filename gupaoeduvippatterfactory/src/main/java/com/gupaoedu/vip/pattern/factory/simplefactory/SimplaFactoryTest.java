package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.Icourse;
import com.gupaoedu.vip.pattern.factory.JavaCourse;

public class SimplaFactoryTest {

    public static void main(String[] args) {
//        Icourse icourse = new JavaCourse();
//        icourse.record();

        CourseFactory courseFactory = new CourseFactory();
        Icourse icourse = courseFactory.create("java");
        icourse.record();

        Icourse icourse2 = courseFactory.createCourse(JavaCourse.class);
        icourse2.record();
    }
}
