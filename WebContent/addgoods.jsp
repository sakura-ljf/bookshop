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
  <link href="css/reg.css" type="text/css" rel="stylesheet" />
 </head>
 <body>
	<div class="b">
		<fieldset>
			<legend>商品添加</legend>
			<form  action="${pageContext.request.contextPath}/GoodsSerelet?action=add" method="post">
				<label for="name">商品名</label>
				<input type="text" name="name" id="name" />
				<label for="price">价格</label>
				<input type="text" name="price" id="price" />
				<label for="category">种类</label>
				<input type="text" name="category" id="category" />
				<label for="pnum">数量</label>
				<input type="text" name="pnum" id="pnum" />
				<label for="imgurl">略缩图</label>
				<input type="text" name="imgurl" id="imgurl" />
				<label for="description">描述</label>
				<input type="text" name="description" id="description" />
				<input class="d" type="submit" name="submit_btn" id="submit_btn" value="添加" />
				<input type="reset" name="reset_btn" id="reset_btn" value="重置" />
			</form>
		</fieldset>
	</div>
 </body>
</html>