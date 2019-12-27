package com.bstek.microService.service;

import java.util.List;

import com.bstek.microService.dbandcache.model.User;


/**
* 用户信息维护接口类
* @author Sky
**/
public interface UserService {
	
	
	/**
	 * 获取所有用户信息
	 * @return 用户信息集
	 */
	List<User> getAllUser();
	
	/**
	 * 根据用户姓名获取所有用户信息
	 * @param name 用户姓名
	 * @return 用户信息集
	 */
	List<User> selectByUserName(String name);
	
	/**
	 * 新增用户信息
	 * @param user 用户信息
	 */
	void addUser(User user);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return true-更新成功</br>false-更新失败
	 */
	boolean update(User user);
	
	/**
	 * 根据用户ID删除用户信息
	 * @param id 用户ID
	 * @return true-更新成功</br>false-更新失败
	 */
	boolean deleteById(int id);
}
