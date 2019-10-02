package com.jbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 1.用户和角色的对应的实体类
 * 项目名称：jbg_system 
 * 类名称：SysUserRole
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:28:54
 */
@Data
public class SysUserRole implements Serializable{
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -8848749396795276172L;

	//主键编号
    private Integer id;

    //用户ID
    private Integer userId;

    //角色ID
    private Integer roleId;

    //操作者
    private String operator;

    //操作时间
    private Date operatorTime;

    //操作者的IP地址
    private String operatorIp;
}