package Principle;

/**
 * 依赖倒置原则
 * 面向接口编程
 * Created by Administrator on 2017/9/21.
 */
public class DependencyInversion {
    public static void main(String[] args){
        Mother mother = new Mother();
        mother.narrate(new Book());
        mother.narrate(new Newspaper());
    }
}

interface IReader{
    public String getContent();
}

class Book implements IReader{
    @Override
    public String getContent() {
        return "很久很久以前有一个阿拉伯的故事……";
    }
}

class Newspaper implements IReader{
    @Override
    public String getContent() {
        return "林书豪17+9助尼克斯击败老鹰……";
    }
}

class Mother{
    public void narrate(IReader reader){
        System.out.println("妈妈开始讲故事");
        System.out.println(reader.getContent());
    }
}