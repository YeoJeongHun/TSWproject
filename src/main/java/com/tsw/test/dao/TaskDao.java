package com.tsw.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.tsw.test.dto.Member;
import com.tsw.test.dto.Task;
import com.tsw.test.dto.TaskPart;
import com.tsw.test.dto.TaskReciver;

@Mapper
public interface TaskDao {

	List<Task> getTasks();

	List<TaskPart> getTaskParts();

	List<Member> getMembers();

	List<TaskReciver> getTaskRecivers();

	List<Task> getTasksPart(@Param("taskPartId") int taskPartId);

	
}
