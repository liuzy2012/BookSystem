<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员登录页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="../css/bootstrap.css">
<script type="text/javascript" src="../js/bootstrap.js"></script>
<script>
	
</script>
</head>
<body> 
<div class="continer">
	<div style="margin:0 auto">
		<h2 class="text-center">图书管理系统</h2>
		<form class="form-horizontal" role="form" action="/BookSystem/adminlogin" method="post">
			
			<div class="form-group">
	     	<label for="username" class="col-sm-2 control-label">用户名：</label>
	     	<div class="col-sm-5">
	        	<input type="text" class="form-control" name="adname" id="adname" 
	            	placeholder="请输入用户名">
	      	</div>
	      	</div>
	      	<div class="form-group">
	     	<label for="password" class="col-sm-2 control-label">密码：</label>
	     	<div class="col-sm-5">
	        	<input type="password" class="form-control" name="password" id="password" 
	            	placeholder="请输入密码">
	      	</div>
	      	</div>
	      	<div class="form-group">
	      		<div class="col-sm-offset-2 col-sm-10">
	      			<input type="submit" class="btn btn-default" value="登录"/>
	      		</div>
	      	</div>
	   
		</form>
	</div>
</div>
</body>
</html>