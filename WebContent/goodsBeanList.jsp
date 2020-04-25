<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
 </head>
 <body>
	<br /><h1>管理员查询到的数据库中的所有数据</h1>
	<table style="border:1px solid #8ba7e3" border="1">
	<tr>
	<td>id</td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>商品分类</td>
	<td>商品库存</td>
	<td>商品图片</td>
	<td>商品描述</td>
	<td>修改商品</td>
	<td>删除商品</td>
	</tr>
	<c:forEach items="${listGoodsBean }" var="g">
	<tr>
	<td>${g.id }</td>
	<td>${g.name }</td>
	<td>${g.price }</td>
	<td>${g.category }</td>
	<td>${g.pnum }</td>
	<td><img src="images/${g.imgurl }"  width="30" height="30"/></td>
	<td>${g.description }</td>
	<td>
	<form action="${pageContext.request.contextPath}/GoodsSerelet?action=findbyid" method="post" name="update">
	<input type="hidden" name="id" value="${g.id }" />
	<input type="submit" value="修改" />
	</form>
	</td>
	<td>
	<form action="${pageContext.request.contextPath}/GoodsSerelet?action=delid" method="post" name="dele">
	<input type="hidden" name="id" value="${g.id }" />
	<input type="submit" value="删除" />
	</form>
	</td>
	</tr>
	</c:forEach>
	</table>
 </body>
</html>