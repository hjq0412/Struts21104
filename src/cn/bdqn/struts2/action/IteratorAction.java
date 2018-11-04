package cn.bdqn.struts2.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class IteratorAction extends ActionSupport {

	private List<String> list;
	public String getNameList() {
		list=new ArrayList<String>();
		list.add("小白");
		list.add("小白2");
		list.add("小白3");
		list.add("小白4");
		list.add("小白5");
		return "success";
	}
	
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
}
