<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>detais Jsp</title>
</head>
<body>
<%-- 		EL get value --%>
		ProductName:${requestScope.product.ProductName }
		<br>
		<br>
		ProductDoc:${requestScope.product.ProductDoc }
		<br>
		<br>
		ProdoctPrice:${requestScope.product.ProdoctPrice }
</body>
</html>