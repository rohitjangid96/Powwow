package org.apache.jsp.register_0020pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

               String msg = request.getParameter("msg");
               if(msg!=null)
               {
                   switch(Integer.parseInt(msg))
                   {
                       case 1: 
                           out.print("User Save Successfully !");
                           break;
                       case 2: 
                           out.print("Server Connection Failed !");
                           break;
                       case 3: 
                           out.print("SQL Error !");
                           break;
                   }
               }
            
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>THANKS FOR REGISTRATION</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css\">\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js\"></script>\n");
      out.write("         <style>\n");
      out.write("             body{\n");
      out.write("               /*   background-color: black;*/\n");
      out.write("                  \n");
      out.write("                background-image: url(\"images/startup-3.jpg\");\n");
      out.write("                   \n");
      out.write("                background-size: cover;\n");
      out.write("              \n");
      out.write("                    background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div  align=\"center\" class=\"ui container\" style=\"padding-top: 100px\">\n");
      out.write("       <button id=\"b6\" onclick=\"verify()\" class=\"ui animated blue button\" value=\"Show Div\" >\n");
      out.write("           <span class=\"visible content\">VERIFY HERE</a></span>\n");
      out.write("                <span class=\"hidden content\"><i class=\"right arrow icon\"></i></span>\n");
      out.write("           </button>\n");
      out.write("       </div>\n");
      out.write("  \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function verify(){\n");
      out.write("                document.location=\"https://mail.google.com/mail/\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("            \n");
      out.write("                 </body>\n");
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
