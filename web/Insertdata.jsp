
<%@include file="header.jsp"%>
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
              <center>
    <% 
     UserDao ud=new UserDao();
         if(ud.insertUser(UM)>0)%>
         
         <div class="container"><h3 style="text-align:center" class="text-center"><font>Record Inserted</font></h3>   </div>
         <div class="container"><h3 class="text-right"><a href="index.jsp" <button  type="submit" class="btn btn-dark">Click Home Page</button></a></h3></div>
    </center></body>
</html>

    
   