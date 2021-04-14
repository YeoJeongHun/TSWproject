package com.tsw.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
	private int id;
	private String title;
	private String body;
	private String regDate;
	private String updateDate;
	private boolean delStatus;
	private String delDate;
	private boolean blindStatus;
	private String blindDate;
	private int writerId;
	private int reciverId;
}
