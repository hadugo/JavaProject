<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
	<script src="https://code.jquery.com/jquery-3.6.0.slim.min.js" integrity="sha256-u7e5khyithlIdTpu22PHhENmPcRdFiHRjhAuHcs05RI=" crossorigin="anonymous"></script>
	<SCRIPT>
		$(function(){
			$("#btn1").click(function(){
				$(location).attr("href", "employ/SimpleMybatisTest");
			});
			$("#btn2").click(function(){
				$(location).attr("href", "employ/MybatisTransactionTest");
			});
			$("#btn3").click(function(){
				$(location).attr("href", "employ/Ajax");
			});
		});
	</SCRIPT>
</head>
<body>

	<H1>Spring Mybatis Sample</H1>
	<input type="button" id="btn1" name="btn1" value="Mybatis Test">
	<input type="button" id="btn2" name="btn2" value="Mybatis Transaction Test">
	<input type="button" id="btn3" name="btn3" value="Ajax Test">
</body>
</html>
