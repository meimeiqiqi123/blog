package com.blog.blog_s.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sun.blog.service.impl.SysUserServiceImpl;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	UserDetailsService userDetailService(){
		return new SysUserServiceImpl();
	}

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin/css/**", "/admin/js/**","/admin/images/**", "/admin/webjars/**", "**/favicon.ico", "**/wx/**").permitAll().
		anyRequest().authenticated().and().formLogin().loginPage("/login")
		.successForwardUrl("/admin/index")
		.failureUrl("/login?error").permitAll()
		.and().rememberMe().tokenValiditySeconds(1209600)//code4
		.and().logout().permitAll();
		
	}

	@Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService()).passwordEncoder(new BCryptPasswordEncoder());
    }

	public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        //加密"0"
        String encode = bCryptPasswordEncoder.encode("123456");
        System.out.println(encode);
    }

}
