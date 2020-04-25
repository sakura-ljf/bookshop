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
  <link href="css/login.css" rel="stylesheet">
 </head>
 <body>
	<div class="q">
		<div class="w">
			<img class="e" src="images/huiliyi.png">
			<form action="LoginServlet" method="post">
				<input type="text" name="username" placeholder="请输入邮箱或用户名" class="n" />
				<input type="password" name="password" placeholder="请输入密码" class="p" />
				<input type="submit" name="submit_btn" value="登录" class="log" />
			</form>

			<div class="r"><a href="reg.html">现在注册</a></div>
			<div class="t"><a href="#">忘记密码</a></div>
		</div>
	</div>
 </body>
</html>