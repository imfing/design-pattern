package main.java.builder;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:40 18-12-2
 */
public class Direct {

	public MimeMessage construct(MessageBuilder messageBuilder) {
		messageBuilder.buildFrom();
		messageBuilder.buildRejection();
		messageBuilder.buildSendDate();
		messageBuilder.buildSubject();
		messageBuilder.buildText();
		return messageBuilder.build();
	}

	public static void main(String[] args) {
		Direct direct = new Direct();
		MessageBuilder builder = new AdvertisementMessageBuilder();
		MimeMessage construct = direct.construct(builder);
		construct.send();
	}
}
