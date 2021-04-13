package com.tsw.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsw.test.dao.TaskDao;
import com.tsw.test.dto.Member;
import com.tsw.test.dto.Task;
import com.tsw.test.dto.TaskPart;
import com.tsw.test.dto.TaskReciver;

@Service
public class TaskService {
	@Autowired
	private TaskDao taskdao;

	public List<Task> getTasks() {
		// TODO Auto-generated method stub
		return taskdao.getTasks();
	}

	public List<TaskPart> getTaskParts() {
		// TODO Auto-generated method stub
		return taskdao.getTaskParts();
	}

	public List<Member> getMembers() {
		// TODO Auto-generated method stub
		return taskdao.getMembers();
	}

	public List<TaskReciver> getTaskRecivers() {
		// TODO Auto-generated method stub
		return taskdao.getTaskRecivers();
	}


}
