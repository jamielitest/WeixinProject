package lab.security.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @author zzk
 *
 */
public class Request implements Serializable{

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = -2374664535057335295L;
	/**
	 * 发送给用户名
	 */
	private String toUserName;
	/**
	 * 发自用户
	 */
	private String fromUserName;
	/**
	 * 消息类型
	 */
	private String messageType;
	/**
	 * 接受时间
	 */
	private Date acceptTime;
	/**
	 * 请求内容
	 */
	private String content;
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
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return acceptTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
