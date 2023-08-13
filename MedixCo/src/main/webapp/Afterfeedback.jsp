<%@page import="com.Dao.ShopProvider"%>
<!DOCTYPE html>
<html>
<head>
  <title>Thank You</title>
  <style>
    body {
      font-family: 'Josefin Sans', sans-serif;
      font-family: 'Playfair Display', serif;
      margin: 0;
      padding: 20px;
      background-color: #f4f4f4;
    }

    .container {
      max-width: 400px;
      margin: 0 auto;
      background-color: #fff;
      padding: 20px;
      text-align: center;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h1 {
      color: #333;
      margin-bottom: 20px;
    }

    .button-container {
      text-align: center;
      margin-top: 20px;
    }

    .button {
      padding: 10px 20px;
      background-color: #4CAF50;
      color: #fff;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
    }

    .button:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>

<%
  String shop = ShopProvider.getShop().getName();
%>

<div class="container">
  <h1>Thank you for your valuable feedback!</h1>
  <div class="button-container">
    <form action="HomeServlet">
      <input type="hidden" name="shop" value="<%= shop%>">
      <button class="button">Go Back to Home</button>
    </form>
  </div>
</div>
</body>
</html>
