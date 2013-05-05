package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public final class CovariantEquals {
    /**
     * 
     */
    public CovariantEquals() {
    }
    /** 
     * @param obj obj
     * @return boolean
     * */
    public boolean equals(final String obj) {
        return super.equals(obj);
    }
    /**
     * @return int
     */
    @Override()
    public int hashCode() {
        return super.hashCode();
    }
}
