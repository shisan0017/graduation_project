package product.shitilei;

import product.Product;
import product.TypeName;
/**
 * @Author 伍涛
 * @Date 2021/4/19 15:00
 * @Description This is description of class
 * @Package com.afternoon
 */
public class Tea extends Product {


    public final static String NAME = "";

    public Tea(Long id, String name, String brand, Double price) {
        super(TypeName.Tea, brand, price);
    }

}

