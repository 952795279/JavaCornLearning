/**
 * 接口也无法直接实例化，必须被实现后使用
 * 接口里面定义的所有方法都需要被实现，如果只想重写特定的方法，请使用抽象类
 */
interface Animal {
    public void eat();

    public void travel();
}

class MammalInt implements Animal{

    @Override
    public void eat() {
        System.out.println("Mammal eat");
    }

    @Override
    public void travel() {
        System.out.println("Mammal travel");
    }

    public int noOfLeg(){
        return 0;
    }
    public static void main(String[] args) {
        MammalInt mammalInt = new MammalInt();
        mammalInt.eat();
        mammalInt.travel();
    }
}
