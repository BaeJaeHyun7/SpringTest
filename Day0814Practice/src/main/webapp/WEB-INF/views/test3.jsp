<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배열 관리</title>
<style type="text/css">
	
	.cls{
			background-color : orange;
			}
	.cls2{
		font-size: 200%;
	}

</style>

<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

var arr = ["red","blue","green"]; //배열 만들기 사용하려면 $.each()함수를 쓴다.
$(function(){

	
 

 
	$.each(arr,function(index,item){
		console.log(index + "," + item);
		});
	
	$("div").each(function(i,data){
		$(data).css("color",arr[i]);
		

		var attr = $(data).attr("class"); 
		console.log(attr); 

		$(data).attr("class","cls3");
		$(data).attr("data-value","test" + i); 
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