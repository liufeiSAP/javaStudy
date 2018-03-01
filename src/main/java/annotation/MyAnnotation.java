package annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited  //可以被继承
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}
