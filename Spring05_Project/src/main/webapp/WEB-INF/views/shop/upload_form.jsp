<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/shop/upload_form.jsp</title>
</head>
<body>
   <div class="container">
      <h1>이미지 업로드 폼</h1>
         <form action="${pageContext.request.contextPath}/shop/upload" method="post" 
                        enctype="multipart/form-data">
            <div>
               <label for="name">이름</label>
               <input type="text" name="name" id="name"/>
            </div>
            <div>
               <label for="price">가격</label>
               <input type="text" name="price" id="price"/>
            </div>
            <div>
               <label for="remainCount">재고</label>
               <input type="text" name="remainCount" id="remainCount"/>
            </div>
            <div>
               <label for="image">이미지</label>
               <input type="file" name="image" id="image"
                  accept=".jpg, .jpeg, .png, .JPG, .JPEG"/>
            </div>
            <button type="submit">업로드</button>
         </form>
         <br />
         <img src="" alt="이미지 미리보기" id="preview" />
   </div>
   <script>
      document.querySelector("#image").addEventListener("change", (e)=>{
         //선택된 파일 배열 객체를 얻어낸다.
         const files = e.target.files;
         //만일 파일 데이터가 존재한다면
         if(files.length > 0){
            //파일로 부터 데이터를 읽어들일 객체 생성
            const reader=new FileReader();
            //로딩이 완료(파일데이터를 모두 읽었을때) 되었을때 실행할 함수 등록
            reader.onload=(event)=>{
               //읽은 파일 데이터 얻어내기 
               const data=event.target.result;
               //이미지 미리보기에  data를 src 속성의 value로 넣어보세요.
               document.querySelector("#preview").setAttribute("src",data);
            };
            //파일을 DataURL 형식의 문자열로 읽어들이기
            reader.readAsDataURL(files[0]);
         }
      }); 
   </script>
</body>
</html>










