package org.kosta.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
 * aop annoatation 크로스커팅 정의 클래스
 */
@Component
@Aspect
public class ComonLoggingAspect {
	private Log log = LogFactory.getLog(getClass());
	
	@Before("execution(public * org.kosta..*Service.find*List*(..))")
	//@Before("execution(public java.util.List org.kosta..*Service.find*List*(..))")
	public void beforeLogging(JoinPoint point) {
		String cn= point.getTarget().getClass().getName();
		String mn= point.getSignature().getName();
		log.info(cn+" "+mn);
	}
}
