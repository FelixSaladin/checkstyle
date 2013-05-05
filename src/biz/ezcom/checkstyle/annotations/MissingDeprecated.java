package biz.ezcom.checkstyle.annotations;

/**
 * 
 */
public final class MissingDeprecated {
    /**
     * 
     */
    public MissingDeprecated() {
    }

    /** @deprecated 这是注释
     * @deprecated 这是注释 */
    @Deprecated()
    public void p1() {
        System.out.println();
    }
    /**
     */
    @Deprecated()
    public void p2() {
        System.out.println();
    }

    /** @deprecated */
    public void p3() {
        System.out.println();
    }

    /** @deprecated */
    @Deprecated()
    public void p4() {
        System.out.println();
    }
}
