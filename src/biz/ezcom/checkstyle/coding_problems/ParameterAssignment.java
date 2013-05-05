package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class ParameterAssignment {
    /**
     * @param id id
     */
    public ParameterAssignment(int id) {
        id = 1;
    }

    /** 
     * @param id id
     */
    public final void setId(int id) {
        id = 1;
    }
}
