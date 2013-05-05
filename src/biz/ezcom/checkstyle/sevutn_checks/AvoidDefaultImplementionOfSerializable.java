package biz.ezcom.checkstyle.sevutn_checks;

import java.io.Serializable;
/**
 * xx 
 */
public class AvoidDefaultImplementionOfSerializable {
    /**
     *  Inner class should not implement default Serializable interface.
     */
    private class A implements Serializable {
        public A() {
            
        }
    }
    
    public AvoidDefaultImplementionOfSerializable() {
    }
}
