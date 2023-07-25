package com.web.binding;


public class ResetPassword {
	
	private String tempPwd;
	private String pwd;
	private String confPwd;
	public ResetPassword() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResetPassword(String tempPwd, String pwd, String confPwd) {
		super();
		this.tempPwd = tempPwd;
		this.pwd = pwd;
		this.confPwd = confPwd;
	}
	public String getTempPwd() {
		return tempPwd;
	}
	public void setTempPwd(String tempPwd) {
		this.tempPwd = tempPwd;
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
		return "ResetPassword [tempPwd=" + tempPwd + ", pwd=" + pwd + ", confPwd=" + confPwd + "]";
	}
	
	
	

}
