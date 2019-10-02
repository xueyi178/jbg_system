package com.jbg.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbg.entity.SysDept;
import com.jbg.mapper.SysDeptMapper;
import com.jbg.service.SysDeptService;
import com.jbg.utils.LevelUtils;
import com.jbg.utils.R;
/**
 * 1.部门的业务逻辑实现类
 * 项目名称：jbg_system 
 * 类名称：SysDeptServiceImpl
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:41:54
 */
@Service
public class SysDeptServiceImpl implements SysDeptService{

	@Autowired 
	private  SysDeptMapper sysDeptMapper;

	/**
	 * 1.添加用户信息
	 */
	@Override
	public R insertSysDept(SysDept dept) {
		if(checkExist(dept.getParentId(), dept.getName(), dept.getId())) {
			return R.error().put("msg", "同一层级下存在相同名称的部门!");
		}

		dept.setLevel(LevelUtils.calculateLevel(getLevel(dept.getParentId()), dept.getParentId()));
		dept.setOperator("system");
		dept.setOperatorIp("127.0.0.1");
		dept.setOperatorTime(new Date());
		int falg = sysDeptMapper.insertSelective(dept);
		if(falg > 0) {
			return R.ok();
		}
		return R.error().put("msg", "添加部门信息失败,请重试!");
	}

	private boolean checkExist(Integer parentId, String deptName, Integer deptId) {
		return false;
	}

	/**
	 * 获取上一个Level的层级
	 * @param deptId
	 * @return
	 */
	private String getLevel(Integer deptId) {
		SysDept dept = sysDeptMapper.selectByPrimaryKey(deptId);
		if (dept == null) {
			return null;
		}
		return dept.getLevel();
	}
}
