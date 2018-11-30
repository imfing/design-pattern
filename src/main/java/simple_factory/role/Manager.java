package main.java.simple_factory.role;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午11:28 18-11-30
 */
public class Manager extends User {
	@Override
	public void diffOperation() {
		System.out.println("manager operation");
	}
}
