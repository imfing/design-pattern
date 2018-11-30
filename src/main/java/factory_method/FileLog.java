package main.java.factory_method;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:03 18-11-30
 */
public class FileLog implements Log {
	@Override
	public void writeLog(String logs) {
		System.out.println("fileLog writing");
	}
}
