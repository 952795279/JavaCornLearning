/**
 * 自定义异常
 */
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        if (age<0 || age>150){
            throw new InvalidAgeException("Invaild age " + age);
        }
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        try{
            Person test01 = new Person("test", 160);
            System.out.println(test01);
        }catch (InvalidAgeException e){
            System.out.println("自定义异常信息： " + e.getMessage());
        }
    }
}
