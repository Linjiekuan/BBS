package com.ljk.serverImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ljk.po.*;
import com.ljk.dao.*;
import com.ljk.server.*;
@Service("userServer")//@Service���ڱ�עҵ������
public class UserServerImpl implements UserServer {
	@Autowired  //�Զ�ע�룬����newһ��
    private UserDAO userDao; 
	/**
     * �û���¼��֤
     * @return
     */
	public User userLogin(String username, String password) {
		return userDao.userLogin(username, password);
	}
	/**
     * �û�ע��
     * @return
     */
	public void userRegister(User user) {
		userDao.userRegister(user);
	}
	

}
