<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle"
	value="<span><i class='fas fa-home'></i></span> <span>HOME</span>" />

<%@ include file="../common/head.jspf"%>

<br/>

${task}
<br/>
<br/>
<br/>
${taskReciver}


<div>
	제목 : ${task.title}<br/>
	작성자 : ${writer.name}(${writer.rank})<br/>
	작성일 : ${task.regDate}
</div>
<div>
	<table>
		<caption>수신자 목록 표현</caption>
		<tr>
			<th>
				부서명
			</th>
			<th>
				이름
			</th>
		</tr>
		
		<c:forEach items="${taskRecivers}" var="taskReciver">
			<tr>
				<td>${taskReciver.department}</td>
				<td>${taskReciver.name}</td>
			</tr>
		</c:forEach>
	</table>
</div>
<div>
	내용 : ${task.body}
</div>
<div>
	답글 칸 만들어줘야됨 아직 틀 없어! ㅜㅜ
</div>

	
<%@ include file="../common/foot.jspf"%>
