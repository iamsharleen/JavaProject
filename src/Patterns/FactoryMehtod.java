package Patterns;

/**
 * 工厂方法
 * Created by Administrator on 2017/9/23.
 */
public class FactoryMehtod {
    //当一个类不知道它所必须创建的对象的类
    //一个类希望由它的子类来指定它所创建的对象
    //类将创建对象的职责委托给多个帮助子类中的某一个

    //只有一个抽象产品类
    //具体工厂类只能创建一个具体产品类的实例
    public static void main(String[] args) {

        IFactory2 factory = new Factory2();
        IProduct prodect = factory.createProduct();
        prodect.productMethod();
    }
}

interface IProduct {
    public void productMethod();
}

class Product implements  IProduct{
    @Override
    public void productMethod() {
        System.out.println("产品");
    }
}

interface IFactory2 {
    public IProduct createProduct();
}

class Factory2 implements IFactory2 {
    public IProduct createProduct() {
        return new Product();
    }
}
