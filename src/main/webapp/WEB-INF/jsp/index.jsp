<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="_head.jsp" %>
<body class="d-flex flex-column min-vh-100 bg-dark text-white">
<script src="${pageContext.request.contextPath}/js/validateCart.js"></script>
<script src="${pageContext.request.contextPath}/js/addArticle.js"></script>
<%@include file="_header.jsp" %>

<div class="container"><br/>
    <div class="card">
        <div class="card-body text-center text-black">
            <p>Bienvenue sur la gestion de votre panier.
            </p>

            <div class="card mx-auto" style="width: 50%">
                <div class="card-header bg-info text-white">Infos</div>
                <div class="card-body">
                    <c:if test="${param.auth == 'true'}">
                        <p>Vous êtes connecté!</p>
                    </c:if>
                    <c:if test="${not empty param.operation}">
                        <p>Opération = ${param.operation}</p>
                    </c:if>
                </div>
            </div>

            <br>

            <c:forEach items="${articles}" var="article">
                <div class="card">
                    <div class="card-body">
                        <img src="${article.img}" class="img-thumbnail" alt="${article.name}"/>
                        <p>ID: <c:out value="${article.id}"/></p>
                        <p>Nom: <c:out value="${article.name}"/></p>
                        <p>
                            Prix: <fmt:formatNumber type="currency" currencySymbol="&euro;"
                                                    value="${article.price/100.0}"/>
                        </p>
                        <button class="btn btn-primary btn-sm" type="submit" onclick="addArticle()">Ajouter l'article</button>
                    </div>
                </div>
            </c:forEach>
            <br>
            <button class="btn btn-danger btn-lg" type="submit" onclick="validateCart()">Valider le panier</button>
        </div>
    </div>
</div>
<%@include file="_footer.jsp" %>
</body>
</html>