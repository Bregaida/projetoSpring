<!DOCTYPE HTML>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
	<head>
		<title><decorator:title default="Possege"/></title>
		<meta charset="utf-8" /> 
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="expires" content="-1" />
		<meta http-equiv="cache-control" content="no-cache" />
		
		<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;" />	    
		<meta name="format-detection" content="telephone=no" />

	    <meta name="apple-mobile-web-app-capable" content="yes" />
	    <meta name="apple-mobile-web-app-status-bar-style" content="black" />		
		
		
		<decorator:head />
	</head>
	<body>


		<div>
		
			<div>
	    		<decorator:body/>
	    	</div>
	    	
		</div>
		<script src="http://www.google.com/jsapi"></script>
<script type="text/javascript">
	// Load jQuery
	google.load("jquery", "1.6.1");

	google.setOnLoadCallback(function() {
		// Seu código aqui
	});
</script>


<script type="text/javascript" src="<c:url value="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js" />"></script>
</body>
</html>
