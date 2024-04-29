<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/35f5de594d.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="styles/style.css">
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <title>Login Page</title>   
    </head>
    <body>
        <main class="main">
            <div class="container-login">
                <% if (request.getAttribute("errorMessage") != null) { %>
                    <div class="error-message">
                        <%= request.getAttribute("errorMessage") %>
                    </div>
                <% } %>
                <form action="login" method="get" name="f1">
                    <h1 class="login-h1">Login</h1>
                    <div class="input-field">
                        <i class="fa-solid fa-user" id="icone-user"></i>
                        <input type="text" placeholder="Username" id="input-user" name ="input-user">
                    </div>
                    <div class="input-field">
                        <i class="fa-solid fa-lock" id="icone-senha"></i>
                        <input type="password" placeholder="Password" id="input-senha" name ="input-senha">
                    </div>
                    <button type="submit" class="btn-login">Login</button>
                </form>
                <p>Se não possui cadastro <a href="./cadastrar">clique aqui</a></p>
            </div>
            <div class="container-img">
                <img src="images/login_img02.png" alt=""/>
            </div>
        </main>
        <script src="./../scripts/login.js" type="text/javascript"></script>
    </body>
</html>
