<%@page import="java.util.List"%>
<%@page import="model.UserModel"%>
<%@page import="dao.UserDao"%>
<html>
<head>
<%! 
List<UserModel> mylist;

%>
<title>User Management Application</title>
<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
crossorigin="anonymous">
<script>
    function myFunction() {
  // Declare variables
  var input, filter, ul, li, a, i, txtValue;
  input = document.getElementById('mySearch');
  filter = input.value.toUpperCase();
  ul = document.getElementById("myMenu");
  li = ul.getElementsByTagName('tr');

  // Loop through all list items, and hide those who don't match the search query
  for (i = 1; i < li.length; i++) {
    a = li[i].getElementsByTagName("td")[0];
    txtValue = a.textContent || a.innerText;
    if (txtValue.toUpperCase().indexOf(filter) > -1) {
      li[i].style.display = "";
    } else {
      li[i].style.display = "none";
    }
  }
}
    
    
    
    
    

</script>
</head>


<body>
    
<header>
    <nav class="navbar navbar-expand-md navbar-dark"
            style="background-color: tomato">
            <div>
                    <a href="index.jsp" class="navbar-brand"> User Management App</a>
            </div>

            <ul class="navbar-nav">
                    <li><a href="index.jsp" class="navbar-brand"> User</a></li>
            </ul>
    
    
</header>
 <nav class="navbar navbar-light bg-light">
  <form class="form-inline" >
    <input class="form-control mr-sm-2"
    id="mySearch" type="text" placeholder="search" der="Search" aria-label="Search"  onkeyup="myFunction()">
  </form>
</nav>
    
<div class="row">
   
    <div class="container">
            <h3 class="text-center">List of Users</h3>
            <hr>
            <div class="container text-right">

            <a href="InsertUser.jsp" class="btn btn-success">Add New User</a>
            </div>
            <br>
            <ul >
            <table class="table table-bordered" id="myMenu">
                    
                            <tr>    
                                    <th>Name</th>
                                    <th>Email</th>
                                    <th>Country</th>
                                    <th>Actions</th>
                                    <th>Actions</th>
                            </tr>
                    
                    
                    
                        <% UserDao  ud= new UserDao();
                           mylist=ud.searchAll();
                            %>
                            <% 
                         for(UserModel S:mylist)
                        {
                         %>
                         
                   <tr>
                       <td><%=S.getName()%></td>  
                       <td><%=S.getEmail()%></td>  
                       <td><%=S.getCountry()%></td>  
                       <td><a href="EditUser.jsp?id=<%=S.getId()%>"/>Edit</a>
                       <td><a href="DeleteUser.jsp?id=<%=S.getId()%>"/>Delete</a>
                  </tr>  
   <%
    } 
  %>     

                  

            </table></ul>
    </div>
</div>
</body>
</html>
