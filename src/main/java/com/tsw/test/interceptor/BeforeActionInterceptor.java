package com.tsw.test.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.tsw.test.dto.Member;
import com.tsw.test.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BeforeActionInterceptor implements HandlerInterceptor{
	@Autowired
    private MemberService memberService;

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
    	HttpSession session = req.getSession();
    	
    	Member loginedMember = (Member)session.getAttribute("loginedMember");
    	req.setAttribute("loginedMember", loginedMember);
    	
        return HandlerInterceptor.super.preHandle(req, res, handler);
    }
}
