package com.tsw.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsw.test.dto.Member;
import com.tsw.test.service.MemberService;
import com.tsw.test.util.Util;

@Controller
public class MpaUsrMemberController {
	@Autowired
	private MemberService memberservice;

	@RequestMapping("/mpaUsr/member/LoginPage")
	public String loginPage(HttpServletRequest req) {

		return "mpaUsr/member/LoginPage";
	}
	
	@RequestMapping("/mpaUsr/member/join")
	public String join(HttpServletRequest req) {

		return "mpaUsr/member/join";
	}

	@RequestMapping("/mpaUsr/member/doJoin")
	public String doJoin(HttpServletRequest req, String id, String pw, String cpw,
			String name, String rank, int department, int gender,
			int birthYear, int birthMonth, int birthDay,
			int enterYear, int enterMonth, int enterDay) {
		
		String birth = Integer.toString(birthYear)+"-"+Integer.toString(birthMonth)+"-"+Integer.toString(birthDay);
		String enterDate = Integer.toString(enterYear)+"-"+Integer.toString(enterMonth)+"-"+Integer.toString(enterDay);
		memberservice.doJoin(id, pw, name, rank, department, gender, birth, enterDate);
		
		return "mpaUsr/member/LoginPage";
	}
	
	@RequestMapping("/mpaUsr/member/doLogin")
	public String doLogin(HttpServletRequest req, HttpSession session, String loginId, String loginPw) {
		if(loginId.trim().equals("")) {
			return Util.msgAndBack(req, "아이디를 입력해주세요.");
		}
		if(loginPw.trim().equals("")) {
			return Util.msgAndBack(req, "비밀번호를 입력해주세요.");
		}
		
		Member loginedMember = memberservice.getMemberById(loginId);
		
		if(loginedMember==null) {
			return Util.msgAndBack(req, "존재하지 않는 아이디입니다.");
		}
		if(!loginedMember.getLoginPw().equals(loginPw)) {
			return Util.msgAndBack(req, "회원정보가 일치하지 않습니다.");
		}
		
		session.setAttribute("loginedMember",loginedMember);
		
		return Util.msgAndReplace(req,"환영합니다."+loginedMember.getName()+"님","/");
	}
	
	@RequestMapping("/mpaUsr/member/doLogout")
	public String doLogout(HttpServletRequest req, HttpSession session) {
		session.removeAttribute("loginedMember");
		
		return Util.msgAndReplace(req,"로그아웃 되었습니다.","/");
	}
	

}










