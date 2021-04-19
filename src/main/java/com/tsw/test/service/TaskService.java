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

	public List<Task> getTasksPart(int taskPartId, String status, int page, String searchType, String search) {
		int startId = page*5-5;
		
		//new, ing의 경우
		if(status.equals("new")||status.equals("ing")) {
			return taskdao.getTasksNewIng(taskPartId, status);
		}
		//finish의 경우
		else if(status.equals("finish")) {
			return taskdao.getTasksPartSearch(taskPartId, startId, searchType, search);
		}
		return null;
	}

	public int getFinishTotalPage(int taskPartId) {
		return (int) Math.ceil(taskdao.getFinishTotalPage(taskPartId)/5.0);
	}

}





















