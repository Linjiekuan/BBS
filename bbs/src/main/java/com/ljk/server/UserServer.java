package com.ljk.server;
import com.ljk.po.*;
public interface UserServer {
	/**
     * �û���¼��֤
     * @return
     */
	public User userLogin(String username,String password);
}
