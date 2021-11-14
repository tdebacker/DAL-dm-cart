<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="_head.jsp" %>
<body class="d-flex flex-column min-vh-100 bg-dark text-white">
<script src="${pageContext.request.contextPath}/js/validateCart.js"></script>
<%@include file="_header.jsp" %>
<div class="container"><br/>
    <div class="card">
        <div class="card-body text-center text-black">
            <p>Bienvenue sur la gestion de votre panier.
            </p>
            <button class="btn btn-danger btn-lg" type="submit" onclick="validateCart()">Valider le panier</button>
        </div>
    </div>
</div>
<%@include file="_footer.jsp" %>
</body>
</html>