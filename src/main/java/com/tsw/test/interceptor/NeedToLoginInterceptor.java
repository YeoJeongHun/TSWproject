package com.tsw.test.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.tsw.test.service.MemberService;
import com.tsw.test.util.Util;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class NeedToLoginInterceptor implements HandlerInterceptor{
	@Autowired
    private MemberService memberService;

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
    	if(req.getAttribute("loginedMember")==null) {
    		res.setContentType("text/html; charset=UTF-8");
            res.getWriter().append(Util.msgAndBack("로그인 후 이용해주세요."));
            return false;
    	}
    	
        return HandlerInterceptor.super.preHandle(req, res, handler);
    }
}
