<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.Dao.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.Entities.Customer"%>
<%@page import="com.Entities.Shop"%>
<%@page import="com.Entities.Stock"%>
<%@page import="com.Entities.Medicine"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MedixCo App</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>

        body {
            font-family: 'Josefin Sans', sans-serif;
            font-family: 'Playfair Display', serif;
            background-image: url('19366.jpg');
                  background-repeat: no-repeat;
                  background-size: cover;

                 }
        .navbar {
            background-color: #f8f9fa;
            padding: 5px;
            margin-bottom: 20px;
        }

        .navbar-nav .nav-link {
            margin-right: 15px; /* Add margin between the navigation items */
        }


        .navbar-brand {
            font-weight: bold;
        }

        .search-bar {
            margin-right: 10px;
        }

        .dropdown-menu {
            min-width: 150px;
        }

        .dropdown-item {
            padding: 5px 10px;
        }

        .dropdown-item:hover {
            background-color: #f8f9fa;
        }

        .jumbotron {


            font-weight: bold;
            font-size: Largest;
            text-align: center;
            position: relative;
            opacity:80%;
        }

        .jumbotron h1 {
            animation: fadeInDown 1s ease-in;
            opacity:100%;
            font-color:#050505;

        }

        @keyframes fadeInDown {
            0% {
                opacity: 0;
                transform: translateY(-50px);
            }
            100% {
                opacity: 1;
                transform: translateY(0);
            }
        }

        @keyframes fadeInUp {
            0% {
                opacity: 0;
                transform: translateY(50px);
            }
            100% {
                opacity: 1;
                transform: translateY(0);
            }
        }
        #products-section {
            margin-top: 20px;
        }

        .card {
            margin-bottom: 20px;
        }

        .card-title {
            font-size: 18px;
            font-weight: bold;
        }

        .card-text {
            font-size: 14px;
        }

        select {
            margin-bottom: 10px;
        }

    </style>
</head>
<body>

<nav class="navbar">
    <a class="navbar-brand" href="#">
        <img src="MedixCo.png" alt="Logo" height="50">
    </a>
    <form class="form-inline search-bar" id="searchForm" action="SearchServlet">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="searchContent">
        <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
    </form>




        <a class="nav-link" href="About.jsp">About</a>
        <div class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="myProfileDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                My Profile
            </a>
            <div class="dropdown-menu" aria-labelledby="myProfileDropdown">

                <a class="dropdown-item" href="OrderHistoryServlet">Order History</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="LogoutServlet">Logout</a>
            </div>
        </div>
</nav>


<!-- Hero Section -->
<div class="jumbotron">
    <h1 class="animated fadeInDown">MedixCo</h1>
    <br>

</div>
 <div id="products-section">
        <div class="container">
            <div class="row">

                <%
                List<Medicine> medicineList = (List<Medicine>) request.getAttribute("medicineList");

                for(Medicine med: medicineList) {
                %>

                <div class="col-md-4">
                        <div class="card">
                          <div class="card-body">
                            <h5 class="card-title"> <%= med.getName()%> </h5>
                            <p class="card-text"> <%= med.getPrice()%> </p>
                            <p><b><%= med.getType()%></b></p>
                            <form action="CartServlet">

                              <input value="<%= med.getMedicineId()%>" name="medId" type="hidden"/>
                              <select name="quantity">
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                              </select>
                              <button type="submit" class="btn btn-primary">Add</button>
                            </form>

                          </div>
                        </div>
                    </div>
                        <%
                                }
                              %>
            </div>


<!-- Include Bootstrap JS -->


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>