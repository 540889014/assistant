package oa.bean;

import java.util.Date;

public class Assistant {

	private Integer id;
	private String username;
	private String password;
	private String AS_name;
	private Date AS_birthday;
	private String AS_sex;
	private String zhengZhiMianMao;//政治面貌
	private String AS_state;//民族
	private String zhiChengDaiMa;//职称代码
	private Xueyuan xueyuan;//所在学院
	private String AS_study;//学位
	private String AS_from;//籍贯
	private String AS_phone;
	private String AS_address;//联系地址
	private String AS_info;//简介
	private String AS_pic;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAS_name() {
		return AS_name;
	}
	public void setAS_name(String aSName) {
		AS_name = aSName;
	}
	public Date getAS_birthday() {
		return AS_birthday;
	}
	public void setAS_birthday(Date aSBirthday) {
		AS_birthday = aSBirthday;
	}
	public String getAS_sex() {
		return AS_sex;
	}
	public void setAS_sex(String aSSex) {
		AS_sex = aSSex;
	}
	public String getZhengZhiMianMao() {
		return zhengZhiMianMao;
	}
	public void setZhengZhiMianMao(String zhengZhiMianMao) {
		this.zhengZhiMianMao = zhengZhiMianMao;
	}
	public String getAS_state() {
		return AS_state;
	}
	public void setAS_state(String aSState) {
		AS_state = aSState;
	}
	public String getZhiChengDaiMa() {
		return zhiChengDaiMa;
	}
	public void setZhiChengDaiMa(String zhiChengDaiMa) {
		this.zhiChengDaiMa = zhiChengDaiMa;
	}
	public Xueyuan getXueyuan() {
		return xueyuan;
	}
	public void setXueyuan(Xueyuan xueyuan) {
		this.xueyuan = xueyuan;
	}
	public String getAS_study() {
		return AS_study;
	}
	public void setAS_study(String aSStudy) {
		AS_study = aSStudy;
	}
	public String getAS_from() {
		return AS_from;
	}
	public void setAS_from(String aSFrom) {
		AS_from = aSFrom;
	}
	public String getAS_phone() {
		return AS_phone;
	}
	public void setAS_phone(String aSPhone) {
		AS_phone = aSPhone;
	}
	public String getAS_address() {
		return AS_address;
	}
	public void setAS_address(String aSAddress) {
		AS_address = aSAddress;
	}
	public String getAS_info() {
		return AS_info;
	}
	public void setAS_info(String aSInfo) {
		AS_info = aSInfo;
	}
	public String getAS_pic() {
		return AS_pic;
	}
	public void setAS_pic(String aSPic) {
		AS_pic = aSPic;
	}
	
}
