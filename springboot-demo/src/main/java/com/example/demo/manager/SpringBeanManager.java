package com.example.demo.manager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.modules.entity.User;
/**
 * 
 * @ClassName: SpringBeanManager  
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cao_wencao  
 * @date 2018年11月13日  
 *
 */
@Configuration
public class SpringBeanManager {
	/**
	 * 
	 * @author cao_wencao
	 * @return
	 */
	@Bean
	public User user() {
		return new User();
	}
}
