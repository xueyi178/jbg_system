package com.jbg.mapper;

import com.jbg.entity.SysUserRole;
/**
 * 1.用户和角色的数据访问层接口
 * 项目名称：jbg_system 
 * 类名称：SysUserRoleMapper
 * 开发者：Lenovo
 * 开发时间：2019年10月2日上午10:57:26
 */
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}