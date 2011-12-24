<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><spring:message code="produto.novo.titulo" /></title>
</head>
<body>
	<c:url var="adiciona" value="/produto/adiciona" />
	<form:form action="${adiciona}"  modelAttribute="produtoForm" id="produtoForm" method="post">
	
		<table>
			<tr>
				<td><spring:message code="produto.novo.nome" /></td>
		
				<td>
					<form:input path="nome" />  
					<form:errors path="nome"  />
				</td>
			</tr>
			<tr>
				<td><spring:message code="produto.novo.descricao" /></td>
				<td>
					<form:input path="descricao" /> 
					<form:errors path="descricao"  />
				</td>
			</tr>
			<tr>
				<td><spring:message code="produto.novo.preco" /></td>
				<td>
					<form:input path="preco" /> 
					<form:errors path="preco"  />
				</td>
			</tr>
			<tr>
				<td><spring:message code="produto.novo.cor" /></td>
				<td>
					<form:input path="cor" /> 
					<form:errors path="cor"  />
				</td>
			</tr>
			<tr>
				<td><spring:message code="produto.novo.quantidade" /></td>
				<td>
					<form:input path="quantidade" /> 
					<form:errors path="quantidade"  />
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Adicionar" /> </td>
			</tr>		
		</table>
	</form:form>
</body>
</html>