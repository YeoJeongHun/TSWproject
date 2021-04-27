package com.tsw.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsw.test.dao.MemberDao;

@Service
public class MemberService {
	@Autowired
	private MemberDao memberdao;

	public void doJoin(String id, String pw, String name, String rank, int department, int gender, String birth,
			String enterDate) {
		memberdao.doJoin(id, pw, name, rank, department, gender, birth, enterDate);
		
	}

	

}





















