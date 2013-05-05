package biz.ezcom.checkstyle.whitespaces;

/**
 * 
 */
public class TypecastParenPad {
    /**
     * 
     */
    public TypecastParenPad() {
        final Object obj = "a";
//        final String a = (String) obj;
        final String a = ( String ) obj;
        System.out.println(a);
    }
}
