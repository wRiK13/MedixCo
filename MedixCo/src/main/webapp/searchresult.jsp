<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.Dao.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.Entities.Customer"%>
<%@page import="com.Entities.Shop"%>
<%@page import="com.Entities.Stock"%>
<%@page import="com.Entities.Medicine"%>


<!doctype html>
<html lang="en">
<head>
  <!-- Include Bootstrap CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: 'Josefin Sans', sans-serif;
                  font-family: 'Playfair Display', serif;
                  background-image: url('1 (2).png');
                        background-repeat: no-repeat;
                        background-size: cover;
                        position: relative;
                                    height: 100vh;
                                    display: flex;
                                    align-items: center;
                                    justify-content: center;
    }

    .container {
      position: relative;
      height: 100vh;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
    }

    .card {
      width: 300px;
      margin-bottom: 20px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }

    .card-body {
      padding: 20px;
    }

    .card-title {
      font-size: 20px;
      font-weight: bold;
      margin-bottom: 10px;
    }

    .card-text {
      font-size: 16px;
      margin-bottom: 10px;
    }

    .form-group {
      margin-bottom: 10px;
    }

    .btn-add {
      width: 100%;
      padding: 10px;
      background-color: #1159cf;
      color: white;
      border: none;
      cursor: pointer;
      font-size: 16px;
      transition: background-color 0.3s ease-in-out;
    }

    .btn-add:hover {
      background-color: #45a049;
    }
  </style>
  <title>Home</title>

</head>
<body>

<div class="container">
  <h1>Hope You Got What You Searched For</h1>
  <br>
  <%
    List<Medicine> medicineList = (List<Medicine>) request.getAttribute("medicineList");

    for(Medicine med: medicineList) {
  %>

  <div class="card">
    <div class="card-body">
      <h5 class="card-title"> <%= med.getName()%> </h5>
      <p class="card-text"> <%= med.getPrice()%> </p>
      <p><b><%= med.getType()%></b></p>
      <form action="CartServlet">
        <div class="form-group">
          <input value="<%= med.getMedicineId()%>" name="medId" type="hidden"/>
          <select name="quantity" class="form-control">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
          </select>
        </div>
        <button type="submit" class="btn btn-add">Add</button>
      </form>
    </div>
  </div>
  <% } %>
</div>

<!-- Include Bootstrap JS (optional) -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
