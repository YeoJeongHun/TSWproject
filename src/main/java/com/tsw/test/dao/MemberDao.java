package com.tsw.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.tsw.test.dto.Member;
import com.tsw.test.dto.MemberForDetail;
import com.tsw.test.dto.Task;
import com.tsw.test.dto.TaskPart;
import com.tsw.test.dto.TaskReciver;

@Mapper
public interface MemberDao {

	void doJoin(@Param("id") String id, @Param("pw") String pw, @Param("name") String name, @Param("rank") String rank, @Param("department") int department,
			@Param("gender") int gender, @Param("birth") String birth, @Param("enterDate") String enterDate);

	Member getMemberById(@Param("loginId") String loginId);

	
	
}
