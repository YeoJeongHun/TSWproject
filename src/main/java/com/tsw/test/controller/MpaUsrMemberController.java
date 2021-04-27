package com.tsw.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsw.test.service.MemberService;

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

}
