package biz.ezcom.checkstyle.sevutn_checks;

/**
 *Overridable method 'toString' is called in constructor body.
 */
public class OverridableMethodInConstructor {
    public OverridableMethodInConstructor() {
        this.toString();
    }

    /**
     * xx
     * @return string
     */
    @Override()
    public String toString() {
        return super.toString();
    }
}
