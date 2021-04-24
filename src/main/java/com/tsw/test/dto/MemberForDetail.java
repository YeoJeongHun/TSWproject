package com.tsw.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberForDetail {
	private int id;
	private String name;
	private String rank;
	private int departmentId;
	private String department;
}
