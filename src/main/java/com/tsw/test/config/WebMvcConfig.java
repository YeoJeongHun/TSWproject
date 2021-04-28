package com.tsw.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tsw.test.interceptor.BeforeActionInterceptor;
import com.tsw.test.interceptor.NeedToLoginInterceptor;
import com.tsw.test.interceptor.NeedToLogoutInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	// beforeActionInterceptor 인터셉터 불러오기
    @Autowired
    BeforeActionInterceptor beforeActionInterceptor;
    
    @Autowired
    NeedToLoginInterceptor needToLoginInterceptor;

    @Autowired
    NeedToLogoutInterceptor needToLogoutInterceptor;
    
    // 이 함수는 인터셉터를 적용하는 역할을 합니다.
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // beforeActionInterceptor 인터셉터가 모든 액션 실행전에 실행되도록 처리
        registry.addInterceptor(beforeActionInterceptor)
        	.addPathPatterns("/**")
        	.excludePathPatterns("/resources/**")
        	.excludePathPatterns("/error");
        
        registry.addInterceptor(needToLoginInterceptor)
        	.addPathPatterns("/mpaUsr/member/doLogout")
    		.addPathPatterns("/mpaUsr/task/taskmain")
    		.addPathPatterns("/mpaUsr/task/detail");

    	registry.addInterceptor(needToLogoutInterceptor)
    		.addPathPatterns("/mpaUsr/member/doLogin")
    		.addPathPatterns("/mpaUsr/member/LoginPage")
    		.addPathPatterns("/mpaUsr/member/doJoin")
    		.addPathPatterns("/mpaUsr/member/join");
    }
}
