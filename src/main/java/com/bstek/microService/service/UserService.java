package com.bstek.microService.service;

import java.util.List;

import com.bstek.microService.entity.User;

/**
* @author Sky<br/>
* @Description 用户信息维护接口类
**/
public interface UserService {
	
	
	/**
	 * 获取所有用户信息
	 * @return 用户信息集
	 */
	List<User> getUser();
	
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
	boolean deleteById(String id);

}
