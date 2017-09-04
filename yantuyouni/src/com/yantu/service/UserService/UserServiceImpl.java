package com.yantu.service.UserService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yantu.dao.user.UserMapper;
import com.yantu.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	public User getLoginUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getLoginUser(user);
	}

	public int userIsExit(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.userIsExit(user);
	}

	public int modifyUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.modifyUser(user);
	}

	public int registerUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.registerUser(user);
	}

}
