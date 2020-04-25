<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
  <link href="css/find.css" type="text/css" rel="stylesheet" />
 </head>
 <body>
	<div class="b">
		<fieldset>
			<legend>查询商品</legend>
			<form  action="${pageContext.request.contextPath}/GoodsSerelet?action=findbyid" method="post" name="findbyid">
				<label for="id">id查询</label>
				<input type="text" name="id" id="id" />
				<input class="d" type="submit" name="submit_btn" id="submit_btn" value="查询" />
			</form>
			<form  action="${pageContext.request.contextPath}/GoodsSerelet?action=findbyid" method="post" name="findbyid">
				<label for="name">关键字查询</label>
				<input type="text" name="name" id="name" />
				<input class="d" type="submit" name="submit_btn" id="submit_btn" value="查询" />
			</form>
			<form  action="${pageContext.request.contextPath}/GoodsSerelet?action=findbyid" method="post" name="findbyid">
				<label for="category">类别查询</label>
				<input type="text" name="category" id="category" />
				<input class="d" type="submit" name="submit_btn" id="submit_btn" value="查询" />
			</form>
			<a href="${pageContext.request.contextPath}/GoodsSerelet?action=findAll">查询所有商品信息</a>
		</fieldset>
		<div>
		
		</div>
	</div>
 </body>
</html>