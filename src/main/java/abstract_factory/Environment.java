package main.java.abstract_factory;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午10:45 18-11-30
 */
public class Environment {
	public static void main(String[] args) {
		EFactory factory = new HaierFactory();
		Tv tv = factory.createTv();
		tv.play();
	}
}
