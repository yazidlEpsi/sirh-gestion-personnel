<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SCG APP</title>
</head>
<body>
<h1> les collaborateurs</h1>
<p> nicolas le gros mangeur </p>
 <ul> 
 <%
 List<String> listNom = (List<String>) request.getAttribute("listeNoms");
 for(String nom : listNom){ %>
	<li> <%=  nom %></li>

<%
	}
%>
  </ul>
</body>
</html>