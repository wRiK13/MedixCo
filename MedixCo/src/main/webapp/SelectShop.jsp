<%@page import="com.Entities.Shop"%>
<%@page import="java.util.List"%>



<!DOCTYPE html>
<html>
<head>
<title>MedixCo: Select Store</title>
<style>
        body {
            font-family: 'Josefin Sans', sans-serif;
                              font-family: 'Playfair Display', serif;
            background-image: url('1 (2).png');
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
            position: relative;
                        height: 100vh;
                        display: flex;
                        align-items: center;
                        justify-content: center;
        }



        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            text-align: center;
            margin-top: 20vh;
        }



        h1 {
            text-align: center;
            color: #333;
        }






        .shop-selection {
            text-align: center;
            margin-top: 30px;
        }



        .shop-selection label {
            font-weight: bold;
            color: #333;
        }



        .shop-selection select {
            padding: 8px;
            font-size: 16px;
            width: 100%;
            margin-top: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }



        .shop-selection input[type="submit"] {
            padding: 10px 20px;
            background-color: #1159cf;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
            margin-top: 10px;
            border-radius: 4px;
        }



        .shop-selection input[type="submit"]:hover {
            background-color: #119e68;
        }
</style>
<script>
        // Example JavaScript function to change the background color of the container
        function changeBackgroundColor() {
            var container = document.querySelector('.container');
            container.style.backgroundColor = 'lightblue';
        }
</script>
</head>
<body>
<div class="container">
<h1>Welcome to MedixCo!</h1>




        <% List<Shop> shopList = (List<Shop>) request.getAttribute("shopList"); %>
<div class="shop-selection">
<form action="HomeServlet" method="GET">
<label for="shop">Select a shop:</label>
<select id="shop" name="shop">
<option selected disabled>Please select a shop</option>
<% for (Shop shop : shopList) { %>
<option><%= shop.getName() %></option>
<% } %>
</select>
<input type="submit" value="Let's Go" onclick="changeBackgroundColor()">
</form>
</div>
</div>
</body>
</html>