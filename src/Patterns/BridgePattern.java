package Patterns;

/**
 * 桥接模式
 * Created by HeJianFeng on 2017/9/25.
 *
 * 将抽象部分与实现部分分离，它们可独立变化
 *
 * 程序运行时实现部分可被选择或切换
 * 开发者可对不同的抽象接口和实现部分进行组合，并扩充
 * 在多个对象间共享实现
 */

public class BridgePattern {

    public static void main(String[] args) {
        //从A2过桥到B3
        AreaA a = new AreaA2();
        a.qiao = new AreaB3();
        a.fromAreaA();
        a.qiao.targetAreaB();
    }
}
/**
 * 定义实现类的接口Implementor
 * 提供基本操作
 * */
interface Qiao{
    void targetAreaB();
}
/**实现Implementor*/
class AreaB1 implements Qiao{
    @Override
    public void targetAreaB() {
        System.out.println("我要去B1");
    }
}
class AreaB2 implements Qiao{
    @Override
    public void targetAreaB() {
        System.out.println("我要去B2");
    }
}
class AreaB3 implements Qiao{
    @Override
    public void targetAreaB() {
        System.out.println("我要去B3");
    }
}

/**
 * 抽象类接口Abstraction
 * 提供基于Implementor基本操作的较高层次操作
 * */
abstract class AreaA{
    Qiao qiao;//维护一个指向Implementor类型的指针
    abstract void fromAreaA();
}

/**扩充由Abstraction定义的接口*/
class AreaA1 extends AreaA{
    @Override
    void fromAreaA() {
        System.out.println("我来自A1");
    }
}
class AreaA2 extends AreaA{
    @Override
    void fromAreaA() {
        System.out.println("我来自A2");
    }
}
class AreaA3 extends AreaA{
    @Override
    void fromAreaA() {
        System.out.println("我来自A3");
    }
}
