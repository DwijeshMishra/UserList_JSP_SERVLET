<%@include  file="header.jsp"%>
<%@page import="dao.UserDao" %>
<jsp:useBean class="model.UserModel" id="UM">
    <jsp:setProperty property="*" name="UM"></jsp:setProperty>  
</jsp:useBean>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <% 
     UserDao ud=new UserDao();
         if(ud.insertUser(UM)>0)
             out.println("<h5>Record Inserted........</h5>");
    %>
<button onclick="index.jsp" type="button" class="btn btn-dark">Home Page</button>
    </body>
</html>
