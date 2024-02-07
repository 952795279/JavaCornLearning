import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        /**
         * 获取当前日期时间
         */
        Date date = new Date();

        System.out.println(date.toString());

        /**
         * 格式化日期 - SimpleDateFormat
         * hh是12h制，HH是24h制
         */
        Date dateNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("Date and time now is " + ft.format(dateNow));

        /**
         * 格式化日期 - printf
         */
        Date date1 = new Date();
        System.out.printf("%tY-%tm-%td %tH:%tM:%tS", date1, date1, date1, date1, date1, date1);
        System.out.println();

        /**
         * 字符串转日期时间类型
         */
        try{
            SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = "2024-02-07";
            Date date2 = ft1.parse(dateStr);
            System.out.println("date2 is " + date2);
        }catch (ParseException e){
            System.out.println(e.getMessage());
        }

    }
}