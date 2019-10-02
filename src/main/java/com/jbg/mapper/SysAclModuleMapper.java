package com.jbg.mapper;

import com.jbg.entity.SysAclModule;
/**
 * 1.权限模块的数据访问层接口
 * 项目名称：jbg_system 
 * 类名称：SysAclModuleMapper
 * 开发者：Lenovo
 * 开发时间：2019年10月2日上午10:55:35
 */
public interface SysAclModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAclModule record);

    int insertSelective(SysAclModule record);

    SysAclModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAclModule record);

    int updateByPrimaryKey(SysAclModule record);
}