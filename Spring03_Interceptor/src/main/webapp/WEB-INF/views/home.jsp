<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/home.jsp</title>
</head>
<body>
	<script>
		/*
		필터	Tomcat Server   Filter => servlet  or jsp
	  인터셉터	Tomcat Server   Dispatcher Servlet => Controller => jsp => response
	  		인터셉터는 어디든 끼어들수있다 응답한 이후 컨트롤로 가기직전 컨트롤러가 응답한 이후 jsp가 응답한 이후
	  		
	  		필터는  요청이 가기전에 개입을 하는것이고 
	  		
	  		@AUtoWired 로 빈을 주입받는데
		*/
	</script>
	
	<div class="container">
		<c:if test="${ not empty sessionScope.id }">
         <p>
            <a href="${pageContext.request.contextPath }/users/info">${id }</a> 님 로그인중...
            <a href="${pageContext.request.contextPath }/users/logout">로그아웃</a>
         </p>
      </c:if>
		<h1>인덱스 페이지 입니다.</h1>
		<ul>
			<li><a href="${pageContext.request.contextPath }/play">놀러가기</a></li>
			<li><a href="${pageContext.request.contextPath }/users/loginform">로그인</a></li>
			<li><a href="${pageContext.request.contextPath }/users/logout">로그아웃</a></li>
			<li><a href="${pageContext.request.contextPath }/users/info">ㅗㅗ</a></li>
			<li><a href="${pageContext.request.contextPath }/file/insertform">파일 업로드 테스트</a></li>
		</ul>
		<h2>공지사항</h2>
		<ul>
			<c:forEach var="tmp" items="${requestScope.noticeList }">
				<li>${tmp }</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>










