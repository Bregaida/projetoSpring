<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><spring:message text="Novo Produto" /></title>
</head>
<body>
	<c:url var="adiciona" value="/produto/adiciona" />
	<form action="${adiciona }" method="post">
		<form:errors />
	
		<table>
			<tr>
				<td><spring:message text="Nome" /></td>
				<td><input name="produto.nome" /> </td>
			</tr>
			<tr>
				<td><spring:message text="Descrição" /></td>
				<td><input name="produto.descricao" /> </td>
			</tr>
			<tr>
				<td><spring:message text="Preço" /></td>
				<td><input name="produto.preco" /> </td>
			</tr>
			<tr>
				<td><spring:message text="Cor" /></td>
				<td><input name="produto.cor" /> </td>
			</tr>
			<tr>
				<td><spring:message text="Quantidade" /></td>
				<td><input name="produto.quantidade" /> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Adicionar" /> </td>
			</tr>		
		</table>
	</form>
</body>
</html>