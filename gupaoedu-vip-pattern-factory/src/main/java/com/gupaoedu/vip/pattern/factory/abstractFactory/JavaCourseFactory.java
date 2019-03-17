package com.gupaoedu.vip.pattern.factory.abstractFactory;

import com.gupaoedu.vip.pattern.factory.Icourse;
import com.gupaoedu.vip.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public Icourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
