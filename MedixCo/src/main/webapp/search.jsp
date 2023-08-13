<!doctype html>
<html lang="en">
<head>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Josefin Sans', sans-serif;
            font-family: 'Playfair Display', serif;
        }

        .container {
            padding-top: 50px;
            text-align: center;
        }

        .container h1 {
            margin-bottom: 30px;
            font-size: 32px;
            font-weight: bold;
            color: #333;
        }

        .card {
            margin-bottom: 30px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border: none;
            transition: all 0.3s ease-in-out;
        }

        .card:hover {
            transform: translateY(-5px);
        }

        .card-img-top {
            height: 200px;
            object-fit: cover;
        }

        .card-title {
            margin-bottom: 10px;
            font-size: 20px;
            font-weight: bold;
            color: #333;
        }

        .card-text {
            margin-bottom: 10px;
            font-size: 16px;
            color: #777;
        }

        .add-button {
            margin-top: 10px;
        }

        .add-button:hover {
            background-color: #4CAF50;
        }
    </style>
    <title>Search Results</title>
</head>
<body>
<div class="container">
    <h1>Hope You Got What You Searched For</h1>
    <div class="row justify-content-center">
        <% for (Medicine med : medicineList) { %>
        <div class="col-md-4">
            <div class="card">
                <img src="https://via.placeholder.com/350x200" class="card-img-top" alt="Medicine Image">
                <div class="card-body">
                    <h5 class="card-title"><%= med.getName() %></h5>
                    <p class="card-text">Price: <%= med.getPrice() %></p>
                    <p class="card-text"><b>Type: <%= med.getType() %></b></p>
                    <form action="CartServlet">
                        <input value="<%= med.getMedicineId() %>" name="medId" type="hidden" />
                        <button type="submit" class="btn btn-primary add-button">Add to Cart</button>
                    </form>
                </div>
            </div>
        </div>
        <% } %>
    </div>
</div>
<!-- Include Bootstrap JS (optional) -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
