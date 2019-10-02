package com.jbg.vo;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.google.common.collect.Lists;
import com.jbg.entity.SysDept;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 1.树形结构
 * 项目名称：jbg_system 
 * 类名称：DeptLevelVo
 * 开发者：Lenovo
 * 开发时间：2019年9月18日下午4:13:12
 */
@Getter
@Setter
@ToString
public class DeptLevelVo extends SysDept{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 4248312423160951345L;
	
	private List<DeptLevelVo> deptList = Lists.newArrayList();
	
	/**
	 * 1.部门层级数据结构
	 * @param dept
	 * @return
	 */
	public static DeptLevelVo adapt(SysDept dept) {
		DeptLevelVo deptLevelVo = new DeptLevelVo();
		BeanUtils.copyProperties(dept, deptLevelVo);
		return deptLevelVo;
	}
 }
