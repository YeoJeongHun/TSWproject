<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle"
	value="<span><i class='fas fa-home'></i></span> <span>HOME</span>" />

<%@ include file="common/head.jspf"%>
	test
	<hr/>
	${tasks}
	<hr/>
	${taskParts}
	<hr/>
	${members}
	<hr/>
	${taskrecivers}
	
	
<%@ include file="common/foot.jspf"%>
