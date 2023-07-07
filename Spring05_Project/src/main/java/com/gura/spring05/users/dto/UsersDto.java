package com.gura.spring05.users.dto;

public class UsersDto {
	
	private String id;
	private String pwd;
	private String email;
	private String profile;
	private String regdate;
	private String newPwd;
	
	/**
	 * 디폴트 생성자는 객체가 생성될 때 사용자가 초깃값을 명시하지 않으면, 
	 * 컴파일러가 자동으로 제공하는 생성자입니다. 
	 * 디폴트 생성자는 사용자로부터 인수를 전달받지 않으므로, 
	 * 매개변수를 가지지 않습니다.
	 */
	public UsersDto() {}
	
	public UsersDto(String id, String pwd, String email, String profile, String regdate, String newPwd) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.profile = profile;
		this.regdate = regdate;
		this.newPwd = newPwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	
}
