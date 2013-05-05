package biz.ezcom.checkstyle.naming_conventions;

import java.util.List;

/**
 * 
 */
public class MethodTypeParameterName {
    /**
     * 
     */
    public MethodTypeParameterName() {
    }

    /**
     * @param <TT> 
     * @param list list
     * @return null
     */
    public final <TT> TT getFirst(final List<TT> list) {
        return list.get(0);
    }
}
