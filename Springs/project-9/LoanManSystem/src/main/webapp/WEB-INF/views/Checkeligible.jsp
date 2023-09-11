<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loan EMI Calculator</title>

<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f0f0f0;
    text-align: center;
  }

  h1 {
    background-color: #007bff;
    color: #fff;
    padding: 10px 0;
  }

  form {
    max-width: 400px;
    margin: 0 auto;
    padding: 20px;
    background-color: #fff;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }

  label {
    display: block;
    margin-bottom: 10px;
    font-weight: bold;
  }

  input[type="number"] {
    width: 100%;
    padding: 8px;
    margin-bottom: 15px;
    border: 1px solid #ccc;
    border-radius: 3px;
  }

  button {
    display: block;
    width: 100%;
    padding: 10px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 3px;
    cursor: pointer;
  }

  #result {
    margin-top: 15px;
    font-weight: bold;
  }

  #eligibility {
    margin-top: 15px;
    font-weight: bold;
  }
</style>

</head>
<body>
<h1>Know your eligibility</h1>

<form action="check" method="GET">
  <label for="annual">Annual Income:</label>
  <input type="number" id="annual" name="annual" oninput="calculateAmount()" required>

  <label for="dsamount">Disposal Amount:</label>
  <input type="number" id="dsamount" name="dsamount" readonly>

  <label for="lar">Loan Amount Requested:</label>
  <input type="number" id="lar" name="lar" required>

  <label for="nom">No of months:</label>
  <input type="number" id="nom" name="nom" required>

  <button onclick="calculateAndDisplay()">Display EMI</button>

  <p id="result">Result:</p>

  <p id="eligibility"></p>
</form>

<script>
  function calculateAmount() {
    var annualamount = parseFloat(document.getElementById('annual').value);
    var monthly = annualamount / 12;
    var disposal = (monthly * 0.30);
    document.getElementById('dsamount').value = disposal.toFixed(2);
  }

  function calculateAndDisplay() {
    var d = parseFloat(document.getElementById('dsamount').value);
    var p = parseFloat(document.getElementById('lar').value);
    var n = parseFloat(document.getElementById('nom').value);
    var r = (3 / 12) / 100;
    var result = (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    document.getElementById('result').textContent = 'Result: ' + result.toFixed(2);

    if (result <= d) {
      document.getElementById('eligibility').textContent = 'You are eligible!';
    } else {
      document.getElementById('eligibility').textContent = 'You are not eligible.';
    }
    event.preventDefault();
  }
</script>

</body>
</html>