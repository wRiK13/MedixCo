<%@page import="com.Dao.ShopProvider"%>
<%@page import="com.Entities.Shop"%>

<!DOCTYPE html>
<html>
<head>
  <title>Empty Cart</title>
  <style>
    body {
      font-family: 'Josefin Sans', sans-serif;
                  font-family: 'Playfair Display', serif;
      text-align: center;
      background-image: url('5862262.jpg');
                  background-size: cover;
                  background-repeat: no-repeat;
                  background-position: center;
                  position: relative;
                  height: 100vh;

    }

    .message {
      font-size: 24px;
      margin-top: 100px;
    }

    .button {
      display: inline-block;
      padding: 10px 20px;
      background-color: #1159cf;
      color: white;
      text-decoration: none;
      font-size: 16px;
      border-radius: 4px;
      margin-top: 20px;
    }

    .button:hover {
      background-color: #1183cf;
    }
  </style>
</head>
<body>
  <%
    String medName = request.getAttribute("medName").toString();
  %>
  <div class="message">
    <p><%= medName%> has been removed</p>
    <a href="HomeServlet?shop=<%= ShopProvider.getShop().getName()%>" class="button">Want to Order more</a>
    <a href="AddressSelect.jsp" class="button">Proceed to Checkout</a>
  </div>
</body>
</html>
