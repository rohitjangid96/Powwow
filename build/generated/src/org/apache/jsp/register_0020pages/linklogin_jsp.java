package org.apache.jsp.register_0020pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class linklogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Link Login</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js\">\n");
      out.write("\n");
      out.write("          <style>\n");
      out.write("              body{\n");
      out.write("               /*   background-color: black;*/\n");
      out.write("                  \n");
      out.write("                background-image: url(\"../images/background.jpg\");\n");
      out.write("                   \n");
      out.write("                background-size: cover;\n");
      out.write("              \n");
      out.write("                    background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("          </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("         <form action=\"../LinkLoginController\" method=\"post\">\n");
      out.write("        <div  style=\"position: absolute; left: 500px; top: 200px;\">\n");
      out.write("            <div class=\"ui huge labeled input\">\n");
      out.write("             <div class=\"ui huge blue label\">\n");
      out.write("                              E-mail \n");
      out.write("             </div>\n");
      out.write("    \n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"powwow@powwow.com\" style=\"width: 320px;\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br/><br/>\n");
      out.write("             <div class=\"ui huge labeled input\">\n");
      out.write("             <div class=\"ui huge blue label\">\n");
      out.write("                              Password \n");
      out.write("             </div>\n");
      out.write("    \n");
      out.write("                   <input type=\"password\" name=\"pass\" placeholder=\"password\" style=\"width: 289.9px\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br/><br/>\n");
      out.write("            <div class=\"ui huge labeled input\">\n");
      out.write("             <div class=\"ui huge blue label\">\n");
      out.write("                             OTP\n");
      out.write("             </div>\n");
      out.write("    \n");
      out.write("                   <input type=\"password\" name=\"otpval\" placeholder=\"One Time Password\" style=\"width: 336px\">\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Login\" id=\"loginsubmit\" style=\"display: none\">\n");
      out.write("              <br/><br/>\n");
      out.write("              <button class=\"ui huge  black  button\" onclick=\"sub()\" style=\"position: relative; left: 150px;\">Submit</button>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("         </form>\n");
      out.write("       \n");
      out.write("            \n");
      out.write("<!--            <table align=\"center\" cellpadding=\"20\" cellspacing=\"15\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                            \n");
      out.write("                <tr>\n");
      out.write("                    <td>E_MAIL</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td>PASSWORD</td>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td>OTP</td>\n");
      out.write("                    <td><input type=\"string\" name=\"otpval\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"5\">\n");
      out.write("                        <input type=\"submit\" value=\"Login\">\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>-->\n");
      out.write("        \n");
      out.write("<script>\n");
      out.write("    function sub()\n");
      out.write("    {\n");
      out.write("//        document.write(\"ssmiamis\");\n");
      out.write("        $('#loginsubmit').click();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("    </body>\n");
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
