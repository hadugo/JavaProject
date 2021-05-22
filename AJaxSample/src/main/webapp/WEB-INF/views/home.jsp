<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<script src="https://code.jquery.com/jquery-3.6.0.slim.min.js" integrity="sha256-u7e5khyithlIdTpu22PHhENmPcRdFiHRjhAuHcs05RI=" crossorigin="anonymous"></script>
<script>

	$(function(){
		$("#btn").click(function(){
			$("form").attr("action","doResult");	
			$("form").attr("method","post");		
			$("form").submit();			
		});
	});
</script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  <input type="button" id="btn" name="btn"> </P>
<form>
	<input name="code" id="code" value="00001">
	<input name="name" id="name" value="이수경">
</form>
</body>
</html>

<!-- ajax 구버젼과 신버젼 두가지 문법
			$.ajax({
			    type : 'post', // 타입 (get, post, put 등등)
			    url : '/test', // 요청할 서버url
			    async : true, // 비동기화 여부 (default : true)
			    headers : { // Http header
			      "Content-Type" : "application/json",
			      "X-HTTP-Method-Override" : "POST"
			    },
			    dataType : 'text', // 데이터 타입 (html, xml, json, text 등등)
			    data : JSON.stringify({ // 보낼 데이터 (Object , String, Array)
			      "no" : no,
			      "name" : name,
			      "nick" : nick
			    }),
			    success : function(result) { // 결과 성공 콜백함수
			        console.log(result);
			    },
			    error : function(request, status, error) { // 결과 에러 콜백함수
			        console.log(error);
			    }
			});
			
			$.ajax( 
				"/text",
    			{
      				method: 'get',
      				data : { name: "chan" },
      				dataType: 'json'
    			})
  					.done(function() { // 서버요청이 성공시의 콜백함수
    					alert( "success" );
  						})
  					.fail(function() { // 서버요청이 에러시의 콜백함수
    					alert( "error" );
  						})
  					.always(function() { // 항상 실행 (finally 같은느낌)
    					alert( "complete" );
  						}); 
 -->