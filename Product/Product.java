package Product;

public class Product {
	private String name;//商品种类
	private Integer id;//商品id
    private String product;//商品名称
    private String brand;//商品品牌
    private Float price;//商品价格
    
    
	public Product(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {

		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", product=" + product + ", brand=" + brand + ", price=" + price
				+ "]";
	}
	public Product(String name, Integer id, String product, String brand, Float price) {
		super();
		this.name = name;
		this.id = id;
		this.product = product;
		this.brand = brand;
		this.price = price;
	}
	
	
	
}
