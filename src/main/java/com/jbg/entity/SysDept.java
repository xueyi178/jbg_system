package com.jbg.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
/**
 * 1.部门的实体类
 * 项目名称：jbg_system 
 * 类名称：SysDept
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:21:56
 */
@Data
public class SysDept implements Serializable{
	
    /**
	 * 序列化
	 */
	private static final long serialVersionUID = 3844449000620419351L;

	//主键编号
	private Integer id;

	//部门名称
    private String name;

    //父ID
    private Integer parentId;

    //部门层级
    private String level;

    //创建用户ID
    private Integer createUserId;

    //部门在当前层级的顺序(有小到大)
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