package lab.security.pojo;

import java.io.Serializable;
/**
 * 
 * @author zzk
 *
 */
public class Paper implements Serializable{

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = -7503995468148682948L;
	/**
	 * 论文标题
	 */
	private String title;
	/**
	 * 期刊名称
	 */
	private String journal;
	/**
	 * 发表日期
	 */
	private String publishTime;
	/**
	 * 导师ID
	 */
	private int profId;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the journal
	 */
	public String getJournal() {
		return journal;
	}
	/**
	 * @param journal the journal to set
	 */
	public void setJournal(String journal) {
		this.journal = journal;
	}
	/**
	 * @return the publishTime
	 */
	public String getPublishTime() {
		return publishTime;
	}
	/**
	 * @param publishTime the publishTime to set
	 */
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	/**
	 * @return the profId
	 */
	public int getProfId() {
		return profId;
	}
	/**
	 * @param profId the profId to set
	 */
	public void setProfId(int profId) {
		this.profId = profId;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
