package com.blog.blog_s.domain;

import java.io.Serializable;

public class AttachMent implements Serializable{
	
	private static final long serialVersionUID = -7083614463516904618L;
	/** 主键编号 */
    private Integer id;
    /** 文件名称 */
    private String name;
    /** 文件类型 */
    private String type;
    /** 文件的地址 */
    private String key;
    /** 创建人的id */
    private Long sysUserId;
    /** 创建的时间 */
    private String createDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Long getSysUserId() {
		return sysUserId;
	}
	public void setSysUserId(Long sysUserId) {
		this.sysUserId = sysUserId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
    
    

}
