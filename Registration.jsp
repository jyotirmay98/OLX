<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Style.css">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>OLX - Buy And Sell Anywhere In India For Free</title>
</head>
<body>
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
      <img src="https://upload.wikimedia.org/wikipedia/commons/4/42/OLX_New_Logo.png" id="icon" alt="OLX" height="40%" width="40%" />
    </div>

    <!-- Registration Form -->
 		<form method="post" action="RegisterServlet">
		<table>
		<tr>
		<td><b>First Name :</b></td>
		<td><input type="text" class="fadeIn second" name="fName"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Last Name :</b></td>
		<td><input type="text" class="fadeIn third" name="lName"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Date Of Birth :</b></td>
		<td><input type="date" name="dOB"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Gender :</b></td>
		<td>
		<select name="Gender">
		<option value="male">Male</option>
		<option value="female">Female</option>
		</select>
		</td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Contact Number :</b></td>
		<td><input type="text" class="fadeIn second" name="pNumber"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>User ID :</b></td>
		<td><input type="text" class="fadeIn third" name="uid"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Password :</b></td>
		<td><input type="password" class="fadeIn second" name="password"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Email :</b></td>
		<td><input type="email" class="fadeIn third" name="eMail"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Address</b></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Street :</b></td>
		<td><input type="text" class="fadeIn second" name="street"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Sub Location :</b></td>
		<td><input type="text" class="fadeIn third" name="sLocation"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>City :</b></td>
		<td><input type="text" class="fadeIn second" name="city"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>State :</b></td>
		<td><select name="stateslist">
			<option value="">Select State</option>
			<option value="1">Andaman And Nicobar Islands</option>
			<option value="2">Andhra Pradesh</option>
			<option value="3">Arunachal Pradesh</option>
			<option value="4">Assam</option>
			<option value="5">Bihar</option>
			<option value="6">Chandigarh</option>
			<option value="7">Chhattisgarh</option>
			<option value="8">Dadra And Nagar Haveli</option>
			<option value="9">Daman And Diu</option>
			<option value="10">Delhi</option>
			<option value="11">Goa</option>
			<option value="12">Gujarat</option>
			<option value="13">Haryana</option>
			<option value="14">Himachal Pradesh</option>
			<option value="15">Jammu And Kashmir</option>
			<option value="16">Jharkhand</option>
			<option value="17">Karnataka</option>
			<option value="18">Kerala</option>
			<option value="19">Lakshadweep</option>
			<option value="20">Madhya Pradesh</option>
			<option value="21">Maharashtra</option>
			<option value="22">Manipur</option>
			<option value="23">Meghalaya</option>
			<option value="24">Mizoram</option>
			<option value="25">Nagaland</option>
			<option value="26">Odisha</option>
			<option value="27">Pondicherry</option>
			<option value="28">Punjab</option>
			<option value="29">Rajasthan</option>
			<option value="30">Sikkim</option>
			<option value="31">Tamil Nadu</option>
			<option value="32">Tripura</option>
			<option value="33">Uttaranchal</option>
			<option value="34">Uttar Pradesh</option>
			<option value="35">West Bengal</option>
			</select>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Country :</b></td>
		<td><input type="text" class="fadeIn third" name="country"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><b>Pin Code :</b></td>
		<td><input type="text" class="fadeIn second" name="pCode"></td>
		</tr>
		<tr style="height:50px;">
		</tr>
		<tr>
		<td><button type="submit" class="fadeIn fourth">Submit</button></td>
		</tr>
		</table>
		</form>

</div>
</div>
</body>
</html>