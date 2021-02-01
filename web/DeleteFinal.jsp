
<%@page import="dao.UserDao"%>
<%@include  file="header.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <center>
       <% 
              String id1=session.getAttribute("ID").toString();
              int id=Integer.parseInt(id1);
              UserDao ud=new UserDao();
                    if(ud.deleteById(id)>0)
                    {%>
                    
                    <div class="container"><h3  class="text-center"><font>Record Deleted</font></h3></div>
      <%
                    }
                    else{
                        %>
                   <div class="container"><h3 class="text-center"><font>Record Not Deleted</font></h3>   </div>
       <%  }%><div class="container"><h3 class="text-right"><a href="index.jsp" <button  type="submit" class="btn btn-dark">Click Home Page</button></a></h3></div>
     </center>
    </body>
</html>
