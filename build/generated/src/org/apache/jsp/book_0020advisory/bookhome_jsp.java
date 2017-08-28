package org.apache.jsp.book_0020advisory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>BOOK ADVISORY</title>\n");
      out.write("         \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css\">\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js\"></script>\n");
      out.write("        \n");
      out.write("         <script>\n");
      out.write("      var request;\n");
      out.write("      function showSub(){\n");
      out.write("       var branch=document.getElementById(\"selbranch\").value;\n");
      out.write("       var sem=document.getElementById(\"selsem\").value;\n");
      out.write("       \n");
      out.write("       request=new XMLHttpRequest();\n");
      out.write("       request.onreadystatechange=getSub;\n");
      out.write("       request.open(\"get\", \"../GetSubjectController?branch=\"+branch+\"&sem=\"+sem, true);\n");
      out.write("       request.send(null);\n");
      out.write("      }\n");
      out.write("      function getSub(){\n");
      out.write("        // if(request.readystate==4 && request.status==200){\n");
      out.write("            if(request.status==200 && request.readyState==4)\n");
      out.write("             document.getElementById(\"selsub\").innerHTML=request.responseText;\n");
      out.write("         //}\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <style>\n");
      out.write("             .select1{\n");
      out.write("                width: 60%; \n");
      out.write("             /*  align-content: center;\n");
      out.write("               align-items: center;*/\n");
      out.write("                 font-size: 20px; \n");
      out.write("                 padding: 12px;\n");
      out.write("              /*  border: solid 1px red;*/\n");
      out.write("                margin: auto;\n");
      out.write("              /*  box-shadow: inset 1px 1px 2px 0 #707070;*/\n");
      out.write("              /*transition: box-shadow 0.3s, border 0.3s;*/\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>BOOK ADVISORY</h1>\n");
      out.write("         <div class=\"ui large modal\" >\n");
      out.write("  \n");
      out.write("  <div class=\"header\" align=\"center\">\n");
      out.write("    SEARCH BOOK\n");
      out.write("  </div>\n");
      out.write("  <div class=\"image content\"  >\n");
      out.write("   \n");
      out.write("      <form action=\"../SearchBookController\" method=\"post\" >\n");
      out.write("          <select onchange=\"showSub()\" name=\"branch\"   id=\"selbranch\"  class=\"ui selection dropdown\" required >\n");
      out.write("                  <option value=\"\" disabled selected>BRANCH</option>\n");
      out.write("                 <option  value=\"Computer Science\">COMPUTER SCIENCE</option>\n");
      out.write("                 <option value=\"Electronics Communication\">ElECTRONICS COMMUNICATION</option>\n");
      out.write("                 <option value=\"Civil\">CIVIL</option>\n");
      out.write("                 <option value=\"Mechanical\">MECHANICAL</option>\n");
      out.write("                 <option value=\"Fire Technology\">FIRE TECHNOLOGY</option>\n");
      out.write("                 <option value=\"Chemical\">CHEMICAL</option>\n");
      out.write("                 <option value=\"Electrical And Electronics\">ElECTRICAL AND ELECTRONICS</option>\n");
      out.write("                     </select>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      \n");
      out.write("      <select id=\"selsem\"  onchange=\"showSub()\"  name=\"sem\"  class=\"ui selection dropdown\" >\n");
      out.write("                  <option value=\"\" disabled selected>SEMESTER</option>\n");
      out.write("                 <option value=\"1\">I</option>\n");
      out.write("                 <option value=\"2\">II</option>\n");
      out.write("                 <option value=\"3\">III</option>\n");
      out.write("                 <option value=\"4\">IV</option>\n");
      out.write("                 <option value=\"5\">V</option>\n");
      out.write("                 <option value=\"6\">VI</option>\n");
      out.write("                 <option value=\"7\">VII</option>\n");
      out.write("                 <option value=\"8\">VIII</option>\n");
      out.write("                     </select>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("     \n");
      out.write("      <select name=\"subject\" id=\"selsub\"  class=\"ui selection dropdown\" required>\n");
      out.write("                  <option value=\"\" disabled selected>SUBJECT</option>\n");
      out.write("<!--                 <option value=\"Micro Processor and Interfacing\">CS-601 Micro Processor and Interfacing</option>\n");
      out.write("                 <option value=\"Principles Of Programming Languages PPL\">CS-602 Principles Of Programming Languages PPL</option>\n");
      out.write("                 <option value=\"Software Engineering and Project Management SEPM\">CS-603 Software Engineering and Project Management SEPM</option>\n");
      out.write("                 <option value=\"Computer Networking CN\">CS-604 Computer Networking CN</option>\n");
      out.write("                 <option value=\"Advance Computer Architecture ACA\">CS-605 Advance Computer Architecture ACA</option>\n");
      out.write("                 -->\n");
      out.write("                 \n");
      out.write("                     </select>\n");
      out.write("      \n");
      out.write(" \n");
      out.write("                 \n");
      out.write("                     </select>\n");
      out.write("          <div  style=\"display: none\">\n");
      out.write("              <input type=\"submit\" value=\"submit\" id=\"booksearch\">\n");
      out.write("          </div>\n");
      out.write("   </form> \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("              <div class=\"actions\"  id=\"qwerty\">\n");
      out.write("      \n");
      out.write("<!--      <div class=\"ui positive right labeled icon button\"  >-->\n");
      out.write("      <button id=\"b6\" onclick=\"searchbooksubmit()\" class=\"ui huge animated green button\" value=\"Show Div\"  >\n");
      out.write("                <span class=\"visible content\">Yep, that's OK</span>\n");
      out.write("                <span class=\"hidden content\"><i class=\"pointing right icon\"></i></span>\n");
      out.write("                </button>\n");
      out.write("<!--      <i class=\"checkmark icon\"></i>-->\n");
      out.write("<!--    </div>-->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("             \n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $('.ui.modal').modal('setting', 'closable', false).modal('show');\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            $('#selbranch').dropdown();\n");
      out.write("            $('#selsub').dropdown();\n");
      out.write("            $('#selsem').dropdown();\n");
      out.write("            function searchbooksubmit ()\n");
      out.write("            { \n");
      out.write("//                var a=0,b=0,c;\n");
      out.write("//                a=(document.getElementById(\"selbranch\")).value;\n");
      out.write("//                b=(document.getElementById(\"selsem\")).value;\n");
      out.write("//                c=(document.getElementById(\"selsub\")).value;\n");
      out.write("//                if(a&&b)\n");
      out.write("//                document.write(\"enter choiceeeeeeeee\"+a+\"     \"+b+\"     \"+c);\n");
      out.write("               $('#booksearch').click();\n");
      out.write("            }\n");
      out.write(" \n");
      out.write("   \n");
      out.write("        </script>\n");
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
