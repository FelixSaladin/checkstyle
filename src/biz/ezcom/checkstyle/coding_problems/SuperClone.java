package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class SuperClone
    implements Cloneable {
    /**
     * 
     */
    public SuperClone() {
    }

    /** 
     * @throws CloneNotSupportedException e 
     * @return Object obj 
     */
    @Override()
    protected final Object clone() throws CloneNotSupportedException {
        // return super.clone();
        return new Object();
    }
}
