<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${cxt}/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>仪表盘</title>
</head>

<frameset rows="30px,*" border="1" framespacing="1">
	<frame src="main/header" name="top" />
	<frameset cols="160px,*">
		<frame src="main/left" name="left" />
		<frame src="main/write_article" name="right" />
	</frameset>
</frameset>
</html>