/**   
 * <pre>  
 * @author cao_wencao  
 * @date 2018年11月13日 
 * </pre>      
 */
package com.thinkingcao.modules.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * &#64;author cao_wencao
 * &#64;date 2018年11月13日 下午1:34:14
 * </pre>
 */
@RestController
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	@RequestMapping("/hello")
	public String index() {
		logger.info("这是第一个SpringBoot controller");
		return "Hello World";
	}
	
	@RequestMapping("/getMember")
	public String getMember() {
		return "success";
	}

}
