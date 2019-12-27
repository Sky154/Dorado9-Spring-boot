package com.bstek.microService.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bstek.microService.dbandcache.mapper.UserMapper;
import com.bstek.microService.dbandcache.model.User;

/**
* 
* @author Sky
*/
@Repository
public class UserDao {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 获取所有用户信息
	 * @return 用户信息集
	 */
	public List<User> getAllUser(){
		return userMapper.getAllUser();
	}
	
	/**
	 * 根据ID获取用户信息
	 * @param id 用户ID
	 * @return 用户信息
	 */
	public User selectById(String id){
		return userMapper.selectById(id);
	}

    /**
     * 根据用户名获取用户信息
     * @param name 用户名
     * @return 用户信息
     */
	public List<User> selectByUserName(String name){
		return userMapper.selectByUserName(name);
	}
	
	/**
	 * 新增用户信息
	 * @param user 用户信息
	 * @return 新增记录数
	 */
	public int insert(User user){
		return userMapper.insert(user);
	}
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return 更新记录数
	 */
	public int update(User user){
		return userMapper.update(user);
	}
	
	/**
	 * 根据用户ID删除用户信息
	 * @param id 用户ID
	 * @return 删除记录数
	 */
	public int deleteById(String id){
		return userMapper.deleteById(id);
	}
	

     /**
     * 分页获取用户信息 
     * @param offset 页码
     * @param pagesize 页面数量
     * @param name 用户名
     * @return 用户信息
     */
	public List<User> pageList(int offset, int pagesize, String name){
		return userMapper.pageList(offset, pagesize, name);
	}
     
     /**
     *  获取分页总数
     * @param offset  页码
     * @param pagesize 页面数量
     * @param name 用户名
     * @return 查询分页总数
     */
	public int pageListCount(int offset, int pagesize, String name){
		return userMapper.pageListCount(offset, pagesize, name);
	}

}
