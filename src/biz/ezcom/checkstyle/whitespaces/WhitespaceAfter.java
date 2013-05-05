package biz.ezcom.checkstyle.whitespaces;

/** @author tzsh */
public class WhitespaceAfter {
    /**
     * 
     */
    public WhitespaceAfter() {
        for (int i = 0;i < 2;++i) {
            System.out.println();
        }
        final int[] i = {1,2};
        final Object obj = "a";
        final String a = (String)obj;
        System.out.println(i);
        System.out.println(a);
    }
}
