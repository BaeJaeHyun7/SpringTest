<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 정보 ]</title>



</head>
<body>

	<c:choose>
		<c:when test = "${not empty list }">
			<table>
					<tr>
						<th>번호</th>
						<th>아이디</th>
						<th>이름</th>
						<th>삭제</th>
					</tr>
					<c:forEach items = "${list }" var = "vo" varStatus="status">
						<tr>
							<td>${status.count }</td>
							<td>${vo.id }</td>
							<td>${vo.name }</td>
							<td>
								<a href="/member/delete?id=${vo.id }">삭제</a>
							</td>
						</tr>
					</c:forEach>					
			</table>		
		</c:when>	
	</c:choose>


	<a href="/">메인으로</a>




</body>
</html>