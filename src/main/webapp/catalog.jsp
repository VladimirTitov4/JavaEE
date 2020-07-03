<%@ page import="java.util.List" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="WEB-INF/header.jsp"%>
<h1>Catalog page</h1>

<c:forEach var="product" items="#{list}">
    <p>product: <c:out value="${product}" />. </p>
</c:forEach>
<p>fdsfsd</p>
<%@include file="WEB-INF/footer.jsp"%>
