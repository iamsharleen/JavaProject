package Principle;

/**
 * 迪米特原则（Least Knowledge Principle）
 * 类间解耦
 * Created by Administrator on 2017/9/21.
 */
public class LawOfDemeter {
    public static void main(String[] args) {
        //定义你为A，你的朋友为B，你朋友的朋友为C好了。
        A a = new A("张三");
        a.work();
    }
    //反例：getXXX().getXXX().getXXX()……
}


class A{
    public String name;
    public A(String name) {
        this.name = name;
    }
    public B getB(String name) {
        return new B(name);
    }
    public void work() {
        B b = getB("李四");
        b.work();
    }

    //违反
    public void work2() {
        B b = getB("李四");
        C c = b.getC("王五");
        c.work();
    }
}
class B{
    private String name;
    public B(String name) {
        this.name = name;
    }
    public C getC(String name) {
        return new C(name);
    }

    public void work(){
        C c = getC("王五");
        c.work();
    }
}

 class C{
    public String name;
    public C(String name) {
        this.name = name;
    }
    public void work() {
        System.out.println(name + "把这件事做好了");
    }
}
