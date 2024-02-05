public class Test {
    public static void main(String[] args) {
        /**
         * while循环
         */
        int x = 10;
        System.out.println("while循环");
        while (x < 20){
            System.out.println("Value of x is " + x);
            x ++;
        }
        /**
         * do while循环
         * 至少会跑一次
         */
        x = 10;
        System.out.println("do while循环");
        do{
            System.out.println("Value of x is " + x);
            x ++;
        }while (x < 20);
        /**
         * for循环
         */
        System.out.println("for循环");
        for (int i = 10; i < 20; i++) {
            System.out.println("Value of i is " + i);
        }
        System.out.println("for增强");
        int [] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println("Value of number is " + number);
        }
        /**
         * 条件语句
         */
        x = 30;
        if( x < 20 ){
            System.out.println("这是 if 语句");
        }else{
            System.out.println("这是 else 语句");
        }
        /**
         * switch case语句
         */
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("Greate");
                break;
            case 'B':
                System.out.println("Excellent");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Vegetable");
                break;
            default:
                System.out.println("Unknow");
        }
    }
}