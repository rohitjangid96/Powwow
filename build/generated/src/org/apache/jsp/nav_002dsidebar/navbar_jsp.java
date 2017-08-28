package org.apache.jsp.nav_002dsidebar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!--  Material Dashboard CSS    -->\n");
      out.write("    <link href=\"css/material-dashboard.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("    <link href=\"css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"../MDB Free/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'>\n");
      out.write("   \n");
      out.write("    \t<script src=\"js/jquery-3.1.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/material.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Charts Plugin -->\n");
      out.write("\t<script src=\"js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Notifications Plugin    -->\n");
      out.write("\t<script src=\"js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Material Dashboard javascript methods -->\n");
      out.write("\t<script src=\"js/material-dashboard.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css\">\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<nav class=\"navbar navbar-fixed-top navbar-info\" role=\"navigation\">\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("<!--\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\">Powwow</a>-->\n");
      out.write("<img src=\"../images/blacklogonew.png\" style=\"width: 80px; height: 50px;\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t        \t\t<li class=\"active\"><a href=\"#\">Edit your profile</a></li>\n");
      out.write("\t\t\t        \t\t<li><a href=\"#\">ask a question</a></li>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t    \t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t        \t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"material-icons\">person</i></a>\n");
      out.write("\t\t\t        \t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t  <li><a href=\"#\">Action</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  <li><a href=\"#\">Another action</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  <li><a href=\"#\">Something else here</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  <li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t  <li><a href=\"#\">Separated link</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  <li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\">Logout</a></li>\n");
      out.write("\t\t\t        \t\t\t</ul>\n");
      out.write("\t\t\t        \t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t\t<form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group  is-empty\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"material-input\"></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-white btn-round btn-just-icon\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"material-icons\">search</i><div class=\"ripple-container\"></div>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("\t<!--   Core JS Files   -->\n");
      out.write("\n");
      out.write("           \n");
      out.write("         </body>\n");
      out.write("</html>");
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
