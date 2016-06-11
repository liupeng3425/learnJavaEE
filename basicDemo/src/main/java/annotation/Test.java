package annotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Peng on 2016/6/11.
 * test annotation
 */
public class Test {
    public static void main(String[] args) {
        try {
            // 要将Class改成 Class<?> 否则getMethod() 报警告。
//            Class mClass = Class.forName("annotation.Child");
            Class<?> mClass = Class.forName("annotation.Child");
            Method method = mClass.getMethod("eatFood");

            // 第一种方法，先判断有没有Description注解，然后直接获取注解实例
            boolean isExist  = method.isAnnotationPresent(AnnotationDemo.Description.class);
            if (isExist) {
                AnnotationDemo.Description description = method.getAnnotation(AnnotationDemo.Description.class);
                System.out.println(description.value());
            }

            // 第二种方法，获取方法上所有注解，遍历。
            Annotation[] mAnnotation = method.getAnnotations();
            for (Annotation annotation:mAnnotation){
                if (annotation instanceof AnnotationDemo.Description){
                    System.out.println(((AnnotationDemo.Description) annotation).value());
                }
            }
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

class Child {
    String name;

    @AnnotationDemo.Description("I can eat food.")
    public void eatFood(){

    }
}
