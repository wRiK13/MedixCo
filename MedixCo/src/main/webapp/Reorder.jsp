<%@page import="com.Dao.ShopProvider"%>
<%@page import="com.Entities.Shop"%>
<%@ page import="com.Dao.ShopProvider" %>

<!DOCTYPE html>
<html>
<head>
  <title>Cart Confirmation</title>
  <style>
    body {
      font-family: 'Josefin Sans', sans-serif;
                  font-family: 'Playfair Display', serif;
      background-color: #f2f2f2;
    }

    .container {
      max-width: 600px;
      margin: 50px auto;
      background-color: #fff;
      padding: 20px;
      text-align: center;
      border-radius: 5px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    h1 {
      color: #333;
    }

    .action-buttons {
      display: flex;
      justify-content: center;
      gap: 10px;
      margin-top: 20px;
    }

    .action-buttons button {
      padding: 10px 20px;
      font-size: 16px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    .action-buttons button.proceed {
      background-color: #4CAF50;
      color: #fff;
    }

    .action-buttons button.order-more {
      background-color: #2196F3;
      color: #fff;
    }
  </style>
</head>
<body>
<%
  String store = ShopProvider.getShop().getName();
%>
<div class="container">
  <h1>Items Successfully Added to Your Cart</h1>
  <div class="action-buttons">
    <form action="AddressSelect.jsp">
      <button class="proceed">Proceed to Checkout</button>
    </form>
    <form action="HomeServlet">
      <input type="hidden" name="store" value="<%= store%>">
      <button class="order-more">Order More Medicines</button>
    </form>
  </div>
</div>
</body>
</html>
