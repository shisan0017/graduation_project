package product.shitilei;


import product.Product;
import product.TypeName;
/**
 * @Author 伍涛
 * @Date 2021/4/19 15:01
 * @Description This is description of class
 * @Package com.afternoon
 */
public class Smoke extends Product {
    //烟
    public Smoke(int id ,String brand,Double price) {
        super(TypeName.Smoke,brand,price);
    }



}
