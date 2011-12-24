<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="produto.exibe.titulo" /></title>
</head>
<body>
	<spring:message code="produto.exibe.codigo" /> ${produtoForm.id}<br/>
	<spring:message code="produto.exibe.nome" /> ${produtoForm.nome}<br/>
	<spring:message code="produto.exibe.descricao" /> ${produtoForm.descricao}<br/>
	<spring:message code="produto.exibe.preco" /> <fmt:formatNumber value="${produtoForm.preco }" type="currency"/><br/>
	<spring:message code="produto.exibe.cor" /> ${produtoForm.cor}<br/>
	<spring:message code="produto.exibe.quantidade" /> ${produtoForm.quantidade}<br/>
</body>
</html>