package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class RequireThis {
    /**
     * 
     */
    private int id;
    
    /**
     * 
     */
    public RequireThis() {
        
    }

    /** @return id id */
    public final int getId1() {
        // return this.id;
        return id;
    }

    /** @return id id */
    public final int getId2() {
        // return this.getId1();
        return getId1();
    }
}
