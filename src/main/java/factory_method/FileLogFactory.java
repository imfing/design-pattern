package main.java.factory_method;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:05 18-11-30
 */
public class FileLogFactory implements LogFactory {
	@Override
	public Log createLog() {
		return new FileLog();
	}
}
