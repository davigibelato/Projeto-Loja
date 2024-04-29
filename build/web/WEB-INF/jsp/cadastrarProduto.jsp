<%-- 
    Document   : cadastrarProduto
    Created on : 24/04/2024, 14:58:04
    Author     : Senai
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/35f5de594d.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link href="styles/header.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/35f5de594d.js" crossorigin="anonymous"></script>
        <link rel="shortcut icon" href="./images/favicon.png" type="image/x-icon">
        <link href="styles/cadastroProduto.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-1">
            <nav id="nav" class="navbar bg-body-tertiary">
                <div class="container-fluid">
                    <a class="navbar-brand" href="./homeAdmin">Gibelato Store</a>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button id="btn-search" class="btn btn-outline-success" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                    </form>
                </div>
            </nav>
        </div>

        <header class="header">
            <div class="categorias">
                <a href="./cadastrarProduto">
                    <button type="button" class="btn btn-light"><i class="fa-solid fa-user"></i> Minha conta</button>
                </a>

                <a href="./cadastrarProduto">
                    <button type="button" class="btn btn-light"><i class="fa-solid fa-star"></i> Cadastrar Produto</button>
                </a>
            </div>    
        </header>

        <main>
            <div class="center-text">
                <h1>Cadastro de Produtos</h1>
            </div> 
            <div class="form-cadastro-produtos">
                <form action="Comprar" method="post" name="frmCadastro" enctype="multipart/form-data">
                    <div class="input-box">
                        <input type="text" name="input-nome" id="input-nome" placeholder="Nome">
                    </div>
                    <div class="input-box">
                        <input type="number" name="input-valor" id="input-valor" placeholder="Valor">
                    </div>
                    <div class="input-box">
                        <label for="categoria">Categoria</label>
                        <input type="text" id="categoria" name="categoria">
                    </div>
                    <label for="imagem">Imagem</label>
                    <input type="file" id="imagem" name="imagem" required accept="image/*">
                    <div class="right-box">
                        <div class="image-box">
                            <img src="" alt="Imagem do produto" id="mainImage" class="main-image">
                        </div>
                        <div class="comprar">         
                            <div class="listaTamanho">
                                <button id="btn" type="submit" class="btn btn-success">Comprar</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </main>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
