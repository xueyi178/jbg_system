package com.jbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
/**
 * 1.用户表的实体类
 * 项目名称：jbg_system 
 * 类名称：SysUser
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午3:26:37
 */
@Data
public class SysUser implements Serializable{
    /**
	 * 序列化
	 */
	private static final long serialVersionUID = -5020953683813505907L;

	//主键编号
	private Integer id;

	//用户姓名
    private String username;

    //手机号码
    private String phone;

    //手机邮箱
    private String mail;

    //密码
    private String password;

    //部门ID
    private Integer deptId;

    //用户状态(0 正常 1 冻结 2 退出)
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