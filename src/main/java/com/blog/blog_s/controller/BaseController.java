package com.blog.blog_s.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;

import com.sun.blog.domain.SysUser;

/**
 *
 * Created by wenjie
 */
public abstract class BaseController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
    public BaseController title(HttpServletRequest request, String title) {
        request.setAttribute("title", title);
        return this;
    }

    /**
     * 获取当前登录用户信息
     * @param request
     * @return
     */
    public SysUser getCurrentUser() {
        return (SysUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    /**
     * 数组转字符串
     *
     * @param arr
     * @return
     */
    public String join(String[] arr) {
        StringBuilder ret = new StringBuilder();
        String[] var3 = arr;
        int var4 = arr.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            String item = var3[var5];
            ret.append(',').append(item);
        }

        return ret.length() > 0 ? ret.substring(1) : ret.toString();
    }
}
