<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Profile</title>
</head>
<body>
    <h2>Employee Profile Details</h2>
    <table border="1">
        <tr><td>First Name:</td><td><%= request.getParameter("firstName") %></td></tr>
        <tr><td>Middle Name:</td><td><%= request.getParameter("middleName") %></td></tr>
        <tr><td>Last Name:</td><td><%= request.getParameter("lastName") %></td></tr>
        <tr><td>Email ID:</td><td><%= request.getParameter("email") %></td></tr>
        <tr><td>Mobile No.:</td><td><%= request.getParameter("mobile") %></td></tr>
        <tr><td>Street:</td><td><%= request.getParameter("street") %></td></tr>
        <tr><td>City:</td><td><%= request.getParameter("city") %></td></tr>
        <tr><td>Pin Code:</td><td><%= request.getParameter("pincode") %></td></tr>
        <tr><td>Hire Date:</td><td><%= request.getParameter("hireDate") %></td></tr>
        <tr><td>Manager:</td><td><%= request.getParameter("manager") %></td></tr>
        <tr><td>Qualification:</td><td><%= request.getParameter("qualification") %></td></tr>
        <tr><td>Designation:</td><td><%= request.getParameter("designation") %></td></tr>
        <tr><td>Experience:</td><td><%= request.getParameter("experience") %> years</td></tr>
    </table>
</body>
</html>
