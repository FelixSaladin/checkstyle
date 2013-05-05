package biz.ezcom.checkstyle.naming_conventions;

/**
 * 
 */
public class StaticVariableName {
    /**
     * 
     */
    private static int A = 1;

   /**
    * 
    */
    protected StaticVariableName() {
        A = 2;
    }
    /**
     * @return A
     */
    public final int get() {
        return A;
    }
}
