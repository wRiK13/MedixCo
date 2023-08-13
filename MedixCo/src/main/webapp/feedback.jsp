<%@page import="com.Entities.OrderMed"%>
<%@page import="com.Entities.DeliveryPartner"%>

<!DOCTYPE html>
<html>
<head>
  <title>Order Feedback</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 20px;
      background-color: #f4f4f4;
    }

    h1 {
      text-align: center;
      color: #333;
    }

    .address-option {
      display: flex;
      align-items: center;
      margin-bottom: 10px;
    }

    .address-option input[type="radio"] {
      margin-right: 10px;
    }

    .address-option label {
      font-weight: bold;
      color: #333;
    }

    .address-form {
      max-width: 400px;
      margin: 0 auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    .address-fields {
      display: none;
    }

    .address-fields label {
      display: block;
      margin-top: 10px;
      font-weight: bold;
      color: #333;
    }

    .address-fields input[type="text"],
    .address-fields input[type="number"],
    .address-fields textarea {
      width: 100%;
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    .submit-button {
      display: block;
      margin-top: 10px;
      padding: 10px;
      background-color:  #1159cf;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    .submit-button:hover {
      background-color: #1183cf;
    }
  </style>
</head>
<body>
<h1>Order Feedback</h1>

<%
  OrderMed order = (OrderMed) request.getAttribute("order");
  DeliveryPartner partner = (DeliveryPartner) request.getAttribute("person");
  int partnerId = partner.getDeliverypartnerId();
%>

<form action="GiveFeedbackServlet">
  <input type="hidden" name="partnerId" value="<%= partnerId%>">
  <div class="form-group">
    <label for="orderId">Order ID:</label>
    <input type="text" id="orderId" name="orderId" readonly value="<%= order.getOrderId() %>">
  </div>

  <div class="form-group">
    <label for="medicinesOrdered">Medicines Ordered:</label>
    <textarea id="medicinesOrdered" name="medicinesOrdered" readonly><%= order.getOrderedMedicines() %></textarea>
  </div>

  <div class="form-group">
    <label for="cartValue">Cart Value:</label>
    <input type="text" id="cartValue" name="cartValue" readonly value="<%= order.getCartValue() %>">
  </div>

  <div class="form-group">
    <label for="deliveryPerson">Delivery Partner:</label>
    <input type="text" id="deliveryPerson" name="deliveryPerson" readonly value="<%= partner.getName() %>">
  </div>

  <div class="form-group">
    <label for="rating">Rating:</label>
    <input type="number" id="rating" name="rating" min="1" max="10" required>
  </div>

  <div class="form-group">
    <label for="comment">Comment:</label>
    <textarea id="comment" name="comment" rows="4" required></textarea>
  </div>

  <button class="submit-button" type="submit">Submit</button>
</form>
</body>
</html>
