package com.jbg.mapper;

import com.jbg.entity.SysUser;
/**
 * 1.用户的数据访问层接口
 * 项目名称：jbg_system 
 * 类名称：SysUserMapper
 * 开发者：Lenovo
 * 开发时间：2019年10月2日上午10:57:08
 */
public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}