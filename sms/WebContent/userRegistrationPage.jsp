<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザ登録</title>
</head>
<body>
	<h1>ユーザ登録ページ</h1>
	<h2>あなたの情報を入力してください。</h2>
	<p><span style="color:#FF0000">*がつく項目は必ず入力してください。</span></p>
	<form action="./UserInsert" method="post">
	<table>
	<tr>
	<td>
	<p>*ユーザ名(学籍番号を推奨)</p>
	</td>
	<td>
	<input type="text" name="username">
	</td>
	</tr>
	<tr>
	<td>
	<p>*パスワード </p>
	</td>
	<td>
	<input type="password" name="password">
	</td>
	</tr>
	</table>
	<p><input type="reset" value="リセット"></p>
	<p><input type="submit" value="送信"></p>
	</form>
</body>
</html>