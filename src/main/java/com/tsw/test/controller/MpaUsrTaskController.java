package com.tsw.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsw.test.dto.Member;
import com.tsw.test.dto.Task;
import com.tsw.test.dto.TaskPart;
import com.tsw.test.dto.TaskReciver;
import com.tsw.test.service.TaskService;

@Controller
public class MpaUsrTaskController {
	@Autowired
	private TaskService taskservice;
	
	@RequestMapping("/")
	public String test(HttpServletRequest req) {
		List<Task> tasks = taskservice.getTasks();
		List<TaskPart> taskParts = taskservice.getTaskParts();
		List<Member> members = taskservice.getMembers();
		List<TaskReciver> taskrecivers = taskservice.getTaskRecivers();
		
		req.setAttribute("tasks", tasks);
		req.setAttribute("taskParts", taskParts);
		req.setAttribute("members", members);
		req.setAttribute("taskrecivers", taskrecivers);
		
		return "mpaUsr/main";
	}
	
	@RequestMapping("/mpaUsr/task/taskmain")
	public String taskmain(HttpServletRequest req, int taskPartId) {
		List<Task> tasks = taskservice.getTasksPart(taskPartId);
		req.setAttribute("tasks", tasks);
		
		return "mpaUsr/task/taskmain";
	}
}
