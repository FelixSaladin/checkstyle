package biz.ezcom.checkstyle.class_design;

import java.awt.AWTException;
import java.io.FileNotFoundException;

/**
 * 
 */
public class ThrowCount {
    /**
     * @throws FileNotFoundException e
     * @throws AWTException e
     */
    public ThrowCount() throws FileNotFoundException, AWTException {
        System.out.println();
    }
}
