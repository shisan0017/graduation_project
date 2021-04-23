package product;
/*
*ClassName:Test
*UserName:suiyidi
*CreateTime:2021-04-22 21:02
*/

import product.shitilei.Coffee;

import java.util.Scanner;

public class Test {
    private static Scanner scanner;
    private static  Machine machine =new Machine();
    public static void main(String[] args) {

        machine.add(new Coffee("coco", 20d));
        machine.add(new Coffee("蓝山", 18d));
        machine.add(new Coffee("蓝山", 18d));
        machine.add(new Coffee("蓝山", 18d));
        System.out.println(machine);
    }
/**
 * 添加商品
 */
        public static void add() {
         TypeName name = selectTypeName();
            System.out.println("请输入品牌:");
            String brand = scanner.next();
            System.out.println("请输入价格:");
            double price = scanner.nextDouble();
            machine.add(new Product(name, brand, price));
        }



    private static TypeName selectTypeName() {
        System.out.println("请选择商品类型：");
        for (TypeName n : TypeName.values()) {
            System.out.println("  " + n.ordinal() + "." + n.getTypeName());
        }
        try {
            int input = scanner.nextInt();
            return TypeName.values()[input];
        } catch (Exception ex) {
            System.out.println("您选择了错误的商品类型，请重新选择");
            scanner.nextLine();
            return selectTypeName();
        }

    }
}
