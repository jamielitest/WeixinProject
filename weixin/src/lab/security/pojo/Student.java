package lab.security.pojo;

import java.io.Serializable;
/**
 * 
 * @author zzk
 *
 */
public class Student implements Serializable{

	/**
	 * serial version ID
	 */
	private static final long serialVersionUID = 7123627267856319708L;
	/**
	 * 学号
	 */
	private String studentNum;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 联系电话
	 */
	private String telephone;
	/**
	 * 个人主页
	 */
	private String homePage;
	/**
	 * 毕业母校
	 */
	private String motherSchool;
	/**
	 * 本科专业
	 */
	private String collegeMajor;
	/**
	 * 个人介绍
	 */
	private Object selfIntro;
	/**
	 * 导师ID
	 */
	private int profId;
	
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum == null ? null : studentNum.trim();
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}
	public String getStudentName() {
		return name;
	}
	public void setStudentName(String studentName) {
		this.name = studentName == null ? null : studentName.trim();
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone == null ? null : telephone.trim();
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage == null ? null : homePage.trim();
	}
	public String getMotherSchool() {
		return motherSchool;
	}
	public void setMotherSchool(String motherSchool) {
		this.motherSchool = motherSchool == null ? null : motherSchool.trim();
	}
	public String getCollegeMajor() {
		return collegeMajor;
	}
	public void setCollegeMajor(String collegeMajor) {
		this.collegeMajor = collegeMajor == null ? null : collegeMajor.trim();
	}
	public Object getSelfIntro() {
		return selfIntro;
	}
	public void setSelfIntro(Object selfIntro) {
		this.selfIntro = selfIntro;
	}
	public int getProfID() {
		return profId;
	}
	public void setProfID(int profId) {
		this.profId = profId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 
}
