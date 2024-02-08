/**
 * 继承
 */
public class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("正在吃！");
    }

    public void sleep(){
        System.out.println("正在睡！");
    }
}

/**
 * 继承父类特性，定义自己的特性
 */
class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public void run(){
        System.out.println("正在跑！");
    }
}

class Fish extends Animal{

    public Fish(String name, int age) {
        super(name, age);
    }

    public void swim(){
        System.out.println("正在游！");
    }
}
