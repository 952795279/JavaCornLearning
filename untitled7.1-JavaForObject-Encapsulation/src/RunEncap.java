public class RunEncap {
    public static void main(String[] args) {
        /**
         * 通过getter和setter方法，访问封装类的属性
         */
        EncapTest encapTest = new EncapTest();
        encapTest.setName("James");
        encapTest.setAge(20);
        encapTest.setIdNum("001");

        System.out.println("Name: " + encapTest.getName() + "\nAge：" + encapTest.getAge());
    }
}