package ZuoYe20210415;
/*
*ClassName:wt20210415002
*UserName:suiyidi
*CreateTime:2021-04-15 20:36
*/
/*2. 输入18位身份证号码，判断是否成年(满18岁)*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class wt20210415002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入18位的身份证号码：");
        String id = sc.nextLine();
        if (id.length() != 18) {
            System.out.println("输入的身份证格式不正确");
            return;
        }

        for (int i = 0; i < id.length() - 1; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                System.out.println("输入的身份证格式不正确");
                return;
            }
        }

        if (id.charAt(id.length() - 1) <= 'A' && id.charAt(id.length() - 1) >= 'Z' || !Character.isDigit(id.charAt(id.length()-1))) {
            System.out.println("输入的身份证格式不正确");
            return;
        }
        birthday(id);
        System.out.println("430481200007090018:"+hasAdult("43048120000709"));
    }


    public static void birthday(String id) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        int nowYear = c.get(Calendar.YEAR);// 现在的年份
        int nowDate = c.get(Calendar.DAY_OF_YEAR);// 今年的第几天
        int a = Integer.valueOf(id.substring(6, 10));
        int b = Integer.valueOf(id.substring(10, 12)) - 1;
        int d = Integer.valueOf(id.substring(12, 14));
        c.set(a, b, d);
        int pastYear = c.get(Calendar.YEAR);// 出生的年份
        int pastDate = c.get(Calendar.DAY_OF_YEAR);// 出生那年的第几天
        if (nowYear-pastYear>18) {
            System.out.println("已成年(满18)");
        }else if (nowYear-pastYear==18&&pastDate-nowDate>0) {
            System.out.println("已成年(满18)");
        }else {
            System.out.println("未成年(未满18)");
        }

    }
     public static boolean hasAdult(String idcard){
       if (idcard.matches("^\\d{17}[\\dX]$")){
           throw  new RuntimeException("18位的身份证不正确");
       }String ymd =idcard.substring(6,14);
       SimpleDateFormat f=new SimpleDateFormat("yyyyMMdd");
       try{
           Date d =f.parse(ymd);
           Calendar c =  Calendar.getInstance();
           c.setTime(d);
           c.add(Calendar.YEAR,18);
           return  new Date().after(c.getTime());
       }catch (ParseException e){
           throw  new RuntimeException("18位的身份证不正确");
       }

     }

}