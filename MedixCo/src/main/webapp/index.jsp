<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .background {
            background-image: url('Login.png');
            background-size: cover;
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

        .login-card {
            width: 350px;
            padding: 20px;
            text-align: center;
            box-shadow: 0 0 0px rgba(0, 0, 0, 0.1);
        }

        .login-card img {
            width: 200px;
            height: 200px;
            margin-bottom: 20px;
        }


        .login-card input[type="text"],
        .login-card input[type="password"] {
            width: 100%;
            height: 40px;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-sizing: border-box; /* Add this property to include padding and border in the width */
        }

        #email {
            width: 100%;
            height: 40px;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-sizing: border-box; /* Include padding and border in the width */
        }


        .login-card input[type="email"] {
           margin-bottom: 20px;
        }

        .login-card input[type="password"] {
            margin-bottom: 20px;
        }


        .login-card button {
            margin-top: 20px;
            width: 80%;
        }

        p {
            color: black;
            font-weight: bold;
        }

        .register-link {
            cursor: pointer;
        }
    </style>
</head>

<body>
<div class="background">

    <div class="login-card">
        <img src="MedixCo.png" alt="Logo">
        <form id="LoginForm" action="LoginServlet">
            <input type="email" name = "email" id="email" placeholder="Enter Your Email Id" required>
            <input type="password" name = "password" id="password" placeholder="Password" required>
            <div>
                <input type="checkbox" id="showPasswordCheckbox" onchange="togglePasswordVisibility()">
                <label for="showPasswordCheckbox">Show Password</label>
            </div>
            <button type="submit" class="btn btn-primary" onclick="validateEmail()">Login</button>
        </form>
        <div>
            <br>
            <p onclick="location.href='Registration.jsp'" class="register-link">Didn't register yet? Register here</p>
        </div>
    </div>
</div>

<script>
    function validateEmail() {
        var emailInput = document.getElementById("email");
        var email = emailInput.value;
        var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailRegex.test(email)) {
            alert("Please enter a valid email address.");
            emailInput.focus();
            return false;
        }
    }

    function togglePasswordVisibility() {
        var passwordInput = document.getElementById("password");
        var showPasswordCheckbox = document.getElementById("showPasswordCheckbox");
        if (showPasswordCheckbox.checked) {
            passwordInput.type = "text";
        } else {
            passwordInput.type = "password";
        }
    }
</script>
</body>

</html>
