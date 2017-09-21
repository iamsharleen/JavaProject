package Principle;

/**
 * 接口分离
 * 一个类对另一个类的依赖应该建立在最小的接口上
 * Created by Administrator on 2017/9/21.
 */
public class InterfaceSegregation {
    public static void main(String[] args){
        AA a = new AA();
        a.depend1(new BB());
        a.depend2(new BB());
        a.depend3(new BB());

    }
}

interface I {
    public void method1();
    public void method2();
    public void method3();
    public void method4();
    public void method5();
}

class AA{
    public void depend1(I i){
        i.method1();
    }
    public void depend2(I i){
        i.method2();
    }
    public void depend3(I i){
        i.method3();
    }
}

class BB implements I{
    public void method1() {
        System.out.println("类B实现接口I的方法1");
    }
    public void method2() {
        System.out.println("类B实现接口I的方法2");
    }
    public void method3() {
        System.out.println("类B实现接口I的方法3");
    }
    //对于类B来说，method4和method5不是必需的，但是由于接口A中有这两个方法，
    //所以在实现过程中即使这两个方法的方法体为空，也要将这两个没有作用的方法进行实现。
    public void method4() {}
    public void method5() {}
}

//接口分离
interface I1{
    public void method1();
    public void method2();
    public void method3();
}

interface I2{
    public void method4();
    public void method5();
}