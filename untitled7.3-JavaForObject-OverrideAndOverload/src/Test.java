public class Test {
    /**
     * 方法重载是一个类的多态性表现
     */
    public void test(){
        System.out.println("重载方法1，参数： ");
    }
    public void test(String a){
        System.out.println("重载方法2，参数：" + a);
    }

    public void test(String a, int b){
        System.out.println("重载方法3，参数：" + a + b);
    }

    public static void main(String[] args) {
        Test test = new Test();

        test.test();
        test.test("字符");
        test.test("字符", 1);
    }
}
