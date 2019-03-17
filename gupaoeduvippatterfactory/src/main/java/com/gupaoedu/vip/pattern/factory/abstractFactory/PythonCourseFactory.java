package com.gupaoedu.vip.pattern.factory.abstractFactory;

import com.gupaoedu.vip.pattern.factory.Icourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public Icourse createCourse() {
        return null;
    }

    @Override
    public INote createNote() {
        return null;
    }

    @Override
    public IVideo createVideo() {
        return null;
    }
}
