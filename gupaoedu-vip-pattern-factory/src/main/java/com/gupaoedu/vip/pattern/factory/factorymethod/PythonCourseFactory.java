package   com.gupaoedu.vip.pattern.factory.factorymethod;

import   com.gupaoedu.vip.pattern.factory.Icourse;
import   com.gupaoedu.vip.pattern.factory.JavaCourse;
import   com.gupaoedu.vip.pattern.factory.PythonCourse;

public class PythonCourseFactory implements IcourseFactory {
    public Icourse create() {
        return new PythonCourse();
    }
}
