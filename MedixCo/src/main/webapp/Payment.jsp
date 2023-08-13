<!DOCTYPE html>
<html>
<head>
<title>Payment Form</title>
<style>
body {
font-family: 'Josefin Sans', sans-serif;
font-family: 'Playfair Display', serif;
margin: 0;
padding-right: 20%;
padding-left: 20%;
 background-image: url('payment.png');
                        background-size: cover;
                        background-repeat: no-repeat;
                        background-position: center;
                        position: relative;
                                                            height: 100vh;

}

h2 {
text-align: center;
margin-bottom: 30px;
}

.form-group {
margin-bottom: 20px;
}

label {
display: block;
font-weight: bold;
margin-bottom: 5px;
}

input[type="text"],
select {
width: 100%;
padding: 8px;
border: 1px solid #ccc;
border-radius: 4px;
box-sizing: border-box;
}

input[type="password"],
select {
width: 100%;
padding: 8px;
border: 1px solid #ccc;
border-radius: 4px;
box-sizing: border-box;
}

.payment-details {
background-color: #fff;
padding: 20px;
border-radius: 4px;
box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

#card-details,
#cash-details {
display: none;
}

button[type="submit"] {
background-color:#1159cf;
color: #fff;
padding: 10px 20px;
border: none;
border-radius: 4px;
cursor: pointer;
}

button[type="submit"]:hover {
background-color: #1159cf;
}
</style>
<script>
window.addEventListener('DOMContentLoaded', function() {
var paymentMethod = document.getElementById('payment-method');
var cardDetails = document.getElementById('card-details');
var cashDetails = document.getElementById('cash-details');

// Initially hide the card details
cardDetails.style.display = 'none';

paymentMethod.addEventListener('change', function() {
if (paymentMethod.value === 'card') {
cardDetails.style.display = 'block';
cashDetails.style.display = 'none';
enableCardFields();
} else if (paymentMethod.value === 'cash') {
cardDetails.style.display = 'none';
cashDetails.style.display = 'block';
disableCardFields();
}
});

function enableCardFields() {
var cardFields = cardDetails.querySelectorAll('input[type="text"], input[type="password"]');
cardFields.forEach(function(field) {
field.required = true;
});
}

function disableCardFields() {
var cardFields = cardDetails.querySelectorAll('input[type="text"], input[type="password"]');
cardFields.forEach(function(field) {
field.required = false;
});
}
});

</script>
</head>
<body>
<h2>Payment Form</h2>
<div class="payment-details">
<form action="PaymentServlet">
<div class="form-group">
<label for="payment-method">Payment Method:</label>
<select id="payment-method" name="payment-method">
<option value="cash">Cash</option>
<option value="card">Card</option>
</select>
</div>
<div class="form-group" id="card-details">
<label for="card-number">Card Number:</label>
<input type="text" id="card-number" name="card-number" placeholder="Enter card number" required>
<label for="expiry-date">Expiry Date:</label>
<input type="text" id="expiry-date" name="expiry-date" placeholder="MM/YY" required>
<label for="cvv">CVV:</label>
<input type="password" id="cvv" name="cvv" placeholder="Enter CVV" required>
<label for="login-password">MedixCo Login Password:</label>
<input type="password" id="login-password" name="login-password" placeholder="Enter password" required>
</div>
<div class="form-group" id="cash-details">
<%-- <label for="cash-amount">Cash Amount:</label>--%>
<%-- <input type="text" id="cash-amount" name="cash-amount" placeholder="Enter cash amount">--%>
</div>
<%-- <form action="PaymentServlet" method="post">--%>
<button type="submit">Confirm Order</button>
<%-- </form>--%>

</form>
</div>
</body>
</html>