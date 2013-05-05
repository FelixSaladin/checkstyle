package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public final class HiddenField {
    /**
     * 
     */
    private int id;

    /** @param id */
    public HiddenField(final int id) {
        this.id = id;
    }

    /** @return id */
    public int getId() {
        return this.id;
    }

    /** @param id */
    public void setId(final int id) {
        this.id = id;
    }

    /** @param id */
    public void process(final int id) {
        System.out.println(id);
    }
}
