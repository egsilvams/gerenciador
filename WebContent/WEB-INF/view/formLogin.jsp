<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada" var="linkEntradaServelet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${linkEntradaServelet}" method="post">
		Login: <input type="text" name="login"/> <br/><br/>
		Senha: <input type="password" name="senha"/> <br/>
		<input type="hidden" name="acao" value="Login"/> <br/><br/>
		<input type="submit" />
	</form>
</body>
</html>