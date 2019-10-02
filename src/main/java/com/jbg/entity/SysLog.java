package com.jbg.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 1.权限日志的实体类
 * 项目名称：jbg_system 
 * 类名称：SysLog
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:23:48
 */
@Data
public class SysLog implements Serializable{
    /**
	 * 序列化
	 */
	private static final long serialVersionUID = -8539825951089948662L;

	//主键编号
	private Integer id;

	//权限更新的类型(1 部门 2 用户 3 权限模块 4 权限 5 角色 6 用户和角色关系 7 角色和权限的关系)
    private Integer type;
    
    //基于type后指定的对象ID,比如用户、权限、角色等表的主键
    private Integer targetId;

    //当前是否复原过(0:没有 1：复原过)
    private Integer status;

    //旧值
    private String oldValue;

    //新值
    private String newValue;

    //操作者
    private String operator;

    //操作时间
    private Date operatorTime;

    //操作者的ip地址
    private String operatorIp;
}