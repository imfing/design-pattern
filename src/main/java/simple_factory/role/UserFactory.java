package main.java.simple_factory.role;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午11:33 18-11-30
 */
public class UserFactory {

	public static User getUser(int permission) throws Exception {

		if (permission == 1) {
			//拥有employee权限
			return new Employee();
		} else if (permission == 2) {
			//拥有manager权限
			return new Manager();
		} else {
			throw new Exception("权限分配失败");
		}
	}
}
