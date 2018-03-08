package com.blog.controller.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blog.controller.ServletImpl;
import com.blog.service.UserService;

@WebServlet("/user/login")
public class LoginController extends ServletImpl {
	private UserService userService = new UserService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("name", "松哥");
		forward("backend/login");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获取前台传进来的参数
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		
		// 检查是否存在该用户名
		int count = userService.checkUserName(name);
		if(count==0) {
			req.setAttribute("error", "用户不存在");
			forward("backend/error");
			return;
		}
		
		// 检查用户密码是否正确
		int result = userService.checkUserPassword(name, password);
		if(result == 0) {
			req.setAttribute("error","密码不正确");
			forward("backend/error");
			return;
		}
		req.setAttribute("success", name);
		req.getSession().setAttribute("name", name);
		forward("backend/main");
	}
}
