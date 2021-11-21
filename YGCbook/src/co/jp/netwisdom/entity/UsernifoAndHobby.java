package co.jp.netwisdom.entity;

public class UsernifoAndHobby {
     String name;
     String password;
     String sex;
     String major;
     String[]hobby;
     String intro;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public UsernifoAndHobby(String name, String password, String sex, String major, String[] hobby, String intro) {
		super();
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.major = major;
		this.hobby = hobby;
		this.intro = intro;
	}
	public UsernifoAndHobby() {
		super();
	}
     
     
     
}
