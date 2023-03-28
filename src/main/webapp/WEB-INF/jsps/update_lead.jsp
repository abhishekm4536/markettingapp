<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update LEAD</title>
</head>
<body>
<h2>update LEAD</h2>
<form action="updateLead" method="post">
<pre>
	<input type="hidden" name = "id" value="${lead.id}"/>
FIRST NAME <input type="text" name = "firstName" value="${lead.firstName}"/>
LAST NAME  <input type="text" name = "lastName"value="${lead.lastName}"/>
EMAIL      <input type="text" name = "email"value="${lead.email}"/>
MOBILE     <input type="text" name = "mobile"value="${lead.mobile}"/>
<input type="submit" value="update"/>
</pre>
</form>
<div>
${msg}
</div>
</body>
</html>