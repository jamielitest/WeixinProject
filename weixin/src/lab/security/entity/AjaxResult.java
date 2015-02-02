package lab.security.entity;

public class AjaxResult {
	/**
	 * 成功或者失败
	 */
	private boolean status ;
	
	/**
	 * 错误代码
	 */
	private  String code;

	/**
	 * 返回消息
	 */
	private String  msg;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null? null : code.trim();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg == null ? null : msg.trim();
	}
	
	
}
