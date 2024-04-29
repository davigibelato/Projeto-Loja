<%-- 
    Document   : paginaInicial
    Created on : 15/04/2024, 15:09:52
    Author     : Senai
--%>

<%@page import="java.util.List"%>
<%@page import="model.BEAN.Produto"%>
<%@page import="model.BEAN.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/35f5de594d.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

        <link href="styles/header.css" rel="stylesheet" type="text/css"/>
        <link href="styles/paginaInicial.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/35f5de594d.js" crossorigin="anonymous"></script>
        <link rel="shortcut icon" href="./images/favicon.png" type="image/x-icon">
        <title>Gibelato Store</title>
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
                <a href="./login">
                    <button type="button" class="btn btn-light"><i class="fa-solid fa-user"></i> Minha conta</button>
                </a>
                <a href="./cadastrarProduto">
                    <button type="button" class="btn btn-light"><i class="fa-solid fa-star"></i> Cadastrar Produto</button>
                </a>
            </div>    
        </header>

        <main class="main">
            <div id="carouselExampleAutoplaying" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="./images/slides.jpg" alt=""/>
                    </div>
                    <div class="carousel-item">
                        <img src="./images/slide2.jpg" alt=""/>
                    </div>
                    <div class="carousel-item">
                        <img src="./images/slide3.jpg" class="d-block w-100" alt="...">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>

            <div class="title-novidades">
                <h1>Novidades em Breve</h1>
            </div>

            <div class="card-group" id="group-card">
                <div class="card" id="cartoes">
                    <img src="./images/Novidades/novidade-1.jpg" alt=""/>
                    <div class="card-body">
                        <h5 class="card-title">BONÉ ABA CURVA STRUCTURED JOCKEY</h5>
                    </div>
                </div>
                <div class="card">
                    <img src="./images/Novidades/novidade-2.jpg" alt=""/>
                    <div class="card-body">
                        <h5 class="card-title">ÓCULOS MAG LOGO THRASHER PRETO BRANCO</h5>
                    </div>
                </div>
                <div class="card">
                    <img src="./images/Novidades/novidade-3.jpg" alt=""/>
                    <div class="card-body">
                        <h5 class="card-title">POCHETE RETRO BAW SPORT VINGATE</h5>
                    </div>
                </div>
            </div>
        </main>

        <footer class="footer">
            <h3 class="h3-t">Gibelato Store</h3>
            <p>Somos apaixonados por estilo urbano e autenticidade. Aqui, oferecemos uma seleção cuidadosamente curada das últimas tendências em streetwear, garantindo que você esteja sempre à frente no jogo da moda urbana. Explore nossa coleção e faça parte da nossa comunidade de indivíduos que definem seu próprio estilo. Junte-se a nós enquanto transformamos ruas em passarelas.</p>

            <div class="links">
                <p><i class="fa-brands fa-instagram"></i></p>
                <p><i class="fa-brands fa-twitter"></i></p>
                <p><i class="fa-brands fa-tiktok"></i></p>
                <p><i class="fa-brands fa-youtube"></i></p>
            </div>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
