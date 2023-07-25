package com.web.binding;


public class AdminLoging {
	
	
	private Long phno;
	
	private String email;
	
	private String pwd;

	public AdminLoging() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminLoging(Long phno, String email, String pwd) {
		super();
		this.phno = phno;
		this.email = email;
		this.pwd = pwd;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "AdminLoging [phno=" + phno + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
}
