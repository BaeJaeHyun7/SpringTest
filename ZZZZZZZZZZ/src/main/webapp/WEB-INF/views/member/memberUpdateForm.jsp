<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>[ 회원 정보 수정 ]</h1>
	<form action="/member/update" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="member_id" value="${member.member_id }" readonly="readonly"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="member_pw"></td>
			</tr>
			<tr>
				<th>비밀번호 확인</th>
				<td><input type="password" name="member_pw_check"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="member_nm" value="${member.member_nm }"></td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td><input type="text" name="member_birth" placeholder="ex:19900316"></td>
			</tr>		
		</table>
		
		<input type="submit" value="수정완료">
</form>

</body>
</html>