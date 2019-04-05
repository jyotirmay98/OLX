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

    <!-- Login Form -->
    <form method="post" action="AddProductServlet" enctype="multipart/form-data">
	  <table>
	  <tr>
	  <td>Item Name :</td>
	  <td><input type="text" id="" class="fadeIn second" name="itemName" placeholder="Item Name"></td>
	  </tr>
	  <tr>
	  <td>Category ID :</td>
	  <td><input type="text" id="" class="fadeIn third" name="category" placeholder="Category ID"></td>
	  </tr>
	  <tr>
	  <td>Years Of Usage :</td>
	  <td><input type="text" id="" class="fadeIn second" name="yearsOfUsage" placeholder="Years Of Usage"></td>
	  </tr>
	  <tr>
	  <td>Item ID :</td>
	  <td><input type="text" id="" class="fadeIn third" name="ID" placeholder="Item ID"></td>
	  </tr>
	  <tr>
	  <td>Item Image :</td>
	  <td><input type="file" id="" class="fadeIn second" name="image" placeholder="Item Image"></td>
	  </tr>
	  <tr>
	  <td>Item Price :</td>
	  <td><input type="text" id="" class="fadeIn third" name="price" placeholder="ItemPrice"></td>
	  </tr>
	   <tr>
  <td>User ID :</td>
	  <td><input type="text" id="" class="fadeIn third" name="uid" placeholder="User ID"></td>
	  </tr>
	  <tr>
	  <td><input type="submit" class="fadeIn fourth" value="Add"></td>	
	  </tr>
	  </table>
	  </form>
	  </div>
	  </div>
	  </body>
</html>