package com.jbg.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
/**
 * 1.角色的实体类
 * 项目名称：jbg_system 
 * 类名称：SysRole
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:24:57
 */
@Data
public class SysRole implements Serializable{
	
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -1964864019216861633L;

	//主键编号
    private Integer id;

    //角色名称
    private String name;

    //角色类型(1:管理员 2:其他)
    private Integer type;

    //状态(0:正常 1:冻结)
    private Integer status;

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