package ZuoYe20210415;
/*
*ClassName:wt20210415005
*UserName:suiyidi
*CreateTime:2021-04-15 20:37
*/
//5. 获取某年的父亲节和母亲节的日期
// Date -> String

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//        1. 父亲节6月的第3个星期天
//        2. 母亲节5月的第2个星期天
public class wt20210415005 {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        System.out.println(f.format(ma(2020).getTime()));
        System.out.println(f.format(ma(2021).getTime()));
        System.out.println(f.format(father(2020).getTime()));
        System.out.println(f.format(father(2021).getTime()));
    }
        public static Calendar ma(int year) {
            Calendar c = Calendar.getInstance();
            c.clear();
            c.set(Calendar.YEAR, year);
            c.set(Calendar.MARCH, 5);
            c.set(Calendar.DATE, 1);
            System.out.println(c.get(Calendar.DAY_OF_WEEK) - 1);
            int n = 0;
            int i = 1;
            while (true) {
                if (n == 3) {
                    break;
                }
                if (c.get(Calendar.DAY_OF_WEEK) - 1 == 0) {
                    n = n + 1;
                }
                c.set(Calendar.DATE, ++i);
            }
            c.set(Calendar.DATE, i - 1);
            return c;
        }

    public static Calendar father(int year) {
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MARCH, 4);
        c.set(Calendar.DATE, 1);
        System.out.println(c.get(Calendar.DAY_OF_WEEK) - 1);
        int n = 0;
        int i = 1;
        while (true) {
            if (n == 2) {
                break;
            }
            if (c.get(Calendar.DAY_OF_WEEK) - 1 == 0) {
                n = n + 1;
            }
            c.set(Calendar.DATE, ++i);
        }
        c.set(Calendar.DATE, i - 1);
        return c;
    }

}
