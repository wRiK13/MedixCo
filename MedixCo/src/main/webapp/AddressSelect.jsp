<!DOCTYPE html>
<html>
<head>
<title>Delivery Address</title>
<style>
body {
font-family: 'Josefin Sans', sans-serif;
            font-family: 'Playfair Display', serif;
margin: 0;
padding: 20px;
background-image: url('address.png');
                        background-size: cover;
                        background-repeat: no-repeat;
                        background-position: center;
                        position: relative;
                                    height: 100vh;


}

h1 {
text-align: center;
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
}

.address-form {
max-width: 400px;
margin: 0 auto;
background-color: #f5f5f5;
padding: 20px;
border-radius: 5px;
}

.address-fields {
display: none;
}

.address-fields label {
display: block;
margin-top: 10px;
font-weight: bold;
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
background-color: #1159cf;
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
<h1>Delivery Address</h1>

<form class="address-form" action="OrderConfirmServlet" onsubmit="return validateForm()">
<div class="address-option">
<input type="radio" id="address-option1" name="delivery-option" value="your-address" checked>
<label for="address-option1">Deliver to my address</label>
</div>

<div class="address-option">
<input type="radio" id="address-option2" name="delivery-option" value="other-address">
<label for="address-option2">Deliver to a different address</label>
</div>

<div class="address-fields" id="other-address-details">
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
</div>

<button class="submit-button" type="submit">Proceed to make payment</button>


</form>

<script>
// Toggle visibility of the other address fields based on selected option
const addressOption2 = document.getElementById("address-option2");
const otherAddressFields = document.getElementById("other-address-details");

addressOption2.addEventListener("change", function() {
if (this.checked) {
otherAddressFields.style.display = "block";
} else {
otherAddressFields.style.display = "none";
}
});

// Form validation function
function validateForm() {
const addressOption1 = document.getElementById("address-option1");
const addressOption2 = document.getElementById("address-option2");
const otherAddressFields = document.getElementById("other-address-details");

if (addressOption1.checked) {
return true; // Allow form submission without further validation
} else if (addressOption2.checked) {
// Check if "Deliver to a different address" is selected and any required fields are empty
const requiredFields = document.querySelectorAll(".address-fields input[required]");
for (let i = 0; i < requiredFields.length; i++) {
if (requiredFields[i].value.trim() === "") {
alert("Please fill out all required address fields.");
return false; // Prevent form submission
}
}
}

return true; // Allow form submission
}
</script>

</body>
</html>