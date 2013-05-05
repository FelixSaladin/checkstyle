package biz.ezcom.checkstyle.class_design;

/**
 * 
 */
public class MutableException {
    /**
     * 
     */
    private String message;
    /**
     * @param message 信息
     */
    public MutableException(final String message) {
        this.message = message;
    }
    /**
     *  @return message
     */
    public final String getMessage() {
        return this.message;
    }
}
/**
 * 
 */
class MutableError {
    /**
     * 
     */
    private String message;
    /**
     * @param message 信息
     */
    public MutableError(final String message) {
        this.message = message;
    }
    /**
     * @return message
     */
    public final String getMessage() {
        return this.message;
    }
}
