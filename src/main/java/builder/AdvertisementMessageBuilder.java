package main.java.builder;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:46 18-12-2
 */
public class AdvertisementMessageBuilder extends MessageBuilder {
	@Override
	public void buildFrom() {
		System.out.println("ad msg from");
	}

	@Override
	public void buildRejection() {
		System.out.println("ad msg rejection");
	}

	@Override
	public void buildSubject() {
		System.out.println("ad msg subject");
	}

	@Override
	public void buildText() {
		System.out.println("ad msg text");
	}

	@Override
	public void buildSendDate() {
		System.out.println("ad msg send date");
	}
}
