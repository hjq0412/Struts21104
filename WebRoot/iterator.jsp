<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
  <s:if test="list!=null">
  	<s:iterator value="list" id="ss">
  		<s:property value="ss"/>
  	</s:iterator>
  	</s:if>
  	<s:else>
  		没有数据
  	</s:else>
  
  </body>
</html>
