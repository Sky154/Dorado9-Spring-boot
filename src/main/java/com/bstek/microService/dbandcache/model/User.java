package com.bstek.microService.dbandcache.model;

import lombok.Data;

/**
* 人员信息
* @author Sky
*/
@Data
public class User {
	/**用户ID*/
    private int id;
    /**姓名*/
    private String name;
    /**年龄*/
    private Integer age;
    /**电子邮箱*/
    private String email;
    /**职务*/
    private String job;
    /**部门*/
    private String department;
}
