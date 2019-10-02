package com.jbg.service;


import com.jbg.entity.SysDept;
import com.jbg.utils.R;
/**
 * 1.部门的业务逻辑层接口
 * 项目名称：jbg_system 
 * 类名称：SysDeptService
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:40:40
 */
public interface SysDeptService {

	/**
	 * 1.添加部门
	 * @param dept
	 * @return
	 */
	public R insertSysDept(SysDept dept);
}
