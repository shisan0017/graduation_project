package Product;


/**
 * @Author 伍涛
 * @Date 2021/4/19 15:01
 * @Description This is description of class
 * @Package com.afternoon
 */
public class Coffee extends Product{

    private static final String name = "咖啡";//类别名称
    public Coffee(String name) {
        super(name);
    }

    public Coffee() {
        super("咖啡");
    }

}
