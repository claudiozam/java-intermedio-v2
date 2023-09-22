<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="../template_superior.jsp"></jsp:include>

<h2>Formulario reclamo</h2>

<form:form action="/reclamos/guardar" modelAttribute="reclamoForm">

	Id: <form:input path="id" readonly="true"/>
	Titulo: <form:input path="titulo"/><br>
	Descripcion: <form:textarea path="descripcion" rows="5" cols="15" /><br>

	<button type="submit">Enviar</button>
</form:form>

<jsp:include page="../template_inferior.jsp"></jsp:include>
