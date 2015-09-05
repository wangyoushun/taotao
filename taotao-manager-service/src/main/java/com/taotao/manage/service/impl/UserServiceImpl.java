package com.taotao.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.manage.mapper.IUserMapper;
import com.taotao.manage.pojo.User;
import com.taotao.manage.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserMapper userMap;
	
	public List<User> queryUsers() {
		return userMap.queryUsers();
	}
	

}
