package top.codecoll;
/*
*ClassName:text
*UserName:suiyidi
*CreateTime:2021-01-09 10:59
*/

public class text {
    public static void main(String[] args) {
//菱形
        for (int i = 1; i <5; i++) {
            for (int j = 0; j <4-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i*2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >0 ; i--) {
            for (int j = 0; j <5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-3 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

//        目2：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。编程找出1000以内的所有完数
        String str = "";
        text c = new text();
        //输入
        str = javax.swing.JOptionPane.showInputDialog("请输入N的值（输入exit退出）：");
        int N=0;
        try {
            N = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.print(N + "分解质因数：" + N + "=");
        c.fengjie(N);
    }
    public void fengjie(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + "*");
                fengjie(n / i);
            }
        }
        System.out.print(n);
        //可以理解为一个运行结束的标识，比如0表示正常退出
        System.exit(0);// /不能少这句，否则结果会出错
    }

}
