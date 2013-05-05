package biz.ezcom.checkstyle.coding_problems;

import java.io.IOException;

/**
 * 
 */
public class RedundantThrows {
    /**
     * 
     */
    public RedundantThrows() {
    }
    
    /**
     * @throws IOException e
     * @throws Exception e
     */
    public void throw1() throws IOException, Exception {
    }

    /**
     * @throws IOException e
     */
    public void throw2() throws IOException, IOException {
    }

    /**
     * @throws RuntimeException e
     */
    public void throw3() throws RuntimeException {
    }
}
