package com.tsw.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String taskmain(HttpServletRequest req, int taskPartId, @RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "") String searchType, @RequestParam(defaultValue = "") String search) {
		List<Task> newtasks = taskservice.getTasksPart(taskPartId, "new", page, searchType, search);
		List<Task> ingtasks = taskservice.getTasksPart(taskPartId, "ing", page, searchType, search);
		List<Task> finishtasks = taskservice.getTasksPart(taskPartId, "finish", page, searchType, search);
		req.setAttribute("newtasks", newtasks);
		req.setAttribute("ingtasks", ingtasks);
		req.setAttribute("finishtasks", finishtasks);

		req.setAttribute("searchType", searchType);
		req.setAttribute("search", search);
		
		int finishTotalPage = taskservice.getFinishTotalPage(taskPartId, searchType, search);
		req.setAttribute("finishTotalPage", finishTotalPage);
		
		return "mpaUsr/task/taskmain";
	}
}














