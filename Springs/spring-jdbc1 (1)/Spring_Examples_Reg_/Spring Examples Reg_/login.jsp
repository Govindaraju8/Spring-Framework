<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Login!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="verifylogin" method="post">
	<table>
		<tr><td>User Name </td>
			<td><input type="text" name="userName"></td> 
		</tr>
		<tr><td>Password </td>
			<td> <input type="password" name="password"></td> 
		</tr>
		<tr><td>
		<input
			type="submit" value="Login"></td><td></td> 
		</tr>
	</table>
	</form>
</body>
</html>

