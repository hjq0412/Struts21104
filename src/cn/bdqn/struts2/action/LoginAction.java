package cn.bdqn.struts2.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction implements Action {

	private String username;
	private String pwd;
	private String msg;
	
	//与servlet API 解耦的访问方式
//	ActionContext context = ActionContext.getContext();
//	Map session = context.getSession();
//	Map request = (Map) context.get("request");
	
	//与servlet API 耦合的访问方式
	HttpSession session = ServletActionContext.getRequest().getSession();
	HttpServletRequest request = ServletActionContext.getRequest();
	public String execute() throws Exception {
		if (this.getUsername().equals("hjq") && this.getPwd().equals("0412")) {
//			session.put("suname", username);
//			request.put("runame", username);
			session.setAttribute("suname", username);
			request.setAttribute("runame", username);
			return "success";
		}else {
			this.setMsg("用户名或密码错误！");
			return "failed";
		}
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
