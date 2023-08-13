<%@page import="com.Entities.DeliveryPartner"%>
<%@page import="com.Entities.Shop"%>
<%@page import="java.util.List"%>
<%@page import="com.Dao.ShopProvider"%>
<%@page import="com.Dao.CartProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.query.Query"%>

<!DOCTYPE html>
<html>
<head>
    <title>Order Placed</title>
    <style>
      body {

            font-family: 'Josefin Sans', sans-serif;
            font-family: 'Playfair Display', serif;
            margin: 0;
            padding: 20px;
            padding-bottom:30%;
            background-image: url("last.png");
            background-size: cover;
            background-position: center;
            text-align: center;

          }
      }


      h1 {
        color: #4CAF50;
        font-size: 28px;
        margin-bottom: 20px;


      }

      p {
        font-size: 18px;
        margin-bottom: 30px;
      }

      .delivery-person {
        font-weight: bold;
        margin-bottom: 20px;
        color: #333;
      }

      .button {
        display: inline-block;
        padding: 10px 20px;
        background-color: #1159cf;
        color: #fff;
        text-decoration: none;
        border-radius: 4px;
        font-size: 16px;
        transition: background-color 0.3s ease;
      }

      .button:hover {
        background-color: #1159cf;
      }
    </style>

</head>
<body>
    <%
        DeliveryPartner partner = (DeliveryPartner) request.getAttribute("partner");
        String shop = ShopProvider.getShop().getName();

        CartProvider.setCart(null);
    %>
    <h1>Your Order Has Been Successfully Placed</h1>
    <p class="delivery-partner"><%= partner.getName()%> will arrive with your order shortly.</p>
    <p>For providing any other information such as directions to your house, you may contact at: <%= partner.getMobile()%>.</p>
    <a href="HomeServlet?shop=<%= shop%>" class="button">Go Back to Home</a>
    <a href="LogoutServlet" class="button">Log Out</a>
</body>
</html>
