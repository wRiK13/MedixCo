<!DOCTYPE html>
<html>
<head>
    <title>My Profile</title>
    <!-- Add any necessary CSS styles -->
</head>
<body>
    <h1>My Profile</h1>

    <%-- Retrieve the customer object from the server-side --%>
    <% com.Entities.Customer customer = (com.Entities.Customer) request.getAttribute("customer"); %>

    <%-- Display the customer details --%>
    <h2>Customer Information:</h2>
    <p>Name: <%= customer.getCust_name() %></p>
    <p>Email: <%= customer.getMailId() %></p>
    <p>Phone Number: <%= customer.getPhone_number() %></p>
    <p>Date of Birth: <%= customer.getDateofbirth() %></p>

    <%-- Add any additional information you want to display --%>

</body>
</html>
