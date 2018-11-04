package cn.bdqn.struts2.action;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {

	private String username;

	public String execute() throws Exception {
		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
