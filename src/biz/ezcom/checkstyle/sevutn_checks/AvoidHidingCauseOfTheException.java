package biz.ezcom.checkstyle.sevutn_checks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Cause exception 'e' was lost. 
 */
public class AvoidHidingCauseOfTheException {
    public AvoidHidingCauseOfTheException() throws Exception {
        FileReader fr = null;
        try {
            fr = new FileReader(new File("fileName"));
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
            throw new Exception();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
