package com.jbg.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 1.权限的实体类
 * 项目名称：jbg_system 
 * 类名称：SysAcl
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:15:10
 */
@Data
public class SysAcl implements Serializable{
    /**
	 * 序列化
	 */
	private static final long serialVersionUID = 686788516440924113L;

	//主键编号
	private Integer id;

	//权限码
    private String code;

    //权限名称
    private String name;

    //权限所在的权限模块id
    private Integer aclModuleId;

    //请求的url
    private String url;

    //类型(1 菜单 2 按钮 3 其他)
    private Integer type;

    //状态(0 正常 1 冻结)
    private Integer status;

    //创建用户ID
    private Integer createUserId;

    //权限在当前模块下的顺序(由小到大)
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