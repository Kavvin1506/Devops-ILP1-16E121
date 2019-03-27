<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Form</title>

</head>
<body>
	<form:form name="registerForm" method="POST" action="register">
		<div align="center">
			<table>
				<tr>
					<td>Customer Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<td>Candy</td>
					<td><input type="text" name="candy" value="${Employee.candy}"
						disabled="disabled"/></td>
							<option value="">--Modify Candy--</option>
							<option value="Milkybar">Milkybar</option>
							<option value="Kikat">Kikat</option>
							<option value="Munch">Munch</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login" /></td>
				</tr>
			</table>
			<div style="color: red">${msg}</div>
		</div>
	</form:form>
</body>
</html>