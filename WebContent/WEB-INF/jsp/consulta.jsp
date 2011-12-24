<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
	<head>
		<title><spring:message code="produto.consulta.titulo" /></title>
	</head>
	<body>
		<c:url var="pesquisa" value="/produto/pesquisa" />
		<c:url var="listaTodos" value="/produto/lista" />
		
		<h1><spring:message code="produto.consulta.titulo" /></h1>
		<form:form action="${pesquisa}" id="produtoForm" modelAttribute="produtoForm" method="post">
				<form:errors />
	
			<div>
				<spring:message code="produto.consulta.codigo" /> <form:input path="id" id="produtoId" />
			</div>
			
			<div>
				<p>
					<a href="${listaTodos}">
						<spring:message code="produto.consulta.lista" />
					</a>
				</p>
				<button type="submit">
					<spring:message code="produto.consulta.consulta" />
				</button>
			</div>				
		</form:form>

	</body>
</html>