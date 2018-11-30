package main.java.simple_factory.role;

import javax.crypto.KeyGenerator;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午10:45 18-11-30
 */
public class Environment {
	public static void main(String[] args) {
		try {
			User user;
			int permission = UserDao.findPermission("1", "1");
			user = UserFactory.getUser(permission);

			user.diffOperation();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
