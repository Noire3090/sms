<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>loginPage</title>
</head>
<body>
<form action="./Sessionandlogin" method="post" name="loginpage">
	<h1>ログインページ</h1>
	<%
		String code = null;
		code = (String)session.getAttribute("status");
		if(code == "error"){
			out.println("<p><span style=\"color:#FF0000\">ユーザー名または、パスワードが間違っています。</span></p>");
			out.println("<p><span style=\"color:#FF0000\">ユーザー名、パスワードを確認してもう一度入力してください</span></p>");
		}else if(code == "notfounderror"){
			out.println("<p><span style=\"color:#FF0000\">ユーザー名または、パスワードが入力されていません。</span></p>");
			out.println("<p><span style=\"color:#FF0000\">ユーザー名、パスワードを入力してください</span></p>");
		}else if(code == "p-error"){
			out.println("<p><span style=\"color:#FF0000\">パスワードが間違っています。</span></p>");
			out.println("<p><span style=\"color:#FF0000\">パスワードを確認してもう一度入力してください</span></p>");
		}else if(code == "u-error"){
			out.println("<p><span style=\"color:#FF0000\">ユーザー名が間違っています。</span></p>");
			out.println("<p><span style=\"color:#FF0000\">ユーザー名を確認してもう一度入力してください</span></p>");
		}
	%>
	<table>
	<tr>
	<td>
	<p>ユーザー名</p>
	</td>
	<td>
	<input type="text" name=username>
	</td>
	</tr>
	<tr>
	<td>
	<p>パスワード</p>
	</td>
	<td>
	<input type="password" name="password">
	</td>
	</tr>
	</table>
	<input type="submit" value="ログイン" id="submit">
</form>
</body>
</html>
