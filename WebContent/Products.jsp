<%@page import="model.User"%>
<%@page import="model.Items"%>
<%@page import="java.util.List"%>
<%@page import="model.ItemsDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 	<link rel="stylesheet" href="Style.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="jumbotron">
  <div class="container text-center">
     <img src="https://upload.wikimedia.org/wikipedia/commons/4/42/OLX_New_Logo.png" id="icon" alt="OLX" height="20%" width="20%" />    
    <p><i>Buy And Sell Anywhere In India For Free!</i></p>
  </div>
</div>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="Products.jsp">Products</a></li>
        <li><a href="#">Deals</a></li>
        <li><a href="#">Stores</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      
	 <ul class="nav navbar-nav navbar-right">
	 	<li>
	 	<form class="navbar-form" id="search" role="search" method="post" action="SearchProductsServlet">
                        <div class="form-group">
                            <input type="text" class="form-control" name="keyword" placeholder="Search">
                        </div>
                        <!-- <button type="submit" class="btn btn-default">Submit</button> -->
         </form>
         </li>
        <li> 
        <div class="dropdown">
        <a href="#" data-toggle="dropdown" class="dropdown-toggle glyphicon glyphicon-user">${user.firstName}<b class="caret"></b></a>
        <ul class="dropdown-menu">
            <li><a href="AddProduct.jsp">Add Product</a></li>
        </ul>
    </div></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li>
      </ul>
    </div>
  </div>
</nav>

<%
	List<Items> items=(List<Items>)session.getAttribute("items");
	out.println(items.size());
%>
<p style="align: center">You have  products</p>

<div class="container">   
  <div class="row">
   <div class="col-sm-4">
   <div class="panel panel-primary">
   <c:set var="i" value="1" />
   <TABLE>
   <tr>
  <c:forEach var="item" items="${items}">
   
  <c:choose>
  	<c:when test="${i%4!=0 }">
  		<TD>${item.itemName}</TD>
 		<TD><img alt="img" width=200 height=200 src="data:image/jpeg;base64,${item.image}"/></TD>
 		<TD><a href="#">BUY</a></TD>
  	</c:when>
  	<c:otherwise>
	<TR/>
	<TR> 
	<TD>${item.itemName}</TD>
 		<TD><img alt="img" width=200 height=200 src="data:image/jpeg;base64,${item.image}"/></TD>
 		<TD><a href="#">BUY</a></TD> 	
  	</c:otherwise>
  </c:choose>
  	<c:set var="i" value="${i+1 }" />
  </c:forEach>
  </TR>
  </TABLE> 
     </div>
    </div>
 </div>
 </div>


</body>
</html>