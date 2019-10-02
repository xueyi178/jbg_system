package com.jbg.mapper;

import java.util.List;

import com.jbg.entity.SysDept;
/**
 * 1.部门的数据访问层接口
 * 项目名称：jbg_system 
 * 类名称：SysDeptMapper
 * 开发者：Lenovo
 * 开发时间：2019年10月2日上午10:55:47
 */
public interface SysDeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);
    
    /**
     * 获取部门信息
     * @return
     */
    List<SysDept> getAllDept();
 }