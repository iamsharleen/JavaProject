package Principle;

/**
 * Single Responsibility Principle
 * Created by Administrator on 2017/9/21.
 */
public class SingleResponsibility {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
        animal.breathe("鱼");

        Terrestrial fish=new Terrestrial();
        fish.breathe("鱼");

        Aquatic cow=new Aquatic();
        cow.breathe("牛");
    }

}

class Animal{
    //代码级别违反SRP
    public void breathe(String animal){
        if("鱼".equals(animal)){
            System.out.println(animal+"呼吸水");
        }else{
            System.out.println(animal+"呼吸空气");
        }

    }
}

//SRP
class Terrestrial{
    public void breathe(String animal){
        System.out.println(animal+"呼吸空气");
    }
}
class Aquatic{
    public void breathe(String animal){
        System.out.println(animal+"呼吸水");
    }
}