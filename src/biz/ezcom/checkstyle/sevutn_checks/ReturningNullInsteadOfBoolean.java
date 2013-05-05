package biz.ezcom.checkstyle.sevutn_checks;
/**
 * xx 
 */
public class ReturningNullInsteadOfBoolean {
    public ReturningNullInsteadOfBoolean() {
    }
    
    /**
     * Method declares to return Boolean and returns null.
     * @return null
     */
    public final Boolean getBoolean() {
        return null;
    }
}
