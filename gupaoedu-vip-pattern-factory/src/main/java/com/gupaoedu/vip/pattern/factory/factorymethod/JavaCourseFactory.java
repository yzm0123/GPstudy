package    com.gupaoedu.vip.pattern.factory.factorymethod;

import    com.gupaoedu.vip.pattern.factory.Icourse;
import    com.gupaoedu.vip.pattern.factory.JavaCourse;

public class JavaCourseFactory implements IcourseFactory {
    public Icourse create() {
        return new JavaCourse();
    }
}
