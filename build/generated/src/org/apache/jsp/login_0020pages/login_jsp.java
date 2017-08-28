package org.apache.jsp.login_0020pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Cookie c[] = request.getCookies();
String v1="",v2="";
if(c!=null)
{
for(int i=0;i<c.length;i++)
{ 
    String name= c[i].getName();
    if(name.equals("email"))
    {
       v1=c[i].getValue();
       
    }else if(name.equals("pass"))
    {
       v2=c[i].getValue();
    }
}
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js\">\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            #log{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 325px;\n");
      out.write("               \n");
      out.write("                height:50%;\n");
      out.write("                 width:50%;\n");
      out.write("                 font-family:Helvetica;\n");
      out.write("                 color:#fff;\n");
      out.write("                 background:rgba(0,0,0,0.3);\n");
      out.write("                /* background-color: gray;*/\n");
      out.write("                 background-color: #A9D0F5;\n");
      out.write("                 padding:30px 0px;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("             </head>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("    <body>\n");
      out.write("     <br/><br/><br/>\n");
      out.write("        <form action=\"../VerifyUserController\" method=\"post\">\n");
      out.write("           \n");
      out.write("           \n");
      out.write("        <div align=\"center\" id=\"log\">\n");
      out.write("          <div  align=\"center\" > \n");
      out.write("               <h1>POWWOW</h1>\n");
      out.write("         <div class=\"ui huge  left icon input\">\n");
      out.write("            <input type=\"text\" placeholder=\"Email\" name=\"email\" value=\"");
      out.print(v1);
      out.write("\">\n");
      out.write("            <i class=\"user icon\"></i>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("            <br/><br/>\n");
      out.write("         <div class=\"ui huge left icon input\">\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" name=\"pass\" value=\"");
      out.print(v2);
      out.write("\">\n");
      out.write("            <i class=\"key icon\"></i>\n");
      out.write("         </div>\n");
      out.write("           <br/><br/>\n");
      out.write("           <div class=\"ui fitted toggle checkbox\">\n");
      out.write("      <input type=\"checkbox\" value=\"yes\" name=\"isRemember\">\n");
      out.write("      <label>Remember me</label>\n");
      out.write("    </div>\n");
      out.write("           <br/><br/>\n");
      out.write("           <div class=\"ui blue input\">\n");
      out.write("               <input type=\"submit\" value=\"Sign-in\">\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("<!--           <button id=\"b2\" onclick=\"z2()\" class=\"ui large circular animated blue button\"  >\n");
      out.write("                <span class=\"visible content\">Sign in</span>\n");
      out.write("                <span class=\"hidden content\"><i class=\"right arrow icon\"></i></span>\n");
      out.write("           </button>\n");
      out.write("            -->\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
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
