package main.java.builder;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:44 18-12-2
 */
public abstract class MessageBuilder {
	protected MimeMessage mimeMessage = new MimeMessage();

	public abstract void buildFrom();
	public abstract void buildRejection();
	public abstract void buildSubject();
	public abstract void buildText();
	public abstract void buildSendDate();
	public MimeMessage build() {
		return this.mimeMessage;
	}
}
