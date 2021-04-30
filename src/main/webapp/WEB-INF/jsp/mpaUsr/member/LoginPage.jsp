<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="LoginFormCSS.jspf" %>
<%@ include file="../common/head.jspf"%>

<body width="100%" height="100%">
    <form action="doLogin" method="post" class="loginForm">
      <input type="hidden" name="redirectAfterLogin" value="${redirectAfterLogin}">
      <h2>Login test=${afterLoginUrl}aaaa${redirectAfterLogin}</h2>
      <div class="idForm">
        <input type="text" class="id" placeholder="ID" name="loginId">
      </div>
      <div class="passForm">
        <input type="password" class="pw" placeholder="PW" name="loginPw">
      </div>
      <button type="submit" class="btn">
        LOG IN
      </button>
      <div class="bottomText">
        Don't you have ID? <a href="join">sign up</a>
      </div>
    </form>
  </body>



	
	
<%@ include file="../common/foot.jspf"%>