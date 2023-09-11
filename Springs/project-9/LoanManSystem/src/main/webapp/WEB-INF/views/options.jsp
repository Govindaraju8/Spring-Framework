<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body{
	text-align: center;
}
.btn {
  border: 2px solid black;
  background-color: white;
  color: black;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
}

/* Green */
.success {
  border-color: #3799c7;
  color: rgb(0, 90, 128);
}

.success:hover {
  background-color: #04AA6D;
  color: white;
}

/* Blue */
.info {
  border-color: #2196F3;
  color: dodgerblue;
}

.info:hover {
  background: #2196F3;
  color: white;
}

/* Orange */
.warning {
  border-color: #ff9800;
  color: orange;
}

.warning:hover {
  background: #ff9800;
  color: white;
}


</style>
</head>
<body>

<h1>Welcome to our Bank</h1>
<br>
<form action="loginbutton" method="POST">
<button class="btn success">APPLY FOR LOAN</button><br><br>
</form>
<br>
<br>
<form action="check" method="GET">
<button class="btn info">KNOW ELIGIBILITY</button><br><br>
</form>
<br>
<br>
<form action="viewapps" method="GET">
<input type="hidden" name="lnapprocesseduser" value="${userr.getUserid()}">
<button class="btn warning">VIEW LOANS</button>
</form>
<br>
<br>

</body>
</html>