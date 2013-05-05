package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class NoClone
    implements Cloneable {
    /**
     * 
     */
    public NoClone() {
    }

    /**
     * @throws CloneNotSupportedException 
     * @return Object obj 
     */
    @Override()
    protected final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
