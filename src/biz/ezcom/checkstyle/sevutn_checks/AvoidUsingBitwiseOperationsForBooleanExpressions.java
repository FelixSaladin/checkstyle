package biz.ezcom.checkstyle.sevutn_checks;

/**
 * Not short-circuit Operator '&,|' used.
 */
public class AvoidUsingBitwiseOperationsForBooleanExpressions {
    public AvoidUsingBitwiseOperationsForBooleanExpressions() {
        boolean a = true;
        a = false;
        boolean b = false;
        b = true;
        if (a & b) {
            System.out.println();
        }
        if (a | b) {
            System.out.println();
        }
    }
}
