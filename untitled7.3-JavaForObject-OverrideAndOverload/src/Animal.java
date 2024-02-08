public class Animal {
    public void action(){
        System.out.println("动物可以移动");
    }
}


class Chicken extends Animal{
    /**
     * 重写方法，使用父类声明的实例子类，会调用子类重写的方法
     * 外壳不变，核心重写
     * 方法重写，是子父类多态的表现
     */
    public void action(){
        System.out.println("坤会唱、跳、rap");
    }
}
