<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Account</title>
    <!-- Add your CSS styles here -->
    <style>
        /* CSS styles for the account details section */
        body {
            font-family: 'Josefin Sans', sans-serif;
            font-family: 'Playfair Display', serif;
        }

        .account-details {
            margin: 20px auto;
            padding: 20px;
            text-align: center;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 400px;
            justify-content: center;
            background-color: #f9f9f9;
        }

        .account-details h2 {
            margin-top: 0;
        }

        .account-details p {
            margin-bottom: 10px;
        }

        /* CSS styles for the logout button */
        .logout-button {
            margin-top: 20px;
        }

        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="account-details">
        <h2>My Account</h2>
        <p><strong>Customer ID:</strong> <%= request.getAttribute("customer").getCustId() %></p>
        <p><strong>Name:</strong> <%= request.getAttribute("customer").getCust_name() %></p>
        <p><strong>Email:</strong> <%= request.getAttribute("customer").getMailId() %></p>
        <p><strong>Phone Number:</strong> <%= request.getAttribute("customer").getPhone_number() %></p>
        <p><strong>Date of Birth:</strong> <%= request.getAttribute("customer").getDateofbirth() %></p>
        <!-- Add more customer details here as needed -->

        <!-- Add a logout button if required -->
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Logout" class="logout-button">
        </form>
    </div>
</div>
</body>
</html>
