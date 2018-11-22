/**   
 * <pre>  
 * @author cao_wencao  
 * @date 2018年11月13日 
 * </pre>      
 */
package com.thinkingcao.modules.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * &#64;author cao_wencao
 * &#64;date 2018年11月13日 下午1:52:07
 * </pre>
 */
@RestController
public class IndexController {
	@Value("${name}")
	private String name;

	@RequestMapping("getName")
	public String getName() {
		return name;
	}
}
