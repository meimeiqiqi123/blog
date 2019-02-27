package com.blog.blog_s.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sun.blog.domain.SysUser;
import com.sun.blog.mapper.SysUserMapper;
import com.sun.blog.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		SysUser sysUser = sysUserMapper.findByUserName(userName);
		if(null == sysUser){
			throw new UsernameNotFoundException("用户不存在");
		}
		
		return sysUser;
	}

	@Override
	public SysUser findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
