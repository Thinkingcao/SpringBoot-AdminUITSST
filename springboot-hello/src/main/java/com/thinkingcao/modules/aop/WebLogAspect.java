package com.thinkingcao.modules.aop;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 
 * <pre>  
 * 通过AOP打印日志请求 
 * @author cao_wencao  
 * @date 2018年11月13日 
 * </pre>
 */
@Aspect
@Component
public class WebLogAspect {
	// 定义一个全局log变量
	private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

	// AOP切入点，拦截哪些方法
	@Pointcut("execution(public * com.thinkingcao.modules.controller.*.*(..))")
	public void webLog() {
	}

	/**
	 * 
	 * <pre>  
	 * 使用AOP前置通知拦截请求信息
	 * @author cao_wencao
	 * @param joinPoint
	 * @throws Throwable
	 * </pre>
	 */
	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		// 记录下请求内容
		logger.info("【请求的URL 】: " + request.getRequestURL().toString());
		logger.info("【请求的HTTP_METHOD】 : " + request.getMethod());
		logger.info("【请求的IP 】: " + request.getRemoteAddr());
		Enumeration<String> enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			logger.info("name:{},value:{}", name, request.getParameter(name));
		}
	}
    
	/**
	 * <pre>  
	 * 后置通知
	 * @author cao_wencao
	 * @param ret
	 * @throws Throwable
	 * </pre>
	 */
	@AfterReturning(returning = "ret", pointcut = "webLog()")
	public void doAfterReturning(Object ret) throws Throwable {
		// 处理完请求，返回内容
		logger.info("RESPONSE : " + ret);
	}
}
