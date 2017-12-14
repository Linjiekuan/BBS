package com.ljk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.ljk.po.User;
@Repository //spring的注解 ，用于标注数据访问组件,即DAO组件，把这些类纳入进spring容器中管理
public interface UserDAO {
	//登陆验证
	public User userLogin(@Param("username") String username, 
			@Param("password") String password); 
}
