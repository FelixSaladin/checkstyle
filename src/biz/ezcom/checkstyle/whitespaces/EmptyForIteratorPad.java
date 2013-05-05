package biz.ezcom.checkstyle.whitespaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class EmptyForIteratorPad {
    /**
     * 
     */
    public EmptyForIteratorPad() {
    }
    /**
     * 
     */
    public final void p1() {
        final List<String> list = new ArrayList<String>();
//        for (final Iterator<String> it = list.iterator(); it.hasNext(); ) {
        for (final Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println();
        }
    }
}
