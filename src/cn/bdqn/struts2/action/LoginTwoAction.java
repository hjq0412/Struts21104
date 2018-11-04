package cn.bdqn.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginTwoAction extends ActionSupport{

	private String username;
	private String pwd;
	private String msg;
	
	public String login(){
		if (this.getUsername().equals("hjq") && this.getPwd().equals("0412")) {
			return "success";
		}
		return "error";
	}
	
	public String regist(){
		this.setMsg("模拟注册成功");
		return "login";
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
