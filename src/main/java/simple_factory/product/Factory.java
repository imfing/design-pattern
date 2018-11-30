package main.java.simple_factory.product;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午10:42 18-11-30
 */
public class Factory {

	public static Product factoryMethod(String arg) throws Exception {
		if (arg.equals("A")) {
			return new ProductA();
		} else if (arg.equals("B")) {
			return new ProductB();
		} else {
			throw new Exception("工厂无法生产此类产品");
		}
	}
}
