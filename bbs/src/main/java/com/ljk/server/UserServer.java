package com.ljk.server;
import com.ljk.po.*;
public interface UserServer {
	/**
     * 用户登录验证
     * @return
     */
	public User userLogin(String username,String password);
}
