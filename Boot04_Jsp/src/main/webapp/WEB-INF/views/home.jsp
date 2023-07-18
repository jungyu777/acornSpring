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
		<h1>인덱스 페이지 입니다</h1>
			<h3>공지사항</h3>
				<li><a href="fortune">오늘의 운세보기</a></li>
				<li><a href="fortune2">오늘날씨</a></li>
			<ul>
				<c:forEach var="tmp" items="${noticeList }">
					<li>${tmp }</li>
				</c:forEach>
			</ul>
	</div>
</body>
</html>