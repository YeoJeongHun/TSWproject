package com.tsw.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MpaUsrMemberController {

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
			String name, String rank, String gender,
			int birthYear, int birthMonth, int birthDay,
			int enterYear, int enterMonth, int enterDay) {

		return "mpaUsr/member/LoginPage";
	}

}
