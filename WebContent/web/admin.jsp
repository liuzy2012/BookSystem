<%@page import="pojo.PageBean"%>
<%@page import="pojo.book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="biz.impl.bookBizImpl"%>
<%@page import="biz.bookBiz"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
</head>
<body>
<div class="container"> 
	<div class="row"> 
		<div class="col-sm-12">
			<h3 class="text-center">
				图书系统管理员端
			</h3>
			<div class="row">
				<div class="col-sm-2">
					<div class="btn-group-vertical">
						<button class="btn btn-primary" type="button">书籍管理</button> <button class="btn btn-primary" type="button">添加书籍</button> <button class="btn btn-primary" type="button">用户管理</button>
					</div>
				</div>
				<div class="col-sm-8" id="booklist">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>书籍封面</th>
							<th>书籍名称</th>
							<th>是否借出</th>
							<th>书籍作者</th>
							<th>分类目录</th>
							<th>简介</th>
							<th>操作</th>
						</tr>
					</thead>
					<!-- 03.22采用EL&JSTL进行页面 重构 -->
					<tbody>
						<c:forEach items="${requestScope.bookslist}" var="book">
							<tr>
							<td style="width:12%">
								<div class="thumbnail" >
		        			    	<img src="http://${book['bk_img']}">
		      					</div>
	      					</td>
	      					<td>
	      						<p id="bookname">${book['bk_name']}</p>
	      					</td>
	      					<td>
	      						<p>
	      						
	      						<c:if test="${book['bk_borrowed']}==1">
	      							<c:out value="已借出"></c:out>
	      						</c:if>
	      						<c:if test="${book['bk_borrowed']}==0">
	      							<c:out value="未借出"></c:out>
	      						</c:if>
	      						</p>
	      					</td>
	      					<td>
	      						<p id="bookname">${book['bk_name']}</p>
	      					</td>
	      					<td>
	      						<p id="bookname">${bk['bk_category']}</p>
	      					</td>
	      					<td>
	      						<p id="bookname">${book['bk_intro']}</p>
	      					</td>
	      					<td>
	      						<div class="btn-group-vertical">
									<button class="btn btn-primary" type="button">编辑</button> <button class="btn btn-primary" type="button">删除</button>
								</div>
	      					</td>
                   	    </tr>
						</c:forEach>
					</tbody>
					</table>
				<ul class="pagination">
				  <li><a href="adminServlet?page=${param.page-1}" <c:if test="${param.page==1}">class="btn disabled"</c:if>>&laquo;</a></li>
				  <c:forEach var="i" begin="1" end="${pagesize}">
				  	<li id="bookitem"><a href="adminServlet?page=<c:out value='${i}'/>" <c:if test="${i==param.page}">class="btn disabled"</c:if>><c:out value="${i}"/></a></li>
				  </c:forEach>
				  <li><a href="adminServlet?page=${param.page+1}" <c:if test="${param.page==pagesize}">class="btn disabled"</c:if>>&raquo;</a></li>
				</ul>
				</div>
				<div class="col-sm-2">
					<form class="form-search">
						<input class="form-control" type="text" /> <button type="submit" class="btn">查找</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>