package com.bstek.microService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bstek.microService.dao.UserDao;
import com.bstek.microService.dbandcache.model.User;
import com.bstek.microService.service.UserService;

/**
*  用户信息维护接口实现类
* @author Sky
**/
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}
	
	@Override
	public List<User> selectByUserName(String name) {
		return userDao.selectByUserName(name);
	}

	@Override
	public void addUser(User user) {
		userDao.insert(user);

	}

	@Override
	public boolean update(User user) {
		int rownum = userDao.update(user);
		if(rownum > 0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean deleteById(int id) {
		int rownum = userDao.deleteById(id);
		if(rownum > 0) {
			return true;
		}else {
			return false;
		}
	}
}
