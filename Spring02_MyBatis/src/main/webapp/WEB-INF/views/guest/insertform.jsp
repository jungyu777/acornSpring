<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>회원추가폼입니다</h1>
		<form action="${pageContext.request.contextPath }/guest/insert" method="post">
			<div>
				<label for="writer">작성자</label>
				<input type="text" name="writer" id="writer" />
			</div>
			
			<div>
				<label for="content">내용</label>
				<input type="text" name="content" id="content" />
			</div>
			<div>
				<label for="pwd">비번</label>
				<input type="password" name="pwd" id="pwd" />
			</div>
			
			<button type="submit">등록</button>
		</form>
	</div>
</body>
</html>