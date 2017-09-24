package Patterns;

/**
 * 原型模式
 * Created by Administrator on 2017/9/24.
 */

//用原型实例指定创建对象的种类，并通过复制这些原型创建新的对象
//当一个类的实例只能有几个不同状态组合中的一种，建立原型并克隆更方便
public class PrototypePattern {
    public static void main(String[] args){
        ConcretePrototype cp = new ConcretePrototype();
        for(int i=0; i< 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }
}

/**
 * 原型类
 * 原型模式主要用于对象的复制，它的核心是就是类图中的原型类Prototype
 * 实现Cloneable接口
 * 重写Object类中的clone方法
 */
class Prototype implements Cloneable{
    public Prototype clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
class ConcretePrototype extends Prototype{
    public void show(){
        System.out.println("原型模式实现类");
    }
}
