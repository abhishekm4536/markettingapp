<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NEW LEAD</title>
</head>
<body>
<h2>NEW LEAD</h2>
<form action="saveLead" method="post">
<pre>
FIRST NAME <input type="text" name = "firstName"/>
LAST NAME  <input type="text" name = "lastName"/>
EMAIL      <input type="text" name = "email"/>
MOBILE     <input type="text" name = "mobile"/>
<input type="submit" value="save"/>
</pre>
</form>
<div>
${msg}
</div>
</body>
</html>