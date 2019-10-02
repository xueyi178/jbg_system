package com.jbg.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 1.层级的工具类
 * 项目名称：jbg_system 
 * 类名称：LevelUtils
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:49:37
 */
public class LevelUtils {

	public final static String SEPARATOR = ".";
	
	public final static String ROOT = "0";
	
	/**
	 * 1.Level层级的计算规则
	 * @param parentLevel
	 * 		上一个部门的层级
	 * @param parentId
	 * 		上一个部门的id
	 * @return
	 */
	public static String calculateLevel(String parentLevel, int parentId) {
		if(StringUtils.isBlank(parentLevel)) {
			return ROOT;
		}
		return StringUtils.join(parentLevel, SEPARATOR, parentId);
	}
}
