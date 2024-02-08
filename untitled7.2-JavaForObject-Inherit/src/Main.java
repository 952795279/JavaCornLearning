public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal1", 1);
        Animal dog = new Dog("dog1", 2);
        Animal fish = new Fish("fish", 3);

        animal.eat();

         // 申明为animal类型，无法使用子类的方法，必须强转类型，或者直接申明子类
        ((Dog) dog).run();
        ((Fish) fish).swim();
    }
}