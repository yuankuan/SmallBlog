<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${cxt }/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/common/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/backend/login.js"></script>
<link rel="stylesheet" href="css/common/bootstrap.min.css">
<link rel="stylesheet" href="css/backend/login.css" />
<title>login</title>
</head>
<body>
		<div id="wrap">
			<div id="loginform">
				<form action="user/login" method="post">
				<div id="smallform">
					<ul>
						<li>用户名</li>
						<li><input type="text" class="logininput" name="username"></li>
						<br />
						<li>密码</li>
						<li><input type="password" class="logininput" name="password"></li>
						<br />
						<li><input type="checkbox" value="记住我的登录信息">记住我的登录信息
							<button class="btn btn-primary loginbutton">登录</button></li>
					</ul>
				</div>
			</form>
			</div>
			<p id="bottom"><a href="#">注册</a> | <a href="#">忘记密码?</a></p>
		</div>
	</body>
</html>