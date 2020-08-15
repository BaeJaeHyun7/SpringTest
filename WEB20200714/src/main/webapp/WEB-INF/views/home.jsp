<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
		
		<%-- <c:set var="id" value="test" scope="session"></c:set>
		${id }
		
		<c:remove var="id"/><br>
		${id } !!!
		
		
		<br>
		
		<c:if test="${3<5 }">
			3은 5보다 작다.		
		</c:if>
		
		
		
		<br> --%>
		
		<c:if test="${not empty str }">
		<p>${str }님 환영합니다.</p>		
		</c:if>
		
		<c:choose>
			<c:when test="${num < 10 }">
				${num }은 10보다 작다.
			
			</c:when>
			<c:otherwise>
				${num }은 10보다 크다.
			
			</c:otherwise>
		
		
		</c:choose>
		<br>
		
		
		<table border="1">
			
			<tr>
				<th>이름</th>
			</tr>
			<c:forEach var="s" items="${list }">
			<tr>
				<td>${s }</td>
			</tr>
			</c:forEach>		
		
		</table>
		
		<table border="1">
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>나이</th>		
			</tr>
			<c:forEach var="vo" items="${list2 }" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td>${vo.id }</td>
					<td>${vo.pw }</td>
					<td>${vo.age }</td>			
				</tr>			
			</c:forEach>				
		</table>
		
		<c:forEach var="i" begin="0" end="5" step="1">
			${i } <br>		
		</c:forEach>
		
		<table border="1">
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>나이</th>		
			</tr>
			<c:forEach var="i" begin="0" end="${list2.size() - 1  }">
				<tr>
					<td>${i+1 }</td>
					<td>${list2[i].id }</td>
					<td>${list2[i].pw }</td>
					<td>${list2[i].age }</td>			
				</tr>			
			</c:forEach>				
		</table>
		
		
		
		<img alt="고양이" src="<c:url value="/resources/images/cat.jpg" />">
		
		<c:set var="str3" value = "<marquee>test</marquee>"/>
		
		${str3 }<br>
		<c:out value="${str3 }"/>
		
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



</body>
</html>
