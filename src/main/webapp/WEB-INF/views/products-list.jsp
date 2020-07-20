<%@ page import="ru.titov.enterprise.constant.FieldConst" %>
<%@ page import="java.util.Collection" %>
<%@ page import="ru.titov.enterprise.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    final Object productsObject = request.getAttribute(FieldConst.PRODUCTS);
    final Collection<Product> products = (Collection<Product>) productsObject;
%>
<html>
<head>
    <title>Products List</title>
</head>
<body>
<h1>Список продуктов:</h1>

<% for (final Product product : products) {%>

    <p1><%= product.getId() %></p1>
    <p1><%= product.getName() %></p1>
    <p1><%= product.getDescription() %></p1>

<% } %>

</body>
</html>
