package biz.ezcom.checkstyle.size_violations;

import java.util.Calendar;

/**
 * 
 */
public class AnonInnerLength {
    /**
     * 
     */
    public AnonInnerLength() {
        Calendar calendar = new Calendar() {

            @Override
            public void roll(final int field, final boolean up) {
            }

            @Override
            public int getMinimum(final int field) {
                return 0;
            }

            @Override
            public int getMaximum(final int field) {
                return 0;
            }

            @Override
            public int getLeastMaximum(final int field) {
                return 0;
            }

            @Override
            public int getGreatestMinimum(final int field) {
                return 0;
            }

            @Override
            protected void computeTime() {
            }

            @Override
            protected void computeFields() {
            }

            @Override
            public void add(final int field, final int amount) {
            }
        };
        System.out.println(calendar);
    }
}
