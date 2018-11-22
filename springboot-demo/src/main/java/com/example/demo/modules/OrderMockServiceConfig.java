package com.example.demo.modules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.modules.entity.User;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OrderMockServiceConfig implements CommandLineRunner {
	private final static Logger logger = LoggerFactory.getLogger(OrderMockServiceConfig.class);
	/*@Autowired
	private ApplicationContext applicationContext;
	@Value("${excute.env}")
	private String env;*/

	@Override
	public void run(String... strings) throws Exception { // 非本地环境不做处理
		/*if ("dev".equals(env) || "test".equals(env) || "pro".equals(env)) {
			return;
		}*/
        log.info("哈哈");
       
	/*	DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext
				.getAutowireCapableBeanFactory();*/
/*
		OrderServiceClient orderServiceClient = defaultListableBeanFactory.getBean(OrderServiceClient.class);
		logger.info("======orderServiceClient {}=====", orderServiceClient.getClass());

		defaultListableBeanFactory.removeBeanDefinition(OrderServiceClient.class.getCanonicalName());

		OrderServiceClient mockOrderApi = PowerMockito.mock(OrderServiceClient.class,
				invocationOnMock -> BaseResponse.createSuccess(DateUtil.getLongTime() + "", "mock orderNo success"));

		defaultListableBeanFactory.registerSingleton(OrderServiceClient.class.getCanonicalName(), mockOrderApi);

		logger.info("======mockOrderApi {}=====", mockOrderApi.getClass());*/
	}
}