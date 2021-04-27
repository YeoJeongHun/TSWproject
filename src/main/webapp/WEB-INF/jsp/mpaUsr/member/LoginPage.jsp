<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="LoginFormCSS.jspf" %>
<%@ include file="../common/head.jspf"%>

<body width="100%" height="100%">
    <form action="doLogin" method="post" class="loginForm">
      <h2>Login</h2>
      <div class="idForm">
        <input type="text" class="id" placeholder="ID">
      </div>
      <div class="passForm">
        <input type="password" class="pw" placeholder="PW">
      </div>
      <button type="button" class="btn" onclick="button()">
        LOG IN
      </button>
      <script>
      	let button = () => {
        	alert('login Button !')
        }
      </script>
      <div class="bottomText">
        Don't you have ID? <a href="join">sign up</a>
      </div>
    </form>
  </body>



	
	
<%@ include file="../common/foot.jspf"%>