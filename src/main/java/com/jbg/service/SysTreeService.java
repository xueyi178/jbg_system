package com.jbg.service;

import java.util.List;
import com.jbg.vo.DeptLevelVo;
/**
 * 1.SysTree的业务逻辑层接口
 * 项目名称：jbg_system 
 * 类名称：SysTreeService
 * 开发者：Lenovo
 * 开发时间：2019年9月18日下午4:20:25
 */
public interface SysTreeService {
	
	/**
	 * 1.获取部门树形结构
	 * @return
	 */
	public List<DeptLevelVo> deptTree();

}
