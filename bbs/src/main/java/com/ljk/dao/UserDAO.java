package com.ljk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.ljk.po.User;
@Repository //spring��ע�� �����ڱ�ע���ݷ������,��DAO���������Щ�������spring�����й���
public interface UserDAO {
	//��½��֤
	public User userLogin(@Param("username") String username, 
			@Param("password") String password); 
}
