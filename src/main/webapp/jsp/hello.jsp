<%@ page import="java.util.Calendar" %>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
  <title>Directly accessible JSP page</title>
</head>
<body>
<h1>Directly accessible JSP page</h1>
<%
    Calendar today = Calendar.getInstance();
%>
<p>Hello from directly accessible JSP page!</p>
<p>Current date is <%=today.getTime()%></p>
<p>2 + 2 = ${2 + 2}</p>
</body>
</html>