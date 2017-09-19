<%-- 
    Document   : ageCalculator
    Created on : Sep 18, 2017, 5:51:04 PM
    Author     : 729347
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Info</title>
    </head>
    <body>
        <h1>Age next birthday</h1>
        <div>
            <form action="AgeCalculatorServlet" method="GET">
                Enter your current age: <input type="text" name="myAge" value="${age}">
                <input type="submit" value="Age next birthday">
            </form>
        </div>
        ${nothingMessage}
        ${numMessage}
        ${ageMessage}
    </body>
</html>
