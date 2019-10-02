package com.jbg.mapper;

import com.jbg.entity.SysAcl;
/**
 * 1. 权限的数据访问层接口
 * 项目名称：jbg_system 
 * 类名称：SysAclMapper
 * 开发者：Lenovo
 * 开发时间：2019年10月2日上午10:55:15
 */
public interface SysAclMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAcl record);

    int insertSelective(SysAcl record);

    SysAcl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAcl record);

    int updateByPrimaryKey(SysAcl record);
}