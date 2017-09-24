package Patterns;

/**
 * Created by Administrator on 2017/9/24.
 */

//把一个复杂对象的构建和表示分离，同样的构建过程可以创建不同的表示
//创建复杂对象的算法应该独立于对象的组成部分及装配方式
//构造过程必须允许被构造的对象有不同一表示
public class BuilderPattern {
    public static void main(String[] args){
        Director director = new Director();
        Product3 product1 = director.getAProduct();
        product1.showProduct();

        Product3 product2 = director.getBProduct();
        product2.showProduct();
    }
}

class Product3{
    private String name;
    private String type;

    public void showProduct(){
        System.out.println("名称："+name);
        System.out.println("型号："+type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}

abstract class Builder {
    public abstract void setPart(String arg1, String arg2);
    public abstract Product3 getProduct();
}

class ConcreteBuilder extends Builder{
    private Product3 product = new Product3();

    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

    @Override
    public Product3 getProduct() {
        return product;
    }
}

class Director{
    private Builder builder = new ConcreteBuilder();
    public Product3 getAProduct(){
        builder.setPart("宝马汽车","X7");
        return builder.getProduct();
    }
    public Product3 getBProduct(){
        builder.setPart("奥迪汽车","Q5");
        return builder.getProduct();
    }
}
