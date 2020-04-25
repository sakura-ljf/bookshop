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
			<legend>商品修改</legend>
			<form  action="${pageContext.request.contextPath}/GoodsSerelet?action=updategoods" method="post">
				<label for="name">商品名</label>
				<input type="text" name="name" id="name" value="${pd.name }"/>
				<label for="price">价格</label>
				<input type="text" name="price" id="price" value="${pd.price }"/>
				<label for="category">种类</label>
				<input type="text" name="category" id="category" value="${pd.category }"/>
				<label for="pnum">数量</label>
				<input type="text" name="pnum" id="pnum" value="${pd.pnum }"/>
				<label for="imgurl">略缩图</label>
				<input type="text" name="imgurl" id="imgurl" value="${pd.imgurl }"/>
				<label for="description">描述</label>
				<input type="text" name="description" id="description" value="${pd.description }"/>
				<input type="hidden" name="id" value="${pd.id }"/>
				<input class="d" type="submit" name="submit_btn" id="submit_btn" value="修改" />
				<input type="reset" name="reset_btn" id="reset_btn" value="重置" />
			</form>
		</fieldset>
	</div>
 </body>
</html>