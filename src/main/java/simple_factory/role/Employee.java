package main.java.simple_factory.role;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午11:18 18-11-30
 */
public class Employee extends User {
	@Override
	public void diffOperation() {
		System.out.println("employee operation");
	}
}
