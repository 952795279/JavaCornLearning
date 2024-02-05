public class Puppy {

    int puppyAge;

    /**
     * 构造方法
     */
    public Puppy(String name){
        System.out.println("小狗的名字是：" + name);
    }

    public void setPuppyAge(int age){
        this.puppyAge = age;
    }

    public int getPuppyAge(){
        System.out.println("小狗的年龄是：" + this.puppyAge);
        return this.puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Tonny");
        myPuppy.setPuppyAge(1);
        myPuppy.getPuppyAge();
        System.out.println(myPuppy.puppyAge);
    }
}
