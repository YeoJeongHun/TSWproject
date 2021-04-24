package com.tsw.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.tsw.test.dto.Member;
import com.tsw.test.dto.MemberForDetail;
import com.tsw.test.dto.Task;
import com.tsw.test.dto.TaskPart;
import com.tsw.test.dto.TaskReciver;

@Mapper
public interface TaskDao {

	List<Task> getTasks();

	List<TaskPart> getTaskParts();

	List<Member> getMembers();

	List<MemberForDetail> getTaskRecivers(@Param("taskId") int taskId);

	int getFinishTotalPage(@Param("taskPartId") int taskPartId, @Param("searchType")String searchType, @Param("search")String search);

	List<Task> getTasksPartSearch(@Param("taskPartId") int taskPartId, @Param("startId") int startId, @Param("searchType") String searchType, @Param("search") String search);

	List<Task> getTasksNewIng(@Param("taskPartId") int taskPartId, @Param("status") String status);

	Task getTask(@Param("taskId") int taskId);

	Member getWriter(@Param("writerId") int writerId);

	
}
