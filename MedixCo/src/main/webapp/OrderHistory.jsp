<%@page import="java.util.List"%>
<%@page import="com.Entities.OrderMed"%>

<!DOCTYPE html>
<html>
<head>
    <title>Your Orders</title>
    <style>
        body {
            font-family: 'Josefin Sans', sans-serif;
            font-family: 'Playfair Display', serif;
            margin: 0;
            padding: 20px;

             background-image: url('1 (2).png');
             background-repeat: no-repeat;
             background-size: cover;
        }

        h1 {
            color: #333;
            margin-bottom: 20px;
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 0px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
            font-weight: bold;
            text-align: center;
            color: #333;
            text-transform: uppercase;
        }

        td {
            color: #666;
        }

        .button {
            padding: 8px 16px;
            background-color:#1159cf;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 14px;
            transition: background-color 0.3s ease;
        }

        .button:hover {
            background-color:  #4CAF50;
        }
    </style>


</head>
<body>
<h1>Your Orders</h1>

<table>
    <thead>
    <tr>
        <th>Order Id</th>
        <th>Medicines Ordered</th>
        <th>Delivered to</th>
        <th>Cart Value</th>
        <th>Feedback</th>
        <th>Reorder</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<OrderMed> orderList = (List<OrderMed>) request.getAttribute("orderList");

        // Iterate over the previous orders and display them in the table rows
        for (OrderMed order : orderList)
        {
    %>
    <tr>
        <td><%= order.getOrderId() %></td>
        <td><%= order.getOrderedMedicines().toString() %></td>
        <td><%= order.getCartValue() %></td>
        <td><%= order.getAddress().toString() %></td>
        <td>
            <form action="FeedbackServlet">
                <input type="hidden" name="order-id" value="<%= order.getOrderId() %>">
                <button class="button" type="submit">Give Feedback</button>
            </form>
        </td>
        <td>
            <form action="ReorderServlet">
                <input type="hidden" name="order-id" value="<%= order.getOrderId() %>">
                <button class="button" type="submit">Reorder</button>
            </form>
        </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>

