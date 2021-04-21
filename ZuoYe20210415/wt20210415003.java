package ZuoYe20210415;




import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
*ClassName:wt20210415003
*UserName:suiyidi
*CreateTime:2021-04-15 20:36
*/
/*3. 显示当前日期，格式为“2019年01月01日 周一 01时01分01秒” 采用两种方式实现,
        不允许使用String.format*/
public class wt20210415003 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年 MM月 dd日  E HH时 mm分 ss秒 SSS毫秒 ");
        String str = format.format(new Date());
        System.out.println(str);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy年 MM月 dd日  E HH时 mm分 ss秒 SSS毫秒");
        String str1 = df.format(dateTime);
        System.out.println(str1);
    }}