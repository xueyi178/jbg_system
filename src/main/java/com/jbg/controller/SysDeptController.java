package com.jbg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbg.entity.SysDept;
import com.jbg.service.SysDeptService;
import com.jbg.utils.R;

/**
 * 1.部门的控制层接口
 * 项目名称：jbg_system 
 * 类名称：SysDeptController
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:37:10
 */
@RestController
@RequestMapping(value="/api/sys/dept")
public class SysDeptController {

	@Autowired
	private SysDeptService sysDeptService;
	
	/**
	 * 1.添加部门信息
	 * @param dept
	 * @return
	 */
	@RequestMapping(value="/insertSysDept.json")
	public R insertSysDept(SysDept dept) {
		Assert.notNull(dept.getName(), "部门名称不能为空!");
		Assert.notNull(dept.getSeq(), "部门在当前层级的顺序不能为空!");
		Assert.notNull(dept.getRemark(), "备注信息不能为空!");
		Assert.notNull(dept.getParentId(), "父ID不能为空!");
		return sysDeptService.insertSysDept(dept);
	}
}
