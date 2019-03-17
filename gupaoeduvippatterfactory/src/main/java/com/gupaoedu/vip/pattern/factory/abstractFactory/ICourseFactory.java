package com.gupaoedu.vip.pattern.factory.abstractFactory;

import com.gupaoedu.vip.pattern.factory.Icourse;

/**
 * 要求所有的子工厂都实现这个工厂
 */
public interface ICourseFactory {
    Icourse createCourse();

    INote createNote();

    IVideo createVideo();
}
