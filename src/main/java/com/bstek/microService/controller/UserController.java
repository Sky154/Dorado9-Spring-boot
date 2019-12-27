package com.bstek.microService.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.microService.dbandcache.model.User;
import com.bstek.microService.service.UserService;

/**
*  用户信息控制层
* @author Sky
**/
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@DataProvider
	public List<User> getAllUser(Map<String,Object> parameter) {
		if(parameter != null && parameter.size() > 0) {
			return userService.selectByUserName((String)parameter.get("name"));
		}else {
			return userService.getAllUser();
		}
	}
	
	@DataResolver
	public Map<String,Object> saveUser(List<User> userlist, Map<String,Object> parameter) {
		Map<String,Object> mapResult = new HashMap<String,Object>();
		if(userlist != null && userlist.size() > 0 ) {
			try {
				for(User user : userlist) {
					EntityState state = EntityUtils.getState(user);
					if(state.equals(EntityState.NEW)){
						userService.addUser(user);
					}else if(state.equals(EntityState.DELETED)) {
						userService.deleteById(user.getId());
					}else {
						userService.update(user);
					}
				}
				mapResult.put("result", true);
				mapResult.put("message", "数据保存成功");
			}catch(Exception e) {
				mapResult.put("result", false);
				mapResult.put("message", "数据保存失败：" + e.getMessage());
			}
		}else {
			mapResult.put("result", false);
			mapResult.put("message", "无数据提交，保存失败");
		}
		return mapResult;
	}

}