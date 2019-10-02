package com.jbg.mapper;

import com.jbg.entity.SysLog;
/**
 * 1.日志的数据访问层接口
 * 项目名称：jbg_system 
 * 类名称：SysLogMapper
 * 开发者：Lenovo
 * 开发时间：2019年10月2日上午10:56:12
 */
public interface SysLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}