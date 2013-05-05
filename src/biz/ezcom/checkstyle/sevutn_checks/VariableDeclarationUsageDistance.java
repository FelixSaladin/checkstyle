package biz.ezcom.checkstyle.sevutn_checks;

import java.util.Date;

/**
 * Distance between variable 'i' declaration and its first usage is 
     4, but allowed 3.
 */
public class VariableDeclarationUsageDistance {
    public VariableDeclarationUsageDistance() {
        int i = 1;
        new Date();
        new Date();
        new Date();
        System.out.println(i);
    }
}
