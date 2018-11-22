package com.thinkingcao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <pre>
 * @author cao_wencao
 * @date 2018年11月14日 上午10:16:42
 * </pre>
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication {

	/**
	 * <pre>  
	 * @author cao_wencao
	 * @param args
	 * </pre>  
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);

	}

}
