package biz.ezcom.checkstyle.sevutn_checks;

/**
 * Instantiation of 'NullPointerException' is not allowed.
 */
public class ForbidInstantiation {
    public ForbidInstantiation() {
        new NullPointerException();
    }
    
}
