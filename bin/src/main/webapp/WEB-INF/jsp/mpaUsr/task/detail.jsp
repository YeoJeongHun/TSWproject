<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle"
	value="<span><i class='fas fa-home'></i></span> <span>HOME</span>" />

<%@ include file="../common/head.jspf"%>


<div class="section section-article-detail">
	<div class="container mx-auto">
	    <div class="card bordered shadow-lg item-bt-1-not-last-child">
            <div class="card-title">
                <a href="javascript:history.back();" class="cursor-pointer">
                    <i class="fas fa-chevron-left"></i>
                </a>
                <span>업무</span>
            </div>
            <div class="h-auto p-1">
            	<div class="float-left w-3/4 h-full">
                    <div class="mt-4">
                        <div class="text-5xl text-center">
                            ${task.title}
                        </div>
                    </div>

                    <div class="mt-3 w-full">

                        <div class="w-3/4 float-left">
                            <span class="badge badge-accent">작성자</span>
                            <span>${writer.name}(${writer.rank})</span>
                        </div>

                        <div>
                            <span class="badge">등록날짜</span>
                            <span class="text-gray-600 text-light">${task.regDate}</span>
                        </div>
                    </div>
              	</div>
              	<div class="float-left w-1/4 min-h-auto max-h-36 overflow-auto text-center">
              		<span class="mb-1">수신자</span>
              		<table class="w-full">
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
            </div>
           	<div class="border-2 p-2">
                    <div class="mt-6">
                        <span class="badge badge-outline">본문</span>
                        <div class="mt-3">
                            <img class="rounded" src="https://i.pravatar.cc/250?img=37" alt="">
                        </div>
                        <div class="mt-3">
                            내용 : ${task.body}
                        </div>
                    </div>
            </div>

            <div>
                <h1 class="title-bar-type-2 px-4">댓글</h1>
                <div class="px-4 py-8">
                    <!-- 댓글 입력 시작 -->
                    <form class="relative flex py-4 text-gray-600 focus-within:text-gray-400">
                        <img class="w-10 h-10 object-cover rounded-full shadow mr-2 cursor-pointer" alt="User avatar" src="https://images.unsplash.com/photo-1477118476589-bff2c5c4cfbb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=crop&amp;w=200&amp;q=200">

                        <span class="absolute inset-y-0 right-0 flex items-center pr-6">
                            <button type="submit" class="p-1 focus:outline-none focus:shadow-none hover:text-blue-500">
                                <svg class="w-6 h-6 transition ease-out duration-300 hover:text-blue-500 text-gray-400" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M14.828 14.828a4 4 0 01-5.656 0M9 10h.01M15 10h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                                </svg>
                            </button>
                        </span>

                        <input type="search" class="w-full py-2 pl-4 pr-10 text-sm bg-gray-100 border border-transparent appearance-none rounded-tg placeholder-gray-400 focus:bg-white focus:outline-none focus:border-blue-500 focus:text-gray-900 focus:shadow-outline-blue" style="border-radius: 25px" placeholder="댓글을 입력해주세요." autocomplete="off">
                    </form>
                    <!-- 댓글 입력 끝 -->
                </div>
            </div>
        </div>
	</div>
</div>


	
<%@ include file="../common/foot.jspf"%>
