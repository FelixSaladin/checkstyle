package biz.ezcom.checkstyle.annotations;

import java.util.ArrayList;

/**
 * 
 */
public class SuppressWarning {
    /**
     * 
     */
    @SuppressWarnings(value = {"rawtypes" })
    public SuppressWarning() {
        new ArrayList();
    }
    /**
     * 
     */
    @SuppressWarnings(value = {"rawtypes" })
    public final void p1() {
        new ArrayList();
    }
}
