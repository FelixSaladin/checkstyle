package biz.ezcom.checkstyle.annotations;

/**
 * 
 */
public class MissingOverride {
    /**
     *
     */
    public MissingOverride() {
    }
    
    /**
     * {@inheritDoc}
     * @return string
     */
//    @Override()
    public final String toString() {
        return super.toString();
    }
}
