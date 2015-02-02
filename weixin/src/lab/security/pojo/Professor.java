package lab.security.pojo;

import java.io.Serializable;
/**
 * 
 * @author zzk
 *
 */
public class Professor implements Serializable{

	/**
	 * Serial version id
	 */
	private static final long serialVersionUID = 1875994629812554842L;
	/**
	 * 教授生日
	 */
	private String birthday;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 职称
	 */
	private String position;
	/**
	 * 性格脾气
	 */
	private String characters;
	/**
	 * 工作背景
	 */
	private String background;
	
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday == null ? null : birthday.trim();
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position == null ? null : position.trim();
	}
	/**
	 * @return the characters
	 */
	public String getCharacters() {
		return characters;
	}
	/**
	 * @param characters the characters to set
	 */
	public void setCharacters(String characters) {
		this.characters = characters == null ? null : characters.trim();
	}
	/**
	 * @return the background
	 */
	public String getBackground() {
		return background;
	}
	/**
	 * @param background the background to set
	 */
	public void setBackground(String background) {
		this.background = background == null ? null : background.trim();
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
