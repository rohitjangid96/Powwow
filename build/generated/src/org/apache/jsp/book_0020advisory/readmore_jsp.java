package org.apache.jsp.book_0020advisory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.bookmodel.BookCommentModel;
import java.util.ArrayList;
import model.bookmodel.BookAdvisoryModel;

public final class readmore_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>BOOK ADVISORY</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css\">\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js\"></script>\n");
      out.write("\n");
      out.write("         <style>\n");
      out.write("             #bookimage{\n");
      out.write("                 position: absolute;\n");
      out.write("                 left: 50px;\n");
      out.write("                 top: 100px;\n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("             #namerating{\n");
      out.write("                 position: absolute;\n");
      out.write("                 left: 500px;\n");
      out.write("                 top: 220px;\n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("             #ratingsdiv{\n");
      out.write("                 position: absolute;\n");
      out.write("                 left: 900px;\n");
      out.write("                 top: 220px;\n");
      out.write("             }\n");
      out.write("             #price{\n");
      out.write("                 position: absolute;\n");
      out.write("                 left: 100px;\n");
      out.write("                 top: 500px;\n");
      out.write("             }    \n");
      out.write("             \n");
      out.write("             #desc{\n");
      out.write("                 position: absolute;\n");
      out.write("                 left: 500px;\n");
      out.write("                 top: 400px;\n");
      out.write("             }\n");
      out.write("             #homepage{\n");
      out.write("                 position: absolute;\n");
      out.write("                 left: 1250px;\n");
      out.write("                 top: 100px;\n");
      out.write("             }\n");
      out.write("             #comments{\n");
      out.write("                 position: absolute;\n");
      out.write("                 left: 450px;\n");
      out.write("                 top: 500px;\n");
      out.write("             }\n");
      out.write("             \n");
      out.write("            \n");
      out.write("         </style>\n");
      out.write("          <script>\n");
      out.write("      var request;\n");
      out.write("      function rate(x){\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       request=new XMLHttpRequest();\n");
      out.write("       request.onreadystatechange=getSub;\n");
      out.write("       request.open(\"get\", \"../BookRatingController?rate=\"+x, true);\n");
      out.write("       request.send(null);\n");
      out.write("      }\n");
      out.write("      function getSub(){\n");
      out.write("        // if(request.readystate==4 && request.status==200){\n");
      out.write("            if(request.status==200 && request.readyState==4)\n");
      out.write("             document.getElementById(\"avgstar\").innerHTML=request.responseText;\n");
      out.write("         //}\n");
      out.write("         $('.ui.second.rating').rating('disable');\n");
      out.write("      }\n");
      out.write("      function delcomment(cid){\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       request=new XMLHttpRequest();\n");
      out.write("       request.onreadystatechange=afterdel;\n");
      out.write("       request.open(\"get\", \"../DelCommentController?cid=\"+cid, true);\n");
      out.write("       request.send(null);\n");
      out.write("      }\n");
      out.write("      function afterdel(){\n");
      out.write("          \n");
      out.write("          if(request.status==200 && request.readyState==4)\n");
      out.write("               $('#subdelcomment').click();\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            session=request.getSession(); 
           BookAdvisoryModel bm=(BookAdvisoryModel)session.getAttribute("readmorebook");
           String subject=(String)session.getAttribute("subjectsession");
         
         
      out.write("\n");
      out.write("         \n");
      out.write("         <div id=\"homepage\">\n");
      out.write("             <a href=\"../login pages/home.jsp?msg=1\">\n");
      out.write("             <button class=\"ui inverted violet button\">HOME</button>\n");
      out.write("             </a>\n");
      out.write("         </div>\n");
      out.write("         <h1 align=\"center\" style=\"color: blue; background-color: yellow; font-size: 48px\">");
      out.print(subject);
      out.write("</h1>\n");
      out.write("         \n");
      out.write("         <div id=\"bookimage\">\n");
      out.write("         <img src=\"");
      out.print("../BookImageLoader?bcover="+bm.getBookcover());
      out.write("\" style=\"height: 350px; width: 350px\">\n");
      out.write("         </div>   \n");
      out.write("         <div id=\"namerating\">\n");
      out.write("             <b style=\"color: blue;  font-size: 48px\">");
      out.print(bm.getBookname());
      out.write("</b><br/><br/>\n");
      out.write("\n");
      out.write("             written by  :&nbsp;&nbsp;&nbsp;&nbsp; <b style=\"color: red;  font-size: 36px\"> ");
      out.print(bm.getBookauthor());
      out.write("</b>\n");
      out.write("          \n");
      out.write("         </div>\n");
      out.write("              \n");
      out.write("             <div id=\"ratingsdiv\">\n");
      out.write("               \n");
      out.write("                 <p><br/>\n");
      out.write("                     ");
 
                         int userrating=0;
                                 userrating=(int)session.getAttribute("userrating");
                         boolean ratedisable=false;
                                 ratedisable=(boolean)session.getAttribute("ratedisable");
                           if(ratedisable)
                           {   System.out.println("USERRATING="+userrating);
                     
      out.write("\n");
      out.write("                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   YOUR RATING:   \n");
      out.write("                     <div class=\"ui massive third star rating\" data-rating=\"");
      out.print(userrating);
      out.write("\" data-max-rating=\"5\" id=\"ratestar\"></div>\n");
      out.write("                     ");

                           }else
                              {
                            
                     
      out.write("\n");
      out.write("                      \n");
      out.write("                     \n");
      out.write("   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   RATE NOW:\n");
      out.write("   <div class=\"ui massive second star rating\" data-rating=\"0\" data-max-rating=\"5\" id=\"ratestar\" ></div>\n");
      out.write("                             ");
   } 
                                session.setAttribute("ratedisable", false);
                             
      out.write("\n");
      out.write("                 </p>\n");
      out.write("             </div>                         \n");
      out.write("                \n");
      out.write("                 <div id=\"price\" style=\"font-size: 32px; color: red\">\n");
      out.write("                    \n");
      out.write("                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                 <div class=\"ui massive  star rating\" data-max-rating=\"1\">   </div> <b id=\"avgstar\" style=\"font-size: 36px\" id=\"ratestar\">");
      out.print((float)bm.getBookrating());
      out.write("/5</b>\n");
      out.write("                     <br/><br/>\n");
      out.write("                     PRICE: <b style=\"font-size: 44px; color: blue\"><i class=\"rupee icon\"></i>");
      out.print(bm.getBookprice());
      out.write("<b/>\n");
      out.write("                 </div>\n");
      out.write("                 <div id=\"desc\" style=\"font-size: 22px; color: black\">\n");
      out.write("                     description :<br/><br/>\n");
      out.write("                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                     ");
      out.print(bm.getBookdesc());
      out.write("\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                     <br/><br/>\n");
      out.write("                     <h2 style=\"color: blue\">COMMENTS:</h2>\n");
      out.write("                     <hr>\n");
      out.write("                 \n");
      out.write("                ");

                  ArrayList <BookCommentModel> arrbcm=(ArrayList) session.getAttribute("commentarray");
                  String userid=(String)session.getAttribute("logeduserccode");
                   for(BookCommentModel bcm : arrbcm)
                   {
                
      out.write("\n");
      out.write("                 <div class=\"ui comments\" >\n");
      out.write("  <div class=\"comment\">\n");
      out.write("    <a class=\"avatar\">\n");
      out.write("        <img src=\"");
      out.print(bcm.getCommentorprofileimgpath());
      out.write("\">\n");
      out.write("    </a>\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <a class=\"author\">");
      out.print(bcm.getCommentorname());
      out.write("</a>\n");
      out.write("      <div class=\"metadata\">\n");
      out.write("        <div class=\"date\">");
      out.print(bcm.getTimestamp());
      out.write("</div>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      <div class=\"text\">\n");
      out.write("       ");
      out.print(bcm.getComment());
      out.write("\n");
      out.write("      \n");
      out.write("      ");

          if(userid.equalsIgnoreCase(bcm.getCommentorid()))
          {
              System.out.println("hhhhhhhhhhhhhhhhhhhhhhh");
      
      out.write("\n");
      out.write("      <div class=\"metadata\" >\n");
      out.write("          <div class=\"date\"  > <button onclick=\"delcomment(");
      out.print(bcm.getCommentid());
      out.write(")\">DELETE</button></div>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      ");
  }  
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       ");

           }
       
      out.write("\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                  \n");
      out.write("                 <form class=\"ui reply form\" action=\"../BookCommentController\" method=\"post\">\n");
      out.write("                  <div class=\"field\">\n");
      out.write("                <textarea rows=\"4\" cols=\"80\" name=\"commenttext\"></textarea>\n");
      out.write("                  </div>\n");
      out.write("    \n");
      out.write("                         <button class=\"ui inverted violet button\" onclick=\"submitcomment()\">COMMENT</button>\n");
      out.write("          \n");
      out.write("        <div style=\"display: none\">\n");
      out.write("            <input type=\"submit\" id=\"commentsubmit\">;\n");
      out.write("        </div>\n");
      out.write("  </form>\n");
      out.write("                 </div>        \n");
      out.write("                 \n");
      out.write("       <div style=\"display: none\">\n");
      out.write("           <form action=\"../ReadMoreController\" method=\"post\">\n");
      out.write("           <input type=\"text\" name=\"bookidinput\" value=\"");
      out.print(bm.getBookid());
      out.write("\">\n");
      out.write("           <input type=\"submit\" id=\"subdelcomment\">\n");
      out.write("           </form>\n");
      out.write("       </div>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("         <script >\n");
      out.write("    $('.ui.rating').rating({\n");
      out.write("      initialRating: 1,\n");
      out.write("      interactive: false\n");
      out.write("  });\n");
      out.write("  \n");
      out.write("  $('.ui.second.rating').rating({interactive : true}).rating('setting', 'onRate', function(value) {\n");
      out.write("      \n");
      out.write("      rate(value);\n");
      out.write("      \n");
      out.write("  });\n");
      out.write("  \n");
      out.write("  $('.ui.third.rating').rating({\n");
      out.write("       interactive: false\n");
      out.write("  });\n");
      out.write("  \n");
      out.write("  \n");
      out.write("function submitcomment()\n");
      out.write("{\n");
      out.write("    $('#commentsubmit').click();\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </script>\n");
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
