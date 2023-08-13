<!DOCTYPE html>
<html lang="en">



<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>



        .background {
            background-image: url('Registration.png');
            background-size:cover;
            background-repeat: no-repeat;
            background-position: center;
            position: relative;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;



        }



        .body {
            font-family: 'Josefin Sans', sans-serif;
                        font-family: 'Playfair Display', serif;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }



        .registration-card {
            width: 350px;
            padding: 30px;
            text-align: center;
            justify-content: center;
            box-shadow: 0 0 0px rgba(0, 0, 0, 0.1);
        }



        .registration-card h2 {



            text-align: center;
            color: #008037;
        }



        .registration-card img {
            width: 200px;
            height: 200px;
            margin-bottom: 20px;
        }



        .registration-card input[type="text"],
        .registration-card input[type="email"],
        .registration-card input[type="tel"],
        .registration-card input[type="date"],
        .registration-card input[type="password"]{
            width: 100%;
            display: block;
            margin-bottom: 10px;
            padding: 10px;
        }
        .registration-card button {
            margin-top: 20px;
            width: 50%;
            justify-content: center;
            padding: 10px 5px;
            color: white;
            border-radius: 4px;
            font-size: 14px;
            border: none;
            outline: none;
            background-color:#1446db;
        }
        .registration-card .show-password-checkbox {
            margin-bottom: 10px;
        }


        .error-message {
            color: red;
        }
    </style>
</head>



<body>
<div class="background">
    <div class="registration-card">
        <img src="MedixCo.png" alt="Logo">
        <h2>Registration Form</h2>
        <form id="registrationForm" action="RegistrationServlet">
            <input type="text" id="name" name="name" placeholder="Full Name" required>

            <input type="tel" id="mobile" name="mobile" placeholder="Mobile no." required>

            <input type="email" id="email" name="emailId" placeholder="Email" required>

            <input type="date" id="dateOfBirth" name="dateOfBirth" placeholder="Date of Birth" required>

            <input type="checkbox" id="showPasswordCheckbox" class="show-password-checkbox" onclick="togglePassword()">
            <label for="showPasswordCheckbox">Show Password</label>

            <input type="password" id="password" name="password" placeholder="Password" required>


            <input type="submit" value="Register" class="btn btn-primary">
        </form>
    </div>
</div>



<script>
    document.getElementById('registrationForm').addEventListener('submit', function(event) {
        var mobilePattern = /^\d{10}$/; // Regular expression to validate mobile number
        var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; // Regular expression to validate email address

        var name = document.getElementById('name').value;
        var mobile = document.getElementById('mobile').value;
        var email = document.getElementById('email').value;

        var errorMessages = [];

        if (!mobilePattern.test(mobile)) {
            errorMessages.push("Invalid mobile number");
        }

        if (!emailPattern.test(email)) {
            errorMessages.push("Invalid email address");
        }

        if (errorMessages.length > 0) {
            event.preventDefault();
            var errorMessageElement = document.createElement('div');
            errorMessageElement.className = 'error-message';
            errorMessageElement.innerHTML = errorMessages.join("<br>");
            this.appendChild(errorMessageElement);
        }
    });

    function togglePassword() {
        var passwordInput = document.getElementById('password');
        var showPasswordCheckbox = document.getElementById('showPasswordCheckbox');

        if (showPasswordCheckbox.checked) {
            passwordInput.type = 'text';
        } else {
            passwordInput.type = 'password';
        }
    }

    var showPasswordCheckbox = document.getElementById('showPasswordCheckbox');
    var passwordInput = document.getElementById('password');

    showPasswordCheckbox.addEventListener('change', togglePassword);
</script>

</body>



</html>