package com.blog.blog_s.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sun.blog.domain.SysUser;

public interface SysUserService extends UserDetailsService{
	
	public SysUser findByUserName(String userName);

}
