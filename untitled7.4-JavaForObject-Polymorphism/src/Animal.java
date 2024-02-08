/**
 * 抽象类无法实现，只能通过继承来使用相关属性方法
 * 可以使用abstract关键字定义抽象方法，使子类必须重写该方法
 */
abstract class Animal {
    public void eat(){}
}

class Cat extends Animal{
    @Override
    public void eat() {
        /**
         * 重写方法
         */
        System.out.println("吃鱼！");
    }

    public void work(){
        System.out.println("抓老鼠！");
    }
}

class Dog extends Animal{
    public void work(){
        System.out.println("看家");
    }
}