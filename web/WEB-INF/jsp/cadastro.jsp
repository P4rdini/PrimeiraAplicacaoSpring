<%-- 
    Document   : cadastro
    Created on : 17/01/2021, 12:49:27
    Author     : rafa_
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css"/>
        <title>Cadastro</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6 cadastro">
            <h1>Tela de cadastro</h1>
            <form action="olamundo" method="POST">
                <div class='form-group'>
                    Nome
                    <input type="text" id="name" name="nome" class="form-control" required>
                </div>
                
                <div class="form-group">
                    Endereço
                    <input type="text" id="endereco" name="endereco" class="form-control" required>
                </div>
                <div class="form-group">
                    Telefone
                    <input type="number" id="telefone" name="telefone" class="form-control" required>
                </div>
                <div  class="form-group">
                    E-mail
                    <input type="email" id="email" name="email" class="form-control" required>
                </div>
                <div class="form-group">
                    <input type="submit" name="submit" value="cadastrar">
                </div>
            </form>
            </div>
        </div>
    </body>
</html>
