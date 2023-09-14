<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.doctorapp.spring.jdbc.model.Patient" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Patient</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2>Add Patient</h2>
        <form action="process-patient-form" method="POST">
            <div class="form-group">
                <label for="patientid">Patient ID:</label>
                <input type="number" class="form-control" id="patientid" name="patientid" required>
            </div>
            <div class="form-group">
                <label for="patientname">Patient Name:</label>
                <input type="text" class="form-control" id="patientname" name="patientname" required>
            </div>
            <div class="form-group">
                <label for="patientage">Age:</label>
                <input type="number" class="form-control" id="patientage" name="patientage" required>
            </div>
            <div class="form-group">
                <label for="patientgender">Gender:</label>
                <select class="form-control" id="patientgender" name="patientgender" required>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Other">Other</option>
                </select>
            </div>
            <div class="form-group">
                <label for="patientmobilenumber">Mobile Number:</label>
                <input type="tel" class="form-control" id="patientmobilenumber" name="patientmobilenumber" required>
            </div>
            <button type="submit" class="btn btn-primary">Add Patient</button>
        </form>
    </div>
    <!-- Include Bootstrap JS and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
