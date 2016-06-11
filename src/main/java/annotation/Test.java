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
            Class mClass = Class.forName("annotation.Child");
            Method method = mClass.getDeclaredMethod("eatFood");
            Annotation[] mAnnotation = method.getAnnotations();
            for (Annotation annotation:mAnnotation){
                if (annotation instanceof AnnotationDemo.Description){
                    System.out.println(((AnnotationDemo.Description) annotation).value());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
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
