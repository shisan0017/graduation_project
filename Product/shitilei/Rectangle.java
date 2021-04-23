package product.shitilei;

import java.util.Scanner;

/**
 * 长方形
 * @author J.L.Zhou
 *	jlzhou.top 版权所有
 */
public class Rectangle {
	private static final String NAME = "长方形";
	/**
	 * 宽
	 */
	private float width;
	/**
	 * 高
	 */
	private float height;
	
	/**
	 * 周长
	 */
	private float perimeter;
	
	/**
	 * 面积
	 */
	private float area;

	public void input(Scanner sc) {
		System.out.println("输入"+NAME+"的宽度: ");
		width = sc.nextFloat();

		System.out.println("输入"+NAME+"的高度: ");
		height = sc.nextFloat();
		
		perimeter = (width+height) *2;
		area = width*height;
	}
	

	/**
	 * 获取周长
	 * @return 周长
	 */
	public float getPerimeter(){
		return perimeter;
	}

	/**
	 * 获取面积
	 * @return
	 */
	public float getArea(){
		return area;
	}

	/**
	 * 打印基本信息
	 */
	public void show() {
		System.out.format("%s\t周长：%.2f\t面积：%.2f\t宽度：%.2f\t高度：%.2f\n",NAME,perimeter,area,width,height);

	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.input(new Scanner(System.in));
		rectangle.show();
	}

}
