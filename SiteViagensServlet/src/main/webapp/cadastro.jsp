<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
<title>Junin Viagens-Cadastro</title>
<link rel="stylesheet" href="StyleCSS/style.css">
<link rel="stylesheet" href="StyleCSS/cadastro.css">
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
		<div class="row justify-content-center">
			<div class="col-md-6">
			<h1>Cadastro de Cliente</h1>
				<form class="md-5" action="CreateController" method="post">
					<div class="form-group">
						<label for="nome">Nome:</label> <input type="text"
							class="form-control" id="nome" name="nome" required>
					</div>
					<div class="form-group">
						<label for="login">Email:</label> <input type="text"
							class="form-control" id="email" name="email" required>
					</div>
					<div class="form-group">
						<label for="senha">Senha:</label> <input type="password"
							class="form-control" id="senha" name="senha" required>
					</div>
			
					<button type="submit" class="btn btn-primary md-5">Cadastrar</button>
				</form>
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
