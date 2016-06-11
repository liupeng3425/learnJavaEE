package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Peng on 2016/6/11.
 * 注解 annotation
 */
public class AnnotationDemo {
    //    ElementType.TYPE表示作用域是类或接口。
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Description {
        String value();//只有一个成员时必须为value();
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Table {
        String value();//只有一个成员时必须为value();
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Column {
        String value();//只有一个成员时必须为value();
    }
}
