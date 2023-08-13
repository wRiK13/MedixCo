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
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background-image: url('empty.png');
                        background-size: cover;
                        background-repeat: no-repeat;
                        background-position: center;
    }

    .message {
          padding: 20px;
          background-color: #ffffff;
          border-radius: 4px;
          box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        .message p {
          font-size: 24px;
          margin-bottom: 20px;
        }

        .button-group {
          display: flex;
          justify-content: center;
          gap: 10px;
        }

        .button {
          display: inline-block;
          padding: 10px 20px;
          background-color: #1159cf;
          color: white;
          text-decoration: none;
          font-size: 16px;
          border-radius: 4px;
        }

        .button:hover {
          background-color: #1159cf;
        }
      </style>
</head>
<body>

  <div class="message">


    <p>There are no items in the cart</p>
    <div class="button-group">
    <a href="HomeServlet?shop=<%= ShopProvider.getShop().getName()%>" class="button">Let's go</a>
    </div>
  </div>
</body>
</html>
