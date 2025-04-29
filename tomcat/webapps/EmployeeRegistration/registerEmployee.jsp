<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Registration</title>
</head>
<body>
    <h2>Employee Registration Form</h2>
    <form action="userProfile.jsp" method="post">
        <table>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" required></td>
            </tr>
            <tr>
                <td>Middle Name:</td>
                <td><input type="text" name="middleName"></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName" required></td>
            </tr>
            <tr>
                <td>Email ID:</td>
                <td><input type="email" name="email" required></td>
            </tr>
            <tr>
                <td>Mobile No.:</td>
                <td><input type="text" name="mobile" required></td>
            </tr>
            <tr>
                <td>Street:</td>
                <td><input type="text" name="street" required></td>
            </tr>
            <tr>
                <td>City:</td>
                <td><input type="text" name="city" required></td>
            </tr>
            <tr>
                <td>Pin Code:</td>
                <td><input type="text" name="pincode" required></td>
            </tr>
            <tr>
                <td>Hire Date:</td>
                <td><input type="date" name="hireDate" required></td>
            </tr>
            <tr>
                <td>Manager:</td>
                <td><input type="text" name="manager" required></td>
            </tr>
            <tr>
                <td>Qualification:</td>
                <td><input type="text" name="qualification" required></td>
            </tr>
            <tr>
                <td>Designation:</td>
                <td><input type="text" name="designation" required></td>
            </tr>
            <tr>
                <td>Experience (in years):</td>
                <td><input type="text" name="experience" required></td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
