package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.UserModel;
import dao.UserDao;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
List<UserModel> mylist;


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>User Management Application</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function myFunction() {\n");
      out.write("  // Declare variables\n");
      out.write("  let input;\n");
      out.write("  let input = document.getElementById(\"mySearch\");\n");
      out.write("  let filter = input.value.toUpperCase();\n");
      out.write("  let ul = document.getElementById(\"myMenu\");\n");
      out.write("  let  li = ul.getElementsByTagName(\"tr\");\n");
      out.write("\n");
      out.write(" \n");
      out.write("  for (var i = 0; i < li.length; i++) {\n");
      out.write("    let ableview = li[i].getElementsByTagName(\"td\")[1];\n");
      out.write("  \n");
      out.write("    if (let tableview.innerHTML.toUpperCase.indexOf(filter) > -1) {\n");
      out.write("      li[i].style.display = \"\";\n");
      out.write("    } else {\n");
      out.write("      li[i].style.display = \"none\";\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<header>\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-dark\"\n");
      out.write("            style=\"background-color: tomato\">\n");
      out.write("            <div>\n");
      out.write("                    <a href=\"index.jsp\" class=\"navbar-brand\"> User Management App</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                    <li><a href=\"index.jsp\" class=\"navbar-brand\"> User</a></li>\n");
      out.write("            </ul>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</header>\n");
      out.write(" <nav class=\"navbar navbar-light bg-light\">\n");
      out.write("  <form class=\"form-inline\" >\n");
      out.write("    <input class=\"form-control mr-sm-2\"\n");
      out.write("           id=\"mySearch\" type=\"text\" placeholtype=\"search\"der=\"Search\" aria-label=\"Search\"  onkeyup=\"myFunction()\">\n");
      out.write("    <button onclick=\"myFunction()\" class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("  </form>\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("<div class=\"row\">\n");
      out.write("   \n");
      out.write("    <div class=\"container\">\n");
      out.write("            <h3 class=\"text-center\">List of Users</h3>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"container text-left\">\n");
      out.write("\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/InsertUser.jsp\" class=\"btn btn-success\">Add\n");
      out.write("                            New User</a>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <ul id=\"myMenu\">\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                    <thead>\n");
      out.write("                            <tr>    \n");
      out.write("                                    <th>ID</th>\n");
      out.write("                                    <th>Name</th>\n");
      out.write("                                    <th>Email</th>\n");
      out.write("                                    <th>Country</th>\n");
      out.write("                                    <th>Actions</th>\n");
      out.write("                                    <th>Actions</th>\n");
      out.write("                            </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    \n");
      out.write("                    <tbody>\n");
      out.write("                        ");
 UserDao  ud= new UserDao();
                           mylist=ud.searchAll();
                            
      out.write("\n");
      out.write("                            ");
 
                         for(UserModel S:mylist)
                        {
                         
      out.write("\n");
      out.write("                         \n");
      out.write("                   <tr>\n");
      out.write("                       <td>");
      out.print(S.getId());
      out.write("</td>  \n");
      out.write("                       <td>");
      out.print(S.getName());
      out.write("</td>  \n");
      out.write("                       <td>");
      out.print(S.getEmail());
      out.write("</td>  \n");
      out.write("                       <td>");
      out.print(S.getCountry());
      out.write("</td>  \n");
      out.write("                       <td><a href=\"EditUser.jsp?id=");
      out.print(S.getId());
      out.write("\"/>Edit</a>\n");
      out.write("                       <td><a href=\"DeleteUser.jsp?id=");
      out.print(S.getId());
      out.write("\"/>Delete</a>\n");
      out.write("   </tr>  \n");
      out.write("   ");

    } 
  
      out.write("     \n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("            </table></ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
