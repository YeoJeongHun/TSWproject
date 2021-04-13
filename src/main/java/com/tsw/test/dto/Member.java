package com.tsw.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
	private int id;
	private String name;
	private String loginId;
	private String loginPw;
	private int departmentId;
	private String rank;
	private boolean gender;
	private String birthDate;
	private String workStartDate;
	private String workFinishDate;
}
