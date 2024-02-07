public class ExceptTest {
    public static void main(String[] args) {
        /**
         * 捕获异常
         */
        int[] a = new int[2];
        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("捕获到异常-信息如下： " + e.getMessage());
        }finally {
            /**
             * finally，异常捕获后的处理
             */
            System.out.println("数组长度：" + a.length);
        }
    }
}