
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
            
              int id;
              id=Integer.parseInt((request.getParameter("id")));
              UserDao ud=new UserDao();
                    if(ud.deleteById(id)>0)
                    {
                    out.println("<font color=green size=7>Record Deleted........</font>");
                    }
                    else
                    out.println("<font color=red size=7>Record Not Deleted........</font>");
        %> 
        <button onclick="index.jsp" type="button" class="btn btn-dark">Home Page</button>
        </center>
    </body>
</html>
