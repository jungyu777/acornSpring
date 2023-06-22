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
		<h1>수정할 회원</h1>
		<form action="update" method="post">
			<div>
				<label for="num">번호</label>
				<input type="text" name="num" value="${dto.num }"  readonly/>
			</div>
			<div>
				<label for="writer">이름</label>
				<input type="text" name="writer" id="writer"  value="${dto.writer }"/>
			</div>
			
			<div>
				<label for="content">내용</label>
				<input type="text" name="content" id="content" value="${dto.content }"/>
			</div>
			
			<div>
				<label for="pwd">글 작성했던 비번</label>
				<input type="password" name="pwd" id="pwd"  value="${dto.pwd }"/>
			</div>
			<button type="submit">수정</button>
			<button type="reset">취소</button>
		</form>
	
	</div>
</body>
</html>