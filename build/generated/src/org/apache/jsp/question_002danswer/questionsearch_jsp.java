package org.apache.jsp.question_002danswer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.questionanswermodel.RelatedQuestionModel;
import model.questionanswermodel.QuestionModel;
import java.util.ArrayList;

public final class questionsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
RelatedQuestionModel rqm=(RelatedQuestionModel)session.getAttribute("relques");
ArrayList<QuestionModel>alqm=null;

if(rqm!=null)
alqm=rqm.getRelatedque();

String utype=session.getAttribute("utype").toString();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write(" \n");
      out.write("    <style>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Ask question here...</title>\n");
      out.write("        <script src=\"../js/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"../js/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"../js/autocompleter.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("    var utype=\"");
      out.print(utype);
      out.write("\";\n");
      out.write("    \n");
      out.write("    function setReportButton(x)\n");
      out.write("{\n");
      out.write("    var repClass=document.getElementsByClassName(\"reportque\");\n");
      out.write("    if(utype===\"faculty\")\n");
      out.write("    {repClass[x].innerHTML=\"DELETE\";}\n");
      out.write("}\n");
      out.write("            \n");
      out.write("    function getXmlHttpRequestObject()\n");
      out.write("    {\n");
      out.write("    var xmlHttpReq;\n");
      out.write("\n");
      out.write("    if(window.XMLHttpRequest){\n");
      out.write("    request=new window.XMLHttpRequest();\n");
      out.write("    }\n");
      out.write("    else if(window.ActiveXObject){\n");
      out.write("    request=new window.ActiveXObject();\n");
      out.write("    }\n");
      out.write("    else{\n");
      out.write("    request=null;\n");
      out.write("    }\n");
      out.write("    return request;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function reportque(x)\n");
      out.write("    {\n");
      out.write("    \n");
      out.write("    var rep=document.getElementsByClassName(\"reportque\");\n");
      out.write("    var val=rep[x].value;\n");
      out.write("    var type;\n");
      out.write("    request=getXmlHttpRequestObject();\n");
      out.write("    request.onreadystatechange=showAlert;\n");
      out.write("    request.open(\"post\",\"../ReportQuestion\",true);\n");
      out.write("    request.setRequestHeader (\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("    if(rep[x].innerHTML===\"DELETE\")\n");
      out.write("        type=\"faculty\";\n");
      out.write("    \n");
      out.write("    else if(rep[x].innerHTML===\"REPORT ABUSE\")\n");
      out.write("        type=\"student\";\n");
      out.write("    \n");
      out.write("    val=val+\"&type=\"+type+\"&index=\"+x;\n");
      out.write("    var data=val;\n");
      out.write("    request.send(data);\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    function showAlert()\n");
      out.write("{\n");
      out.write("    if(request.readyState===4 && request.status===200){\n");
      out.write("       alert(request.responseText);\n");
      out.write("       location.reload();\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("}\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <a href=\"../MyFeed\">feed</a>\n");
      out.write("        \n");
      out.write("         <h1>SEARCH</h1> \n");
      out.write("        <form action=\"../AskQuestion\">\n");
      out.write("        <input type=\"text\" id=\"search\" name=\"search\" style=\"width: 40%\" class=\"search\" placeholder=\"SEARCH YOUR QUESTION HERE..\" onfocus=\"inputFocus(this)\" onblur=\"inputBlur(this)\"/>\n");
      out.write("        <input type=\"submit\" value=\"Search\" />\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <button id=\"myBtn\">Ask Question</button>\n");
      out.write("        <br><br>\n");
      out.write("        ");
if(rqm!=null && alqm!=null){
      out.write("\n");
      out.write("        <h1>RELATED QUESTIONS ARE</h1><br><br>\n");
      out.write("        ");
int i=0; 
        for(QuestionModel q : alqm){
      out.write("\n");
      out.write("        ");
      out.print(q.getUname()+" asked on "+q.getQuedate() );
      out.write(" <br>\n");
      out.write("        <a href=\"../AllAnswer?id=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(q.getQue());
      out.write("</a><button value=\"qid=");
      out.print(q.getQid());
      out.write("\" class=\"reportque\" onclick=\"reportque(");
      out.print(i);
      out.write(")\">REPORT ABUSE</button><br>\n");
      out.write("        <script>setReportButton(");
      out.print(i);
      out.write(");</script>\n");
      out.write("        DOMAIN :");
      out.print(q.getdName());
      out.write("<br>\n");
      out.write("        Tags   :\n");
      out.write("        ");
for(String tag:q.getTags())
            out.println(tag+" ");
      out.write("\n");
      out.write("            <br>");
if(q.getMostUpvotedAnswer()!=null && q.getMostUpvotedAnswer().length()>=150){
      out.print( "ANSWER:  "+q.getMostUpvotedAnswer().substring(0,149)+"...");
      out.write("<a href=\"../AllAnswer?id=");
      out.print(i);
      out.write("\">Read More</a>");

            }
            else if(q.getMostUpvotedAnswer()!=null){
      out.print( "ANSWER:  "+q.getMostUpvotedAnswer().substring(0,q.getMostUpvotedAnswer().length()));
}
      out.write("<hr>\n");
      out.write("        ");

          i++;
        }
        }
      out.write("\n");
      out.write("        <!-- The Modal -->\n");
      out.write("<div id=\"myModal\" class=\"modal\">\n");
      out.write("\n");
      out.write("  <!-- Modal content -->\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("    <div class=\"modal-header\">\n");
      out.write("      <span class=\"close\">&times;</span>\n");
      out.write("      <h2>WRITE YOUR QUESTION</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-body\">\n");
      out.write("        <form action=\"../PostQuestion\" method=\"get\">\n");
      out.write("            \n");
      out.write("            CHOOSE THE QUESTION DOMAIN <select name=\"domain\" ><option value=\"1\">Computer Science</option>\n");
      out.write("                                                                      <option value=\"2\">Mechanical</option>\n");
      out.write("                                                                      <option value=\"3\">Information Technology</option>\n");
      out.write("                                                                      <option value=\"4\">Electrical</option>\n");
      out.write("                                                                      <option value=\"5\">Electronics</option>\n");
      out.write("                                                                      </select>\n");
      out.write("            <br><br>\n");
      out.write("            <textarea rows=\"5\" cols=\"50\" name=\"askedquestion\" placeholder=\"Write your question here...\" ></textarea><br><br>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" name=\"tags\" placeholder=\"Add Your Relevant Tags\" id=\"tags\" style=\"width: 40%\"/><br><br>\n");
      out.write("       <input type=\"submit\" value=\"Post Question\"/>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<script>\n");
      out.write("// Get the modal\n");
      out.write("var modal = document.getElementById('myModal');\n");
      out.write("\n");
      out.write("// Get the button that opens the modal\n");
      out.write("var btn = document.getElementById(\"myBtn\");\n");
      out.write("\n");
      out.write("// Get the <span> element that closes the modal\n");
      out.write("var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("// When the user clicks the button, open the modal \n");
      out.write("btn.onclick = function() {\n");
      out.write("    modal.style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks on <span> (x), close the modal\n");
      out.write("span.onclick = function() {\n");
      out.write("    modal.style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
