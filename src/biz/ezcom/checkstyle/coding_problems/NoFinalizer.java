package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class NoFinalizer {
    /**
     * 
     */
    public NoFinalizer() {
    }

    /**
     * @throws Throwable e
     */
    @Override()
    protected final void finalize() throws Throwable {
        super.finalize();
    }
}
