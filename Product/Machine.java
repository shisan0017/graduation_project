package product;
/*
*ClassName:Machine
*UserName:suiyidi
*CreateTime:2021-04-23 11:25
*/

import product.shitilei.CountResult;
import java.util.ArrayList;
import java.util.List;

public class Machine {
    private List<Product> list = new ArrayList<>();

    private long idCount=1;

    /**
     * 添加一个商品
     * @param product
     */
    public void add(Product product){
        product.setId(idCount++);
        list.add(product);
    }

    public List<CountResult> list(){
        List<CountResult> ret = new ArrayList<>();
        for(Product p: list){
            CountResult cr = null;
            CountResult search = new CountResult();
            search.setName(p.getName().getTypeName());
            search.setBrand(p.getBrand());
            int index = ret.indexOf(search);
            if(index>-1){
                cr = ret.get(index);
            }


            if(cr==null){
                cr = new CountResult();
                cr.setName(p.getName().getTypeName());
                cr.setBrand(p.getBrand());
                cr.setPrice(p.getPrice());
                cr.setNum(1);
                ret.add(cr);
            }else{
                cr.setNum(cr.getNum()+1);
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Machine:"+list.toString();
    }

}
