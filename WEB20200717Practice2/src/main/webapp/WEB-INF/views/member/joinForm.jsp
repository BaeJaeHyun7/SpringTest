<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 가입 폼 ]</title>
<script type="text/javascript">

	function check(){
		
		var id = document.getElementById('id').value;
		var pw = document.getElementById('pw').value;
		var pw_check = document.getElementById('pw_check').value;
		var name = document.getElementById('name').value;
		var hobby = document.getElementsByName('hobby');
		
		if(id == "" || id.length == 0){
			alert("아이디를 입력하세요.");
			return false;
			}else if(id.length < 4 || id.length > 10){
				alert("아이디는 4글자이상 10글자 이하로 입력하세요.");
				return false;
				}

		if(pw == "" || pw.length == 0){
			alert("비밀번호를 입력하세요.");
			return false;
			}else if(pw.length < 6 || pw.length > 12){
				alert("비밀번호는 6글자이상 12글자 이하로 입력하세요.");
				return false;
				}

		if(name == "" || name.length == 0){
			alert("이름을 입력해 주세요.");
			return false;
			}

		var cnt = 0;
		for(var i = 0; i<hobby.length; i++){
			if(hobby[i].checked){
				cnt++;			
				}			
			}
		if(cnt < 2){
			alert("취미는 2개이상 입력하세요.");
			return false;
			}

		return true;

		}
</script>


</head>
<body>
<form action="/member/join" method="post" onsubmit="return check();">

	id : <input type="text" id="id" name="id"><br>
	pw : <input type="password" id="pw" name="pw"><br>
	pw_check : <input type="password" id="pw_check"><br>
	name : <input type="text" id="name" name="name"><br>
	취미<br>
	야구 : <input type="checkbox" name="hobby" value="야구">
	축구 : <input type="checkbox" name="hobby" value="축구">
	농구 : <input type="checkbox" name="hobby" value="농구">
	배구 : <input type="checkbox" name="hobby" value="배구">
	탁구 : <input type="checkbox" name="hobby" value="탁구"><br>
	성별<br>
	남성 : <input type="radio" name="gender" value="남성">
	여성 : <input type="radio" name="gender" value="여성"><br>
	자기소개<br>
	<textarea rows="5" cols="50"></textarea><br>
	<input type="submit" value="회원가입">

</form>


</body>
</html>