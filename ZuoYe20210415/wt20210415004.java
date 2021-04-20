package ZuoYe20210415;

import java.util.Calendar;
import java.util.Scanner;

/*
*ClassName:wt20210415004
*UserName:suiyidi
*CreateTime:2021-04-15 20:37
*/
/*显示万年历：输入年份和月份，显示当月日历*/
public class wt20210415004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        calendar(year, month);
    }

    public static void calendar(int year, int month) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, 0);
        int sumDate = c.get(Calendar.DATE);
        c.set(year, month-1, 1);
        int weekDate = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("----------------------万年历------------------------");
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 1; i < sumDate+weekDate; i++) {
            if (i<weekDate) {
                System.out.print("\t");
            }else {
                System.out.print(i-weekDate+1+"\t");
            }

            if (i%7==0) {
                System.out.println("\n");
            }


        }

    }

}
