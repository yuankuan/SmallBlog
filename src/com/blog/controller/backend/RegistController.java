package com.blog.controller.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.controller.ServletImpl;
import com.blog.service.UserService;
@WebServlet("/user/register")
public class RegistController extends ServletImpl {
	private UserService userService = new UserService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		forward("backend/register");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 接受参数
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		// to do 检查用户名合法性
		
		// 添加用户
		userService.insertUser(name, password);
		
		redirect("/user/login");
	}
}
