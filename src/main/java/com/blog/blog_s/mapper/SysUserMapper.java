package com.blog.blog_s.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sun.blog.domain.SysUser;

@Mapper
public interface SysUserMapper {
	
	/**
	 * 根据用户名查询用户
	 * @return
	 */
	public SysUser findByUserName(@Param("userName") String userName);

}
