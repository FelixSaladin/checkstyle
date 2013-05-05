package biz.ezcom.checkstyle.class_design;

/**
 * 
 */
public class InnerTypeLast {
    /**
     * 
     */
    private static class StaticMemberClass {
        /**
         * 
         */
        StaticMemberClass() {
            
        }
    }
    /**
     * 
     */
    private class MemberClass {
        /**
         * 
         */
        public MemberClass() {
        }
    }
    /**
     * 
     */
    private int id;
    
    /**
     * 
     */
    public InnerTypeLast() {
        
    }
    /**
     * @return this.id
     */
    public final int getId() {
        return this.id;
    }
    /**
     * @param id id
     */
    public final void setId(final int id) {
        this.id = id;
    }
}
