<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>





<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Step02 _홈 페이지 입니다.</h1>
			<ul>
				<li><a href="${pageContext.request.contextPath }/resources/images/kim1.png">사진보기</a></li>
				<li><a href="${pageContext.request.contextPath }/guest/list">방명록보기</a></li>
			</ul>
		<h2>공지사항</h2>
		<ul>
			<li><a href="${pageContext.request.contextPath }/member/list">목록보기</a></li>
		</ul>
		<ul>
			<c:forEach var="tmp" items="${requestScope.noticeList }">
				<li>${tmp }</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>