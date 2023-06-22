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
		<h1>회원 목록입니다.</h1>
		<a href="${pageContext.request.contextPath }/member/insertform">회원추가</a>
		
		
	
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>주소</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tmp" items="${list }">
					<tr>
						<td>${tmp.num }</td>
						<td>${tmp.name }</td>
						<td>${tmp.addr }</td>
						<td><a href="${pageContext.request.contextPath }/member/delete?num=${tmp.num}">삭제하기</a></td>
						<td><a href="${pageContext.request.contextPath }/member/updateform?num=${tmp.num}">수정하기</a></td>
						
						
						
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>