<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>编辑图书</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script type="text/javascript">
	function edbook(){
		$.ajax({
				url:"bookServlet?method=update&bookid=${bk['bk_id']}",
				type:"post",
				data:$("#edit").serialize(),
				cache:false,
				dataType: "text",
				error:function(err){
					alert("更新失败！");
				},
				success:function(msg){
					alert("更新成功！");
					window.location.href="adminServlet"
				}
		});
	}

</script>
</head>
<body>
	<div class="container">
		<h3 class="text-center">
				管理员端
			</h3>
		<div class="col-md-8 col-md-offset-2">
			<form  method="post" id="edit">
				<table class="table table-bordered">
					<tr>
						<th>书籍名称</th>
						<td>${bk['bk_name']}</td>
					</tr>
					<tr>
						<th>是否借出</th>
						<td>
							<select class="selectpicker show-tick form-control" name="borrow" id="borrow" title="请选择一项" data-live-search="true" data-size="5">  
		                        <option role="presentation" <c:if test="${bk['bk_borrowed']==1}">selected</c:if> value="1">已借出</option>
								<option role="presentation" <c:if test="${bk['bk_borrowed']==0}">selected</c:if> value="0">未借出</option>
                    		</select>
	      				</td>
					</tr>
					<tr>
						<th>书籍作者</th>
						<td>${bk['bk_author']}</td>
					</tr>
					<tr>
						<th>书籍分类</th>
						<td>
							${bk['bk_category']}
						</td>
					</tr>
					<tr>
						<th>书籍介绍</th>
						<td><textarea class="form-control" rows="3" id="intro" name="intro">${bk['bk_intro']}</textarea></td>
					</tr>
					<tr><th></th><td><input type="submit" class="btn default" onclick="edbook()" value="提交" id="editbook" name=""/></td></tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>