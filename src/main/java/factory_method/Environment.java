package main.java.factory_method;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午10:45 18-11-30
 */
public class Environment {
	public static void main(String[] args) {
		try {
			Log log = new FileLogFactory().createLog();
			log.writeLog("admin");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
