package main.java.abstract_factory;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:19 18-11-30
 */
public class TclFactory implements EFactory {
	@Override
	public Tv createTv() {
		return new TclTv();
	}

	@Override
	public AirConditioner createAirConditioner() {
		return new TclAriConditioner();
	}
}
