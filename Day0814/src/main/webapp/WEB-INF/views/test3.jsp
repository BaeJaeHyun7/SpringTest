<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배열 관리</title>
<style type="text/css">
	.cls{
		background-color: orange;
	}
	
	.cls2{
		font-size: 200%;
	}

</style>

<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	var arr = ["red","blue","green"]; //배열 만들기 사용하려면 $.each()함수를 쓴다.
	$(function(){

		// 자바스크립트 기본 문법을 이용한 반복문		
		 for(var i = 0;i < arr.length;i++){
		 console.log(i + "," + arr[i]);
			}
	 // 위의 형태와 완전히 똑같다.

	 //JQuery 문법을 이용한 반복문 1 이게 제일 많이 쓴다. 공식처럼 외울것
		$.each(arr,function(index,item){
			console.log(index + "," + item);
			});
		 //JQuery 문법을 이용한 반복문 2 
		$("div").each(function(i,data){
			$(data).css("color",arr[i]);
			//$(data).addClass("cls");
			//$(data).removeClass();  

			var attr = $(data).attr("class"); 
			console.log(attr); 

			$(data).attr("class","cls3");
			$(data).attr("data-value","test" + i); // 커스텀속성, 사용자 정의 속성
			});

		});		


</script>
</head>
<body>
	<div class="cls cls2">첫번째 줄</div>
	<div class="cls cls2">두번째 줄</div>
	<div class="cls cls2">세번째 줄</div>

</body>
</html>