<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment Schedule</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        width: 80%;
        padding: 20px;
        background-color: #ffffff;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    label {
        display: block;
        margin-bottom: 8px;
    }

    input[type="text"],
    input[type="time"] {
        width: 100%; /* Adjusted width for full width of the container */
        padding: 10px;
        margin-bottom: 12px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="checkbox"] {
        margin-right: 6px;
    }

    button {
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

    <div class="container">
    <h1>Doctor Scheduler</h1>
        <form id="dayForm" action="raju" method="post">
            <label for="doct_id">Doctor ID:</label>
            <input type="text" id="doct_id" name="doct_id">
            
             <label>Select available days:</label>
            <label><input type="checkbox" name="day" value="U"> Sunday</label>
            <label><input type="checkbox" name="day" value="M"> Monday</label>
            <label><input type="checkbox" name="day" value="T"> Tuesday</label>
            <label><input type="checkbox" name="day" value="W"> Wednesday</label>
            <label><input type="checkbox" name="day" value="H"> Thursday</label>
            <label><input type="checkbox" name="day" value="F"> Friday</label>
            <label><input type="checkbox" name="day" value="S"> Saturday</label>

            <input type="hidden" name="dcsc_schedule" id="dcsc_schedule" value="">

            <label for="dcsc_avl_from">Available From:</label>
            <input type="time" id="dcsc_avl_from" name="dcsc_avl_from">

            <label for="dcsc_avl_to">Available To:</label>
            <input type="time" id="dcsc_avl_to" name="dcsc_avl_to">

            <label for="dcsc_app_slot">Appointment Slot:</label>
            <input type="time" id="dcsc_app_slot" name="dcsc_app_slot">

            <button type="button" id="submitButton">Submit</button>
        </form>
    </div>

    <script>
        document.getElementById('submitButton').addEventListener('click', function() {
            const checkboxes = document.querySelectorAll('input[name="day"]:checked');
            let selectedValues = '';

            checkboxes.forEach(function(checkbox) {
                selectedValues += checkbox.value;
            });

            document.getElementById('dcsc_schedule').value = selectedValues;

            document.getElementById('dayForm').submit();
        });
    </script>
</body>
</html>
