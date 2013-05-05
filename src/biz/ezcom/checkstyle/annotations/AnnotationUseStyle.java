package biz.ezcom.checkstyle.annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class AnnotationUseStyle {
    /**
     * 
     */
    public AnnotationUseStyle() {
    }

    /** @return string */
    @Override
    // @Override()
    public final String toString() {
        return super.toString();
    }

    /**
     * 
     */
    @SuppressWarnings("rawtypes")
//    @SuppressWarnings(value = "rawtypes")
    public final void p1() {
        System.out.println(new ArrayList());
    }

    /**
     *
     */
    @SuppressWarnings({"rawtypes", "unused"})
    // @SuppressWarnings(value = {"rawtypes", "unused" })
    public final void p2() {
        final List list = new ArrayList();
    }
}
