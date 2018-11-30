package main.java.simple_factory.product;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午10:45 18-11-30
 */
public class Environment {
	public static void main(String[] args) {
		try {
			ProductA productA = (ProductA) Factory.factoryMethod("C");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
