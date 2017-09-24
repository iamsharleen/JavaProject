package Patterns;

/**
 * 单例模式
 * Created by Administrator on 2017/9/24.
 */
public class Singleton {
    //保证一个类仅有一个实例，并提供一个访问它的全局访问点
    //唯一实例通过子类化可扩展，客户无须通过更改代码可使用一个扩展实例
    public static void main(String[] args){
        SingletonLazy laxyInstance = SingletonLazy.getInstance();
        SingletonGreed greedInstance = SingletonGreed.getInstance();
    }
}

//貪婪單例模式
class SingletonGreed{
    private static SingletonGreed instance = new SingletonGreed();

    private SingletonGreed(){}

    public static SingletonGreed getInstance(){
        return instance;
    }
}

class SingletonLazy{
    private static SingletonLazy instance;

    private SingletonLazy(){
        // 建立物件需要花費很多資源
        //...code
    }

    public static SingletonLazy getInstance(){
        // 第一次被呼叫的時候再建立物件
        if(null==instance){
            instance = new SingletonLazy();
        }
        return instance;
    }
}

