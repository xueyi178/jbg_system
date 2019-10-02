package com.jbg.mapper;

import com.jbg.entity.SysRoleAcl;
/**
 * 1.角色和权限的数据访问层接口
 * 项目名称：jbg_system 
 * 类名称：SysRoleAclMapper
 * 开发者：Lenovo
 * 开发时间：2019年10月2日上午10:56:31
 */
public interface SysRoleAclMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleAcl record);

    int insertSelective(SysRoleAcl record);

    SysRoleAcl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleAcl record);

    int updateByPrimaryKey(SysRoleAcl record);
}