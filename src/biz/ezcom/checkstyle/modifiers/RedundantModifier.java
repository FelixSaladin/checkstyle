package biz.ezcom.checkstyle.modifiers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 */
public final class RedundantModifier {
    /**
     * 
     */
    public RedundantModifier() {
    }

    /**
     * 
     */
    public final void p1() {
        // 因为final class后，final method无意义
    }
}

/**
 * 
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@interface RedundantModifierAnnotation {
    /**
     * 
     */
    public abstract String value();
    // String value();
}

/**
 * 
 */
interface IRedundantModifierInterface {
    /**
     * 
     */
    public static final double PI = 3.1415926D;

    // double PI = 3.1415926D;
    /**
     * 
     */
    public abstract void p1();
    // void p1();
}
