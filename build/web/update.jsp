<%@page import="dao.UserDao"%>
<%@page import="model.UserModel"%>
<%@include file="header.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <% 
              int id= Integer.parseInt(request.getParameter("id"));
              String name= request.getParameter("name");
              String email= request.getParameter("email");
              String country= request.getParameter("country");
              
              UserModel UM= new UserModel();
              UM.setId(id);
              UM.setName(name);
              UM.setEmail(email);
              UM.setCountry(country);
              
            
             UserDao ud=new UserDao();
             if(ud.updateUser(UM)){%>
             <div class="container"><h3 class="text-center"><font>Record Updated</font></h3>   </div><% } %>
          
            
     

             <div class="container"><h3 class="text-center"><a href="index.jsp" <button  type="submit" class="btn btn-dark">Click Home Page</button></a></h3></div>
    </body>
</html>
