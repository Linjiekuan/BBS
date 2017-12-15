package com.ljk.controller;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ljk.po.User;
import com.ljk.server.UserServer;
import com.ljk.serverImpl.UserServerImpl;
@Controller
public class UserController {
	@Autowired
	@Qualifier("userServer")
	private UserServer userServer;
	
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	@RequestMapping(value="/register")
	public String register(){
		return "register";
	}
	/**
     * 用户登录控制
     * @return
     */
	@RequestMapping(value="/userLogin")
	public String userLogin(HttpServletRequest request, HttpServletResponse response){
		User user = new User();
		//user.setUsername(request.getParameter("username"));
		//user.setPassword(request.getParameter("password"));
		user = userServer.userLogin(request.getParameter("username"), request.getParameter("password"));
		if(user!= null){
			request.getSession().setAttribute("username", user.getUsername());
			return "test";
		}
		else{
			return "error";
		}
		
	}
	/**
     * 用户注册控制
     * @return
     */
	@RequestMapping(value="/userRegister")
	public String userRegister(	@Param("username") String username, @Param("password") String password,
			@Param("email") String email,@Param("number") String number, HttpServletRequest request, HttpServletResponse response){
		User user =new User();
		user.setEmail(email);
		user.setNumber(number);
		user.setPassword(password);
		user.setUsername(username);
		userServer.userRegister(user);
		return "login";
		
	}
}
