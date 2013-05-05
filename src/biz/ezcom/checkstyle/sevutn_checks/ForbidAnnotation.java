package biz.ezcom.checkstyle.sevutn_checks;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * xx
 */
@MyAnnotation()
public class ForbidAnnotation {
    public ForbidAnnotation() {
    }
}

/**
 * 此注释已经被checkstyle的sevutn_checks的ForbidAnnotation禁止使用
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@interface MyAnnotation {
}
