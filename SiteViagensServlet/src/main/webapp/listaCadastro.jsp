<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Junin Viagens-Lista</title>
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
<link rel="stylesheet" type="text/css" href="StyleCSS/styleLista.css">
<link rel="stylesheet" type="text/css" href="StyleCSS/style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>

<body>

	<header>
		<!-- estrutura navbar -->
		<nav class="navbar navbar-expand-lg text-white fixed-top"
			style="background: rgb(12, 6, 54); background: linear-gradient(90deg, rgba(12, 6, 54, 1) 34%, rgba(9, 81, 105, 1) 81%, rgba(5, 155, 154, 1) 100%);">
			<a class="navbar-brand text-white" href="index.html"> <img
				src="img/logo-icon.png" alt="logo" width="45" height="40"
				class="d-inline-block align-text-top"> Junin Viagens |
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active text-white"
						aria-current="page" href="index.html">Home</a></li>
					<li class="nav-item"><a class="nav-link text-white"
						href="destino.html">Destino</a></li>
					<li class="nav-item"><a class="nav-link text-white"
						href="promocoes.html">Promoções</a></li>
					<li class="nav-item"><a class="nav-link text-white"
						href="contato.html">Contato</a></li>
				</ul>

			</div>
			<!-- Botão de Cadastro -->
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link text-white"
					href="cadastro.jsp">Cadastre-se</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link text-white"
					href="ReadController">Listar Cadastros</a></li>
			</ul>
		</nav>
	</header>


	<div class="container">
		<h1 class="mt-5 text-center">Lista de Usuários</h1>
		<a href="./cadastro.jsp" class="btn btn-primary mb-3">Criar novo</a>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Email</th>
					<th>Senha</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cadastros}" var="cadastro2">
					<tr>
						<td>${cadastro2.id}</td>
						<td>${cadastro2.nome}</td>
						<td>${cadastro2.email}</td>
						<td>${cadastro2.senha}</td>
				
						<td><a href="UpdateController?id=${cadastro2.id}"
							class="btn btn-success">Editar</a> <a
							href="DeleteController?id=${cadastro2.id}" class="btn btn-danger">Excluir</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
	</div>
	</div>
	<footer class="py-3 fixed-bottom">
		<p>&copy; Junin Viagens Todos os Direitos Reservados</p>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>

</html>