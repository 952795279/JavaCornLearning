import java.util.Date;

public class DiffDemo {
    public static void main(String[] args) {
        try{
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            // 毫秒单位
            Thread.sleep(5*60*10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            System.out.println("Different time is " + (end-start));
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
