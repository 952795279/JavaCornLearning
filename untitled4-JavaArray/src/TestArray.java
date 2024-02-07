public class TestArray {
    public static void main(String[] args) {
        /**
         * 数组
         */
        double[] myList1 = new double[5];
        double[] myList = {1.1, 2.1, 3.1, 4.1, 5.1};

        // 循环，打印1
        for (int i = 0; i < myList.length; i++){
            System.out.println(myList[i]);
        }
        // 循环，打印2
        for (double element: myList) {
            System.out.println(element);
        }
        /**
         * 多维数组
         */
        String[][] str = new String[4][5];
//        type[][] typename = new type[typeLength1][typeLength2];
    }
}