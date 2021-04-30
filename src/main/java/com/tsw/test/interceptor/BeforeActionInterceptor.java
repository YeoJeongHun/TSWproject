package com.tsw.test.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.tsw.test.dto.Member;
import com.tsw.test.service.MemberService;
import com.tsw.test.util.Util;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BeforeActionInterceptor implements HandlerInterceptor{
	@Autowired
    private MemberService memberService;

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
    	//로그인 한 멤버 관리
    	HttpSession session = req.getSession();
    	Member loginedMember = (Member)session.getAttribute("loginedMember");
    	req.setAttribute("loginedMember", loginedMember);
    	
    	//현재 자신의 주소 관리(로그인 시도 용도)
    	req.setAttribute("makeAfterURI", Util.makeFullUriAndEncoded(req));
    	req.setAttribute("redirectAfterLogin", Util.querySplit(req));
    	
        return HandlerInterceptor.super.preHandle(req, res, handler);
    }
}
