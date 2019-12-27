package com.bstek.microService.dbandcache.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
* MyBatisc初始化类
* @author Sky
*/
@Configuration
@MapperScan(basePackages = "com.bstek.microService.dbandcache.mapper")
public class MyBatisConfig {
	
	private static String DRIVERCLASSNAME = "driverClassName";
	private static String URL = "url";
	private static String USERNAME = "username";
	private static String PASSWORD = "password";
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource h2DataSource() throws Exception {
		Properties props = new Properties();
		props.put(DRIVERCLASSNAME, env.getProperty("spring.datasource.driver-class-name"));
		props.put(URL, env.getProperty("spring.datasource.url"));
		props.put(USERNAME, env.getProperty("spring.datasource.username"));
		props.put(PASSWORD, env.getProperty("spring.datasource.password"));
		return DruidDataSourceFactory.createDataSource(props);
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		//指定数据源
		factoryBean.setDataSource(dataSource);
		//指定基包
		factoryBean.setTypeAliasesPackage("com.bstek.microService.dbandcache.model");
		//指定xml文件位置
		factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapping/*.xml"));
		return factoryBean.getObject();
	}

}
