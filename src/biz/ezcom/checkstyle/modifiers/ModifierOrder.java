package biz.ezcom.checkstyle.modifiers;

/**
 * 
 */
public class ModifierOrder {
    /**
     * 
     */
    protected ModifierOrder() {
    }
    /**
     * 
     */
    final static public void p1() {
        // 按以下JLS建议的顺序排列
        // public
        // protected
        // private
        // abstract
        // static
        // final 类：不能承继，方法：不能重写，变量或参数：无法修改其值或引用
        // transient 成员变量：反序列化
        // volatile 成员变量：各线程每一次操作拿的都是共享内存区里的值（非本线程里的内存），实际还是不能同步
        // synchronized
        // native 方法：调用底下C或C++的实现
        // strictfp 类，接口，方法：硬件不同保证精度计算值相同
    }
}
