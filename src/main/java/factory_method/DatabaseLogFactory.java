package main.java.factory_method;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:04 18-11-30
 */
public class DatabaseLogFactory implements LogFactory {
	@Override
	public Log createLog() {
		return new DatabaseLog();
	}
}
