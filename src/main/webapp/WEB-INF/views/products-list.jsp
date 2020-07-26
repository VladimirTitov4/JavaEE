<%@ page import="ru.titov.enterprise.constant.FieldConst" %>
<%@ page import="java.util.Collection" %>
<%@ page import="ru.titov.enterprise.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp">
    <jsp:param name="title" value="Product list"/>
</jsp:include>


<%
    final Object productsObject = request.getAttribute(FieldConst.PRODUCTS);
    final Collection<Product> products = (Collection<Product>) productsObject;
%>
<h1 class="main-banner"> Список продуктов Java Store</h1>
<%@ include file="menu.jsp"%>
<div class="products">


<% for (final Product product : products) {%>
    <div class="product">
        <p><%= product.getName() %></p>
    </div>
<% } %>

</div>
<%@ include file="footer.jsp"%>
