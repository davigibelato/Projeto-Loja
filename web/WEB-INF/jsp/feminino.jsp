<%-- 
    Document   : masculino
    Created on : 15/04/2024, 15:28:18
    Author     : Senai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/masculino.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/35f5de594d.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link href="styles/header.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/35f5de594d.js" crossorigin="anonymous"></script>
        <link rel="shortcut icon" href="./images/favicon.png" type="image/x-icon">
        <title>Gibelato Store Masculino</title>
    </head>
    <body>
        <div class="container-1">
            <nav id="nav" class="navbar bg-body-tertiary">
                <div class="container-fluid">
                    <a class="navbar-brand" href="./home">Gibelato Store</a>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button id="btn-search" class="btn btn-outline-success" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                    </form>
                </div>
            </nav>
        </div>

        <header class="header">
            <div class="categorias">
                <div class="dropdown">
                    <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                        <i class="fa-solid fa-list"></i>Categorias
                    </button>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="./masculino"><i class="fa-solid fa-person"></i>Masculino</a></li>
                        <li><a class="dropdown-item" href="./feminino"><i class="fa-solid fa-person-dress"></i>Feminino</a></li>
                        <li><a class="dropdown-item" href="./calcados"><i class="fa-solid fa-shoe-prints"></i>Calçados</a></li>
                    </ul>
                </div>

                <button type="button" class="btn btn-light"><i class="fa-solid fa-star"></i> Destaques</button>

                <div class="dropdown">
                    <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                        <i class="fa-solid fa-cart-shopping"></i>Carrinho
                    </button>
                    <ul class="dropdown-menu">
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>
                <a href="./login">
                    <button type="button" class="btn btn-light"><i class="fa-solid fa-user"></i> Minha conta</button>
                </a>
            </div>    
        </header>

        <main class="main">

            <div class="container">
                <c:forEach items="${produtos}" var="produto">
                    <div class="card" style="width: 18rem;">
                        <img src="data:image/jpeg;base64,${produto.imagemBase64}" class="card-img-top" alt="${produto.nome}">

                        <div class="card-body">
                            <h5 class="card-title">${produto.nome}</h5>
                            <p class="card-text">Preço = $${produto.valor}</p>
                            <a href="./produto?id=${produto.idProduto}" class="btn btn-primary">Comprar/Add Carrinho</a>
                        </div>
                    </div>
                </c:forEach>
        </main>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
