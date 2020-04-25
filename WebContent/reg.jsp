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
    <script>
	function $(id){
		return document.getElementById(id);
		}
		function check(){
			var user=$("username").value;
			var pass=$("password").value;
			var repass=$("repassword").value;
			if(user.length=="")
			{
				alert("用户名不能为空");
				return false;
			}
			if(user.length>12)
			{
				alert("用户名字符应在12字符以内");
				return false;
			}
				if(pass.length=="")
			{
				alert("密码不能为空");
				return false;
			}
			if(pass.length<8)
			{
				alert("密码应在8字符以上");
				return false;
			}
			if(pass.length!=repass.length)
			{
				alert("请确认两次密码输入一致");
			}
		}
  </script>
 </head>
 <body>
	<div class="b">
		<fieldset>
			<legend>新用户注册</legend>
			<form  action="RegServlet" method="post">
				<label for="username">用户名</label>
				<input type="text" name="username" id="username" placeholder="用户名应为12字符以内" />
				<label for="password">密码</label>
				<input type="password" name="password" id="password" placeholder="密码应为8字符以上" />
				<label for="repassword">确认密码</label>
				<input type="password" name="repassword" id="repassword" />
				<label for="sex">性别</label>
				<input type="text" name="sex" id="sex" list="sex1" />
				<datalist id="sex1">
					<option value="男">
					<option value="女">
				</datalist>
				<label for="age">年龄</label>
				<input type="number" name="age" id="age" max="120" min="12" value="18" />
				<input class="d" type="submit" name="submit_btn" id="submit_btn" value="提交" />
				<input type="reset" name="reset_btn" id="reset_btn" value="重置" />
			</form>
		</fieldset>
	</div>
 </body>
</html>