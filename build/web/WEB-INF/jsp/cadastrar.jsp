<%-- 
    Document   : cadastar
    Created on : 04/04/2024, 15:46:58
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/style.css" rel="stylesheet" type="text/css"/>
        <link href="styles/cadastro.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/35f5de594d.js" crossorigin="anonymous"></script>
        <title>Cadastro Page</title>
    </head>
    <body>
        <main class="main">
            <div class="container-cadastrar">
                <form id="form" action="cadastrar" method="post">
                    <% if (request.getAttribute("errorMessage") != null) {%>
                    <div class="error-message">
                        <%= request.getAttribute("errorMessage")%>
                    </div>
                    <% }%>    
                    <h1 class="Cadastrar-h1">Cadastrar</h1>
                    <div class="card">
                        <div class="input-field">
                            <i class="fa-solid fa-user" id="icone-user"></i>
                            <input type="text" placeholder="Username" id="input-nome" name="input-nome">
                            <div class="error"></div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="input-field">
                            <i class="fa-solid fa-envelope"></i>
                            <input type="text" placeholder="Email" id="input-email"  name="input-email">
                            <div class="error"></div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="input-field">
                            <i class="fa-solid fa-lock" id="icone-senha"></i>
                            <input type="password" placeholder="Password" id="input-senha"  name="input-senha">
                            <div class="error"></div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="input-field">
                            <i class="fa-solid fa-key"></i>
                            <input type="text" placeholder="Cpf" id="input-cpf"  name="input-cpf">
                            <div class="error"></div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="input-field">
                            <i class="fa-solid fa-phone"></i>
                            <input type="text" placeholder="Phone" id="input-telefone"  name="input-telefone">
                            <div class="error"></div>
                        </div>
                    </div>
                    <button class="btn-cadastrar" type="submit">Cadastrar</button>
                    <p>Se já possui cadastro <a href="./login">clique aqui</a></p>
                </form>
            </div>
            <div class="container-img">
                <img src="images/login_img02.png" alt=""/>
            </div>
        </main>

    </body>
</html>
