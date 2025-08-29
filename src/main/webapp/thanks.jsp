<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Survey Result</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/main.css" type="text/css"/>
</head>
<body>
    <div class="result-box">
        <h1>Thanks for filling out our survey!</h1>
        <p>Here is the information that you entered:</p>

        <label>Email:</label> <span>${user.email}</span><br>
        <label>First Name:</label> <span>${user.firstName}</span><br>
        <label>Last Name:</label> <span>${user.lastName}</span><br>
        <label>Date of Birth:</label> <span>${user.dob}</span><br>
        <label>Heard About Us:</label> <span>${user.hear}</span><br>
        <label>Preferred Contact:</label> <span>${user.contact}</span><br>

        <p>To enter another response, click below:</p>
        <form action="index.html" method="get">
            <input type="submit" value="Return">
        </form>
    </div>
</body>
</html>
