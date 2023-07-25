package com.web.binding;

import java.beans.Transient;

public class ForgotPassword {
	
	
	private Long phno;
	private String email;
	private String pwd;
	
	private String confPwd;
	public ForgotPassword(Long phno, String email, String pwd, String confPwd) {
		super();
		this.phno = phno;
		this.email = email;
		this.pwd = pwd;
		this.confPwd = confPwd;
		
		
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
	public String getConfPwd() {
		return confPwd;
	}
	public void setConfPwd(String confPwd) {
		this.confPwd = confPwd;
	}
	@Override
	public String toString() {
		return "ForgotPassword [phno=" + phno + ", email=" + email + ", pwd=" + pwd + ", confPwd=" + confPwd + "]";
	}

	
}
