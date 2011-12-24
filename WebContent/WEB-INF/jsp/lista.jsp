<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><spring:message text="produto.lista.titulo" /></title>
</head>
<body>
	<table>
		<c:forEach var="produto" items="${produtos }">
			<tr id="produtoRemove-${produto.id }">
				<td>${produto.nome }</td>
				<td>${produto.descricao }</td>
				<td><fmt:formatNumber value="${produto.preco }" type="currency"/></td>
				<td>${produto.cor }</td>
				<td><a href="javascript:void(0);" onclick="remove(${produto.id}); return false;">Remove</a></td>
			</tr>
		</c:forEach>
	</table>
</body>

<script type="text/javascript" src="<c:url value="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js" />"></script>
<script type="text/javascript">
	function remove(id){
		$.get('remove?produto.id='+id,function(){
			$('#produtoRemove-' + id).hide();
			alert('produto removido com sucesso');
			$('#produtoRemove-' + id).remove();
		});
	}
</script>
</html>