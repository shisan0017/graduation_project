package product.shitilei;
/*
*ClassName:CountResult
*UserName:suiyidi
*CreateTime:2021-04-23 11:16
*/

public class CountResult {
    private String name;
    private String brand;
    private Double price;
    private int num;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return name + "\t" + brand + "\t" + price + "\t" + num;
    }


}
