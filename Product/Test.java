package Product;
/*
*ClassName:Test
*UserName:suiyidi
*CreateTime:2021-04-22 21:02
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //提示用户输入信息
        System.out.println("***欢饮来到饮料自动售卖店***");
        System.out.println("请选择饮料（1.咖啡  2 矿泉水  3 可乐）：");
        //创建键盘扫描
        Scanner key = new Scanner(System.in);
        //接收用户输入的内容
        int num1 = key.nextInt();

        switch (num1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:

        }
    }
}
