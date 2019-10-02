package com.jbg.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
/**
 * 1.权限模块的实体类
 * 项目名称：jbg_system 
 * 类名称：SysAclModule
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:20:23
 */
@Data
public class SysAclModule implements Serializable{
    /**
	 * 序列化
	 */
	private static final long serialVersionUID = -222259574255120051L;

	//主键编号
	private Integer id;

	//权限模块名称
    private String name;

    //父ID
    private Integer parentId;

    //状态(0:正常 1:冻结)
    private Integer status;

    //权限模块层级
    private String level;

    //创建用户ID
    private Integer createUserId;

    //权限模块在当前层级的顺序
    private Integer seq;

  //备注
    private String remark;

    //操作者
    private String operator;

    //操作时间
    private Date operatorTime;

    //操作者的ip地址
    private String operatorIp;

    //创建时间
    private Date createTime;

    //修改时间
    private Date updateTime;

    //是否删除[0 未删除 1 删除]
    private Integer isDelete;
}