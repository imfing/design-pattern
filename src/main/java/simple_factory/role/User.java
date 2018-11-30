package main.java.simple_factory.role;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午11:18 18-11-30
 */
public abstract class User {
	public void sameOperation() {
		System.out.println("大家共有的operation");
	}
	public abstract void diffOperation();

}
