package com.bstek.microService.dbandcache.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.bstek.microService.dbandcache.model.User;

/**
* 人员信息Mapper接口类
* @author Sky
*/
@Component
@Mapper
public interface UserMapper {
	
	/**
	 * 获取所有用户信息
	 * @return 用户信息集
	 */
	List<User> getAllUser();
	
	/**
	 * 根据ID获取用户信息
	 * @param id 用户ID
	 * @return 用户信息
	 */
	User selectById(@Param("id") String id);

    /**
     * 根据用户名获取用户信息
     * @param name 用户名
     * @return 用户信息
     */
    List<User> selectByUserName(@Param("name") String name);
	
	/**
	 * 新增用户信息
	 * @param user 用户信息
	 * @return 新增记录数
	 */
	int insert(User user);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return 更新记录数
	 */
	int update(User user);
	
	/**
	 * 根据用户ID删除用户信息
	 * @param id 用户ID
	 * @return 删除记录数
	 */
	int deleteById(@Param("id") String id);
	

     /**
     * 分页获取用户信息 
     * @param offset 页码
     * @param pagesize 页面数量
     * @param name 用户名
     * @return 用户信息
     */
    List<User> pageList(@Param("offset") int offset,
                                        @Param("pagesize") int pagesize,
                                        @Param("name") String name);
     
     /**
     *  获取分页总数
     * @param offset  页码
     * @param pagesize 页面数量
     * @param name 用户名
     * @return 查询分页总数
     */
    int pageListCount(@Param("offset") int offset,
                             @Param("pagesize") int pagesize,
                             @Param("name") String name);

}
