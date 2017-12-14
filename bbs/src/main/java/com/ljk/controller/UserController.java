package com.ljk.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	@Qualifier("userServer")
	private UserServer userServer;
	@RequestMapping(value="/useLogin")
	public String userLogin(HttpServletRequest request, HttpServletResponse response){
		User user = new User();
		//user.setUsername(request.getParameter("username"));
		//user.setPassword(request.getParameter("password"));
		user = userServer.userLogin(request.getParameter("username"), request.getParameter("password"));
		if(user != null){
			return "test.jsp";
		}
		else{
			return "error";
		}
		
	}
}
