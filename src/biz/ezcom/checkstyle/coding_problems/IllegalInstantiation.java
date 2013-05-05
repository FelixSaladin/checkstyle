package biz.ezcom.checkstyle.coding_problems;

/**
 * 
 */
public class IllegalInstantiation {
    /**
     * 
     */
    public IllegalInstantiation() {
        new Boolean(true);
        Boolean.valueOf(true);
        new Byte("2");
        Byte.valueOf("3");
        new Short("4");
        Short.valueOf("5");
        new Integer("6");
        Integer.valueOf("7");
        new Long("8");
        Long.valueOf("9");
        new Character('a');
        Character.valueOf('b');
    }
}
