package oa.bean;

import java.util.Date;

public class Student {

	private Long id;
	private String name;
	private String password;
	private String sex;
	private String birthday;
	private String pic;
	private String stu_from;
	private String jian_Jie;//学生简介
	private String address;
	private String entrytime;//入学时间 
	private String political;//政治面貌
	private String stu_type;//生源类型
	private String state;//民族
	private String study;//学制
	private String telephone;
	private Classes classes;
	private Xueyuan xueyuan;
	public Xueyuan getXueyuan() {
		return xueyuan;
	}
	public void setXueyuan(Xueyuan xueyuan) {
		this.xueyuan = xueyuan;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getStu_from() {
		return stu_from;
	}
	public void setStu_from(String stu_from) {
		this.stu_from = stu_from;
	}
	public String getJian_Jie() {
		return jian_Jie;
	}
	public void setJian_Jie(String jian_Jie) {
		this.jian_Jie = jian_Jie;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEntrytime() {
		return entrytime;
	}
	public void setEntrytime(String entrytime) {
		this.entrytime = entrytime;
	}
	public String getPolitical() {
		return political;
	}
	public void setPolitical(String political) {
		this.political = political;
	}
	public String getStu_type() {
		return stu_type;
	}
	public void setStu_type(String stu_type) {
		this.stu_type = stu_type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
}
