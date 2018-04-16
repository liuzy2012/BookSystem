<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欢迎来到图书管理系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<style type="text/css">
	#userCh{
		position: relative;
        text-align:center;
        transform: translateY(200%);
	}
</style>
</head>
<body>
	<div class="col-sm-12">
		<div class="col-sm-3"></div>
		<div class="col-sm-6" id="userCh">
			<h3 class="text-center">
				请选择
			</h3>
			<button type="button" class="btn btn-primary">普通用户</button>
			<button type="button" class="btn btn-primary" onclick="window.location.href='web/admin/AdminLogin.jsp'">管理员</button>
		</div>
		<div class="col-sm-3"></div>
	</div>
</body>
</html>