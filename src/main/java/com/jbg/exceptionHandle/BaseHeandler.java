package com.jbg.exceptionHandle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jbg.utils.R;
/**
 * 1.全局异常处理
 * 项目名称：jbg_system 
 * 类名称：BaseHeandler
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午12:52:55
 */
@RestControllerAdvice
public class BaseHeandler {
	private Logger log = LoggerFactory.getLogger(BaseHeandler.class);

	@ExceptionHandler				
	public R handleException(IllegalArgumentException e) {
		log.info("异常信息:[{}]",e.getMessage());
		return R.error().put("msg", e.getMessage());
	}

	@ExceptionHandler				
	public R handleException(RuntimeException e) {
		log.info("异常信息:[{}]",e.getMessage());
		return R.error().put("msg", e.getMessage());
	}
}
