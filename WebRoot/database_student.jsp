<%@page import="java.sql.*"%>
<%@page import="db.DbPool"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
<body>
	<center>

		<s:form action="jdbc/alls" method="post">
			显示所有
			<s:submit value="所有图书" />
		</s:form>
	</center>
</body>
</html>