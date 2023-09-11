<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
        }

        h1 {
            text-align: center;
            color: #086925;
        }

        form {
            text-align: center;
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        }

        label {
            font-weight: bold;
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"],
        input[type="date"],
        input[type="password"],
        input[type="email"],
        input[type="tel"] {
            
            width: 70%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            background-color: #04553a;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Registration Form</h1>
    <form action="register" method="post" onsubmit="return showSuccessAlert();">
    
    
        <label for="username">Username</label>
        <input type="text" id="username" name="username" required>

        <label for="usercdate">Date of Creation</label>
        <input type="date" id="usercdate" name="usercdate" required>

        <label for="usertype">User Type</label>
        <input type="text" id="usertype" name="usertype" required>

        <label for="userpwd">Password</label>
        <input type="password" id="userpwd" name="userpwd" required>

        <label for="useremail">Email</label>
        <input type="email" id="useremail" name="useremail" required>

        <label for="userrecoveryemail">Recovery Email</label>
        <input type="email" id="userrecoveryemail" name="userrecoveryemail">

        <label for="usermobile">Mobile</label>
        <input type="tel" id="usermobile" name="usermobile"><br><br>

        <input type="submit" value="Register">
    </form>
<script>
        function showSuccessAlert() {
            //You can customize the message and appearance of the alert box here
            alert("Registration successful!");
            return true; // Submit the form
        }
    </script>
</body>
</html>