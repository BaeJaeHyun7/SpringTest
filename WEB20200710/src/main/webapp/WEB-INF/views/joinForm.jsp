<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check(){
		var id = document.getElementById('id').value;
		var pw = document.getElementById('pw').value;
		
		var phone1 = document.getElementById('phone1').value;
		var phone2 = document.getElementById('phone2').value;
		var phone3 = document.getElementById('phone3').value;
		var phone = phone1+"-"+phone2+"-"+phone3;
		var phone4 = phone1+phone2+phone3;
		document.getElementById("phone").value = phone;

	
		
		if(id == ""){
			alert("ID는 반드시 입력해야 합니다.");
			return false;
		}else if(id.length < 4 || id.length > 12){
			alert("ID는 4~12글자로 입력해 주세요.");
			return false;
		}
		
		if(pw == ""){
			alert("비밀번호는 반드시 입력해야 합니다.");
			return false;
		}else if(pw.length < 4 || pw.length > 12){
			alert("비밀번호는 4~12글자로 입력해 주세요.");
			return false;
		}
		
		if(phone1 == "" || phone2 == "" || phone3 == ""){
			alert("전화번호는 반드시 입력해야 합니다.");
			return false;	
		}

		for(var i=0; i<phone4.length; i++){
			if(isNaN(phone4.charAt(i))){
				alert("숫자만 입력하세요");
				return false;
				
			}
		}
			
		
		
		return true;

	}
	
</script>
</head>
<body>
	<form action="/join" method="post" onsubmit="return check();">
		<h1>[ 회원 가입 폼 ]</h1>
		ID : <input type="text" id="id" name="id"> <br>
		PW : <input type="password" id="pw" name="pw"> <br>
		Phone <input type="text" id="phone1"> - <input type="text" id="phone2"> - <input type="text" id="phone3"> <br>
		<input type="hidden" id="phone" name="phone">
		<input type="submit" value="가입">
	</form>
	
</body>
</html>