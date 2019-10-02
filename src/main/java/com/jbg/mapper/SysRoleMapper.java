package com.jbg.mapper;

import com.jbg.entity.SysRole;
/**
 * 1.角色的数据访问层接口
 * 项目名称：jbg_system 
 * 类名称：SysRoleMapper
 * 开发者：Lenovo
 * 开发时间：2019年10月2日上午10:56:52
 */
public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}