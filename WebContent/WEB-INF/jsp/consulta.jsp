<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
	<head>
		<title><spring:message text="Loja Possege" /></title>
	</head>
	<body>
		<c:url var="consulta" value="/produto/pesquisa" />
		<c:url var="listaTodos" value="/produto/lista" />
		
		<h1><spring:message text="Loja Possege" /></h1>
		<form:form action="${consulta}" id="produtoForm" modelAttribute="produtoForm" method="post">
				<form:errors />
	
			<div>
				<spring:message text="Código do produto" /><form:input path="produto.id" id="produtoId" />
			</div>
			
			<div>
				<p>
					<a href="${listaTodos}">
						<spring:message text="Listar Todos" />
					</a>
				</p>
				<button type="submit">
					<spring:message text="Consultar" />
				</button>
			</div>				
		</form:form>

	</body>
</html>