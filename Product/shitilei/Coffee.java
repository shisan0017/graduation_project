package product.shitilei;


import product.Product;
import product.TypeName;
/**
 * @Author 伍涛
 * @Date 2021/4/19 15:01
 * @Description This is description of class
 * @Package com.afternoon
 */
public class Coffee extends Product {

//    private static final String name = "咖啡";//类别名称
    public Coffee(String brand ,Double price) {
        super(TypeName.Coffee, brand, price);
    }




}
