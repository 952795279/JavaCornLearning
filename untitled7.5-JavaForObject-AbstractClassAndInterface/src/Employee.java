/**
 * 抽象类无法直接实例化，只能被继承
 * 抽象方法，必须被重写
 */
public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public String getName(){
        return this.name;
    }

    public abstract double computePay();
}


class salary extends Employee{
    private int salary;

    public double computePay(){
        System.out.println("Compute salary for " + super.getName());
        return this.salary;
    }
}