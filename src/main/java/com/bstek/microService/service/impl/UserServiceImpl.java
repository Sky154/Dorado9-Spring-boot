package com.bstek.microService.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bstek.microService.entity.User;
import com.bstek.microService.service.UserService;

/**
* @author Sky
* @Description 用户信息维护接口实现类
**/
@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> getUser() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO 自动生成的方法存根

	}

	@Override
	public boolean update(User user) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean deleteById(String id) {
		// TODO 自动生成的方法存根
		return false;
	}

}
