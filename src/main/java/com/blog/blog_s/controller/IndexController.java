package com.blog.blog_s.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class IndexController extends BaseController{


    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String index(HttpServletRequest request){
        logger.info("Enter admin index method");
        return "admin/index";
    }

    




}
