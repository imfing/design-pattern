package main.java.simple_factory.role;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午11:35 18-11-30
 */
public class UserDao {

	public static int findPermission(String username, String password) {
		//
		return username.equals("1") && password.equals("1") ? 1 : 0;
	}
}
