package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class EqualsAvoidNull {
    /**
     *  @param args
     */
    public EqualsAvoidNull() {
        final String a = "";
        if ("".equals(a)) {
            System.out.println();
        }
        if (a.equals("")) {
            System.out.println();
        }
        final String b = "";
        if (a.equals(b)) {
            System.out.println();
        }
    }
}
