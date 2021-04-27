<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="JoinFormCSS.jspf" %>
<%@ include file="../common/head.jspf"%>

<body width="100%" height="100%">
    <form action="doJoin" method="post" class="loginForm">
      <h2>SIGN UP</h2>
      <div class="idForm">
      	<div class="idtext float-left">ID</div>
		<div style="width: 60%;" class="border-b-2 border-gray-300 float-left"><input type="text" style="width: 100%;" class="id" name="id"></div>
      </div>
      <div class="idForm">
      	<div class="idtext float-left">PASSWORD</div>
		<div style="width: 60%;" class="border-b-2 border-gray-300 float-left"><input type="text" style="width: 100%;" class="id" name="pw"></div>
      </div>
      <div class="idForm">
      	<div class="idtext float-left">CHECK PW</div>
		<div style="width: 60%;" class="border-b-2 border-gray-300 float-left"><input type="text" style="width: 100%;" class="id" name="cpw"></div>
      </div>
      <div class="idForm">
      	<div class="idtext float-left">NAME</div>
		<div style="width: 60%;" class="border-b-2 border-gray-300 float-left"><input type="text" style="width: 100%;" class="id" name="name"></div>
      </div>
      <div class="idForm">
      	<div class="idtext float-left">RANK</div>
		<div style="width: 60%;" class="border-b-2 border-gray-300 float-left"><input type="text" style="width: 100%;" class="id" name="rank"></div>
      </div>
      <div class="idForm">
      	<div class="idtext float-left">DEPARTMENT</div>
		<div style="width: 60%;" class="border-b-2 border-gray-300 float-left">
			<select style="width: 100%;" name="department">
      			<option value="2" value="1"></option>
      			<option value="2" value="2">SALES</option>
      			<option value="3" value="3">TELEMARKETING</option>
      			<option value="4" value="4">TECHNOLOGY</option>
      			<option value="5" value="5">SUPPORT</option>
      			<option value="6" value="6">DEVELOPMENT</option>
      		</select>
		</div>
      </div>
      <div class="idForm">
      	<div class="idtext float-left">성별</div>
		<div style="width: 10%;" class="float-left"><input type="radio" style="width: 100%;" class="id" name="gender" value="1"/></div><div style="width: 20%;" class="float-left">MALE</div>
		<div style="width: 10%;" class="float-left"><input type="radio" style="width: 100%;" class="id" name="gender" value="0"></div><div style="width: 20%;" class="float-left">FEMALE</div>
      </div>
      <div class="idForm">
      	<div class="idtext float-left">BIRTH</div>
		<div style="width: 60%;" class="float-left pt-1">
			<select style="width: 30%;" name="birthYear">
      			<c:forEach var="year" begin="1945" end="2002">
      				<option value="${year}">${year}</option>
      			</c:forEach>
      		</select>
      		<select style="width: 30%;" name="birthMonth">
      			<c:forEach var="month" begin="1" end="12">
      				<option value="${month}">${month}</option>
      			</c:forEach>
      		</select>
     		<select style="width: 30%;" name="birthDay">
      			<c:forEach var="day" begin="1" end="31">
      				<option value="${day}">${day}</option>
      			</c:forEach>
      		</select>
		</div>
      </div>
      <div class="idForm">
      	<div class="idtext float-left">ENTERED</div>
		<div style="width: 60%;" class="float-left pt-1">
			<select style="width: 30%;" name="enterYear">
      			<c:forEach var="year" begin="1945" end="2002">
      				<option value="${year}">${year}</option>
      			</c:forEach>
      		</select>
      		<select style="width: 30%;" name="enterMonth">
      			<c:forEach var="month" begin="1" end="12">
      				<option value="${month}">${month}</option>
      			</c:forEach>
      		</select>
     		<select style="width: 30%;" name="enterDay">
      			<c:forEach var="day" begin="1" end="31">
      				<option value="${day}">${day}</option>
      			</c:forEach>
      		</select>
		</div>
      </div>
      
      <br/><br/>
      
      <button type="submit" class="btn" onclick="button()">
        JOIN
      </button>
      <script>
      	let button = () => {
        	alert('Welcome to TSW !')
        }
      </script>
    </form>
    <br/>
  </body>


	
	
<%@ include file="../common/foot.jspf"%>