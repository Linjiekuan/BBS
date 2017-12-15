package com.ljk.serverImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ljk.po.*;
import com.ljk.dao.*;
import com.ljk.server.*;
@Service("userServer")//@Service用于标注业务层组件
public class UserServerImpl implements UserServer {
	@Autowired  //自动注入，不用new一个
    private UserDAO userDao; 
	/**
     * 用户登录验证
     * @return
     */
	public User userLogin(String username, String password) {
		return userDao.userLogin(username, password);
	}
	/**
     * 用户注册
     * @return
     */
	public void userRegister(User user) {
		userDao.userRegister(user);
	}
	

}
