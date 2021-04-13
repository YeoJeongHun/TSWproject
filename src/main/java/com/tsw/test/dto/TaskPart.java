package com.tsw.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskPart {
	private int id;
	private String department;
	private int memberCount;
	private int leaderId;
}
