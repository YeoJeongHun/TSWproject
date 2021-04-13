package com.tsw.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskReciver {
	private int id;
	private int taskNum;
	private int reciverId;
}
