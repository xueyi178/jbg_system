package com.jbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
/**
 * 1.角色和权限的对应的实体类
 * 项目名称：jbg_system 
 * 类名称：SysRoleAcl
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:29:34
 */
@Data
public class SysRoleAcl implements Serializable{
    /**
	 * 序列化
	 */
	private static final long serialVersionUID = 7082825044053395360L;

	//主键编号
	private Integer id;

	//权限ID
    private Integer aclId;

    //角色ID
    private Integer roleId;

    //操作者
    private String operator;

    //操作时间
    private Date operatorTime;

    //操作者的IP地址
    private String operatorIp;
}