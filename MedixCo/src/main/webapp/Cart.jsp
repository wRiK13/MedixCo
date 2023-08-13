<%@ page import="com.Dao.Cart" %>
<%@ page import="java.util.Map" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="com.Dao.FactoryProvider" %>
<%@ page import="com.Entities.Medicine" %>

<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cart</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            font-family: 'Josefin Sans', sans-serif;
            font-family: 'Playfair Display', serif;
            background-image: url('cart.jpg');
                        background-size: cover;
                        background-repeat: no-repeat;
                        background-position: center;
        }

        .container {
            padding: 20px;

            border-radius: 5px;

        }

        h2 {
        text-align:center;
            margin: 0;
            color: #333333;
            font-size: 24px;
        }

        table {
            margin-top: 20px;
            background-color: #ffffff;
            border-radius: 5px;
            box-shadow: 0 0px 0px rgba(0, 0, 0, 0.1);

        }

        th {
            font-weight: bold;
            color: #333333;
            font-size: 18px;
        }

        td {
            color: #666666;
        }

        .btn-primary,
        .btn-danger {
            margin-top: 10px;
            background-color: #007bff;
            color: #ffffff;
            border: none;
            transition: background-color 0.3s ease-in-out;
        }

        .btn-primary:hover,
        .btn-danger:hover {
            background-color: #0056b3;
        }
        .total-section {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
            align-items: center;
            justify-content: center;
        }
        .button-group {
          display: flex;
          justify-content: space-between;
        }

        .button-group form {
          display: flex;
          justify-content: flex-start;
        }

        .button-group form:first-child {
          justify-content: flex-end;

        }

    </style>
</head>

<body>
    <div class="container">
        <div>
            <h2>Your cart</h2>
        </div>
        <%
        Cart cart = (Cart) request.getAttribute("cart");
        Map<Integer, Integer> medicineMap = cart.getMedicineMap();
        Session s = FactoryProvider.getFactory().openSession();
        double amount = cart.getCartValue();
        %>
        <br>

        <table class="table">
            <thead>
                <tr>
                    <th>Product</th>
                    <th>Quantity</th>
                    <th>Total price</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                for (int id : medicineMap.keySet()) {
                    Medicine med = s.get(Medicine.class, id);
                    String name = med.getName();
                    int quantity = medicineMap.get(id);
                    double totalPrice = med.getPrice() * quantity;
                %>
                <tr>
                    <td><%= name%></td>
                    <td><%= quantity%></td>
                    <td><%= totalPrice%></td>
                    <td><a href="RemoveMedServlet?medId=<%= id%>" class="btn btn-danger">Remove</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
        <div class="total-section">
            <div>
                <h2>Your total cart value is: <%= amount%></h2>
                <div class="button-group">
                  <form action="DeleteCartServlet">
                    <button type="submit" class="btn btn-danger"> Clear  Cart </button>
                  </form>
                  <form action="AddressSelect.jsp">
                    <button type="submit" class="btn btn-primary">Confirm Order</button>
                  </form>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
