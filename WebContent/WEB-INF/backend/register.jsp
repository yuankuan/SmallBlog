<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${cxt }/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/common/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/backend/register.js"></script>
<link rel="stylesheet" href="css/common/bootstrap.min.css">
<link rel="stylesheet" href="css/backend/register.css" />
<title>register</title>
</head>
<body>
	<div id="wrap">
		<div id="registerform">
			<form action="user/register" method="post">
				<div id="smallform">
					<ul>
						<li>用户名</li>
						<li><input type="text" class="registerinput" name="name"></li>
						<br />
						<li>密码</li>
						<li><input type="password" class="registerinput" name="password"></li>
						<br />
						<li>
							<button class="btn btn-primary registerbutton">注册</button>
						</li>
					</ul>
				</div>
			</form>
		</div>
		<p id="bottom">
			<label>已有密码</label><a href="user/login">直接登录</a>
		</p>
	</div>
</body>
</html>