<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
    <form method="post" action="LoginServlet">
      <input type="text" id="" class="fadeIn second" name="pNumber" placeholder="Phone Number">
      <input type="text" id="" class="fadeIn third" name="eMail" placeholder="Email">
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="Registration.jsp">Register</a>
    </div>

  </div>
</div>
</body>
</html>