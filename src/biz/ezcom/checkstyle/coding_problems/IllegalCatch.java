package biz.ezcom.checkstyle.coding_problems;

import java.io.File;
import java.io.FileInputStream;

/**
 * 
 */
public class IllegalCatch {
    /**
     * 
     */
    public IllegalCatch() {
        try {
            new FileInputStream(new File(""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
