<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <div>
  	<%-- <s:property value="msg"/> --%>
  	<s:fielderror></s:fielderror>
  </div>
    <h1>欢迎使用struts2</h1>
	<form action="loginUser" method="post" name="frm1">
		请输入用户名：<input type="text" value="" name="username" /><br>
		请输入密码：<input type="password" value="" name="pwd" />
		<input type="submit" value="提交" />
	</form>
  </body>
</html>
