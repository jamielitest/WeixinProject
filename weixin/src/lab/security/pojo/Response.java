package lab.security.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author zzk
 *
 */
public class Response implements Serializable{

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 5365354347542535796L;
	/**
	 * 发送给用户
	 */
	private String toUserName;
	/**
	 * 发自用户
	 */
	private String fromUserName;
	/**
	 * 消息内容
	 */
	private String messageType;
	/**
	 * 响应时间
	 */
	private Date   respondTime;
	/**
	 * 响应内容
	 */
	private String responseContent;
	/**
	 * @return the toUserName
	 */
	public String getToUserName() {
		return toUserName;
	}
	/**
	 * @param toUserName the toUserName to set
	 */
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	/**
	 * @return the fromUserName
	 */
	public String getFromUserName() {
		return fromUserName;
	}
	/**
	 * @param fromUserName the fromUserName to set
	 */
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	/**
	 * @return the messageType
	 */
	public String getMessageType() {
		return messageType;
	}
	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	/**
	 * @return the respondTime
	 */
	public Date getRespondTime() {
		return respondTime;
	}
	/**
	 * @param respondTime the respondTime to set
	 */
	public void setRespondTime(Date respondTime) {
		this.respondTime = respondTime;
	}
	/**
	 * @return the responseContent
	 */
	public String getResponseContent() {
		return responseContent;
	}
	/**
	 * @param responseContent the responseContent to set
	 */
	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
