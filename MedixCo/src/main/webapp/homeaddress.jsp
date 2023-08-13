<!DOCTYPE html>
<html>
<head>
  <style>
    body {
      font-family: 'Josefin Sans', sans-serif;
                  font-family: 'Playfair Display', serif;
    }

    .container {
      max-width: 400px;
      margin: 0 auto;
      padding: 20px;
      border: 1px solid #ccc;
      border-radius: 5px;
      background-color: #f2f2f2;
    }

    .container h2 {
      text-align: center;
    }

    .container label {
      display: block;
      margin-bottom: 5px;
      font-weight: bold;
    }

    .container input[type="text"],
    .container select {
      width: 100%;
      padding: 8px;
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    .container input[type="submit"] {
      background-color: #1159cf;
      color: white;
      padding: 10px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      width: 100%;
    }

    .container input[type="submit"]:hover {
      background-color: #1183cf;
    }
  </style>
</head>
<body>
<div class="container">
  <h2>Address Form</h2>
  <form action="SaveAddressServlet">
<%--    <label for="houseNo">House No.:</label>--%>
<%--    <input type="text" id="houseNo" name="houseNo">--%>

<%--    <label for="street">Street:</label>--%>
<%--    <input type="text" id="street" name="street">--%>

<%--    <label for="locality">Locality:</label>--%>
<%--    <input type="text" id="locality" name="locality">--%>

<%--    <label for="city">City:</label>--%>
<%--    <input type="text" id="city" name="city">--%>

<%--    <label for="pin">ZIP Code:</label>--%>
<%--    <input type="text" id="pin" name="pin">--%>

<%--    <label for="landmark">Landmark:</label>--%>
<%--    <input type="text" id="landmark" name="landmark">--%>

<%--    <label for="mobile">Mobile No.:</label>--%>
<%--    <input type="text" id="mobile" name="mobile">--%>

<%--    <input type="submit" value="Submit">--%>

  <label for="houseNo">House No.:</label>
  <input type="text" id="houseNo" name="houseNo">

  <label for="street">Street:</label>
  <input type="text" id="street" name="street">

  <label for="block">Block:</label>
  <input type="text" id="block" name="block">

  <label for="locality">Locality:</label>
  <input type="text" id="locality" name="locality">

  <label for="landmark">Landmark:</label>
  <input type="text" id="landmark" name="landmark">

  <label for="city">City:</label>
  <input type="text" id="city" name="city" value="Kolkata" readonly>

  <label for="pin">ZIP Code:</label>
  <input type="number" id="pin" name="pincode" min="700001" max="700108">


  <label for="mobile">Mobile No.:</label>
  <input type="text" id="mobile" name="mobilenumber">

      <input type="submit" value="Submit">
  </form>
</div>
</body>
</html>
