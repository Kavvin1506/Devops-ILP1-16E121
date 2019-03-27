<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/includes.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Details</title>
</head>
<body>
	<form:form name="employeeIdForm" method="POST" action="getEmployee">
		<div align="left">
			<table>
				<tr>
					<td>Select the Employee Id:</td>
					<td><select name="employeeId" onchange="this.form.submit();">
							<option value="">--Choose Employee Id--</option>
							<c:forEach items="${Ids}" var="Id">
								<option value='${employeeId}'>${employeeId}</option>
							</c:forEach>
					</select></td>
				</tr>

			</table>

		</div>
	</form:form>
	<form:form name="modifyForm" method="POST" action="modify">
		<div align="center">
			<table>
				<tr>
					<td>Customer Id</td>
					<td><input type="text" name="employeeId"
						value="${Employee.employeeId}" readonly="readonly" /></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="custName"
						value="${Customer.custName}" /></td>
				</tr>
				<tr>
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
					<td><input type="submit" value="Update" /><input type="submit" value="Delete" onclick="document.modifyForm.action='remove';" /></td>
					<td><input type="submit" value="Back"
						onclick="document.modifyForm.action='start';document.modifyForm.method='GET'" /></td>
				</tr>
			</table>
			<div style="color: red">${msg}</div>
		</div>
	</form:form>
</body>
</html>