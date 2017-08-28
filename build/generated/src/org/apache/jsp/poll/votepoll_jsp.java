package org.apache.jsp.poll;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.pollmodel.CreateNewPollModel;

public final class votepoll_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>VOTE FOR POLL</title>\n");
      out.write("           <!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("/* bootstrap css*/\n");
      out.write("\n");
      out.write("\n");
      out.write(".progress {\n");
      out.write("  height: 35px;\n");
      out.write("  width: 565px;\n");
      out.write("  column-width: 565px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".progress .skill {\n");
      out.write("  font: normal 12px \"Open Sans Web\";\n");
      out.write("  line-height: 35px;\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0 0 0 20px;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write(".progress .skill .val {\n");
      out.write("  float: right;\n");
      out.write("  font-style: normal;\n");
      out.write("  margin: 0 20px 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress-bar {\n");
      out.write("  text-align: left;\n");
      out.write("  transition-duration: 3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/*radio button*/\n");
      out.write(" #qid {\n");
      out.write("  padding: 10px 15px;\n");
      out.write("  -moz-border-radius: 50px;\n");
      out.write("  -webkit-border-radius: 50px;\n");
      out.write("  border-radius: 20px;\n");
      out.write("}\n");
      out.write("label.btn {\n");
      out.write("    padding: 18px 60px;\n");
      out.write("    white-space: normal;\n");
      out.write("    -webkit-transform: scale(1.0);\n");
      out.write("    -moz-transform: scale(1.0);\n");
      out.write("    -o-transform: scale(1.0);\n");
      out.write("    -webkit-transition-duration: .3s;\n");
      out.write("    -moz-transition-duration: .3s;\n");
      out.write("    -o-transition-duration: .3s\n");
      out.write("}\n");
      out.write("\n");
      out.write("label.btn:hover {\n");
      out.write("    text-shadow: 0 3px 2px rgba(0,0,0,0.4);\n");
      out.write("    -webkit-transform: scale(1.1);\n");
      out.write("    -moz-transform: scale(1.1);\n");
      out.write("    -o-transform: scale(1.1)\n");
      out.write("}\n");
      out.write("label.btn-block {\n");
      out.write("    text-align: left;\n");
      out.write("    position: relative\n");
      out.write("}\n");
      out.write("\n");
      out.write("label .btn-label {\n");
      out.write("    position: absolute;\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 0 10px;\n");
      out.write("    background: rgba(0,0,0,.15);\n");
      out.write("    height: 100%\n");
      out.write("}\n");
      out.write("\n");
      out.write("label .glyphicon {\n");
      out.write("    top: 34%\n");
      out.write("}\n");
      out.write(".element-animation1 {\n");
      out.write("    animation: animationFrames ease .8s;\n");
      out.write("    animation-iteration-count: 1;\n");
      out.write("    transform-origin: 50% 50%;\n");
      out.write("    -webkit-animation: animationFrames ease .8s;\n");
      out.write("    -webkit-animation-iteration-count: 1;\n");
      out.write("    -webkit-transform-origin: 50% 50%;\n");
      out.write("    -ms-animation: animationFrames ease .8s;\n");
      out.write("    -ms-animation-iteration-count: 1;\n");
      out.write("    -ms-transform-origin: 50% 50%\n");
      out.write("}\n");
      out.write(".element-animation2 {\n");
      out.write("    animation: animationFrames ease 1s;\n");
      out.write("    animation-iteration-count: 1;\n");
      out.write("    transform-origin: 50% 50%;\n");
      out.write("    -webkit-animation: animationFrames ease 1s;\n");
      out.write("    -webkit-animation-iteration-count: 1;\n");
      out.write("    -webkit-transform-origin: 50% 50%;\n");
      out.write("    -ms-animation: animationFrames ease 1s;\n");
      out.write("    -ms-animation-iteration-count: 1;\n");
      out.write("    -ms-transform-origin: 50% 50%\n");
      out.write("}\n");
      out.write(".element-animation3 {\n");
      out.write("    animation: animationFrames ease 1.2s;\n");
      out.write("    animation-iteration-count: 1;\n");
      out.write("    transform-origin: 50% 50%;\n");
      out.write("    -webkit-animation: animationFrames ease 1.2s;\n");
      out.write("    -webkit-animation-iteration-count: 1;\n");
      out.write("    -webkit-transform-origin: 50% 50%;\n");
      out.write("    -ms-animation: animationFrames ease 1.2s;\n");
      out.write("    -ms-animation-iteration-count: 1;\n");
      out.write("    -ms-transform-origin: 50% 50%\n");
      out.write("}\n");
      out.write(".element-animation4 {\n");
      out.write("    animation: animationFrames ease 1.4s;\n");
      out.write("    animation-iteration-count: 1;\n");
      out.write("    transform-origin: 50% 50%;\n");
      out.write("    -webkit-animation: animationFrames ease 1.4s;\n");
      out.write("    -webkit-animation-iteration-count: 1;\n");
      out.write("    -webkit-transform-origin: 50% 50%;\n");
      out.write("    -ms-animation: animationFrames ease 1.4s;\n");
      out.write("    -ms-animation-iteration-count: 1;\n");
      out.write("    -ms-transform-origin: 50% 50%\n");
      out.write("}\n");
      out.write("@keyframes animationFrames {\n");
      out.write("    0% {\n");
      out.write("        opacity: 0;\n");
      out.write("        transform: translate(-1500px,0px)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    60% {\n");
      out.write("        opacity: 1;\n");
      out.write("        transform: translate(30px,0px)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    80% {\n");
      out.write("        transform: translate(-10px,0px)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    100% {\n");
      out.write("        opacity: 1;\n");
      out.write("        transform: translate(0px,0px)\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes animationFrames {\n");
      out.write("    0% {\n");
      out.write("        opacity: 0;\n");
      out.write("        -webkit-transform: translate(-1500px,0px)\n");
      out.write("    }\n");
      out.write("    60% {\n");
      out.write("        opacity: 1;\n");
      out.write("        -webkit-transform: translate(30px,0px)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    80% {\n");
      out.write("        -webkit-transform: translate(-10px,0px)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    100% {\n");
      out.write("        opacity: 1;\n");
      out.write("        -webkit-transform: translate(0px,0px)\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-ms-keyframes animationFrames {\n");
      out.write("    0% {\n");
      out.write("        opacity: 0;\n");
      out.write("        -ms-transform: translate(-1500px,0px)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    60% {\n");
      out.write("        opacity: 1;\n");
      out.write("        -ms-transform: translate(30px,0px)\n");
      out.write("    }\n");
      out.write("    80% {\n");
      out.write("        -ms-transform: translate(-10px,0px)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    100% {\n");
      out.write("        opacity: 1;\n");
      out.write("        -ms-transform: translate(0px,0px)\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".modal-header {\n");
      out.write("    background-color: transparent;\n");
      out.write("    color: inherit\n");
      out.write("}\n");
      out.write("\n");
      out.write(".modal-body {\n");
      out.write("    min-height: 205px\n");
      out.write("}\n");
      out.write("#loadbar {\n");
      out.write("    position: absolute;\n");
      out.write("    width: 62px;\n");
      out.write("    height: 77px;\n");
      out.write("    top: 2em\n");
      out.write("}\n");
      out.write(".blockG {\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #FFF;\n");
      out.write("    width: 10px;\n");
      out.write("    height: 24px;\n");
      out.write("    -moz-border-radius: 8px 8px 0 0;\n");
      out.write("    -moz-transform: scale(0.4);\n");
      out.write("    -moz-animation-name: fadeG;\n");
      out.write("    -moz-animation-duration: .8800000000000001s;\n");
      out.write("    -moz-animation-iteration-count: infinite;\n");
      out.write("    -moz-animation-direction: linear;\n");
      out.write("    -webkit-border-radius: 8px 8px 0 0;\n");
      out.write("    -webkit-transform: scale(0.4);\n");
      out.write("    -webkit-animation-name: fadeG;\n");
      out.write("    -webkit-animation-duration: .8800000000000001s;\n");
      out.write("    -webkit-animation-iteration-count: infinite;\n");
      out.write("    -webkit-animation-direction: linear;\n");
      out.write("    -ms-border-radius: 8px 8px 0 0;\n");
      out.write("    -ms-transform: scale(0.4);\n");
      out.write("    -ms-animation-name: fadeG;\n");
      out.write("    -ms-animation-duration: .8800000000000001s;\n");
      out.write("    -ms-animation-iteration-count: infinite;\n");
      out.write("    -ms-animation-direction: linear;\n");
      out.write("    -o-border-radius: 8px 8px 0 0;\n");
      out.write("    -o-transform: scale(0.4);\n");
      out.write("    -o-animation-name: fadeG;\n");
      out.write("    -o-animation-duration: .8800000000000001s;\n");
      out.write("    -o-animation-iteration-count: infinite;\n");
      out.write("    -o-animation-direction: linear;\n");
      out.write("    border-radius: 8px 8px 0 0;\n");
      out.write("    transform: scale(0.4);\n");
      out.write("    animation-name: fadeG;\n");
      out.write("    animation-duration: .8800000000000001s;\n");
      out.write("    animation-iteration-count: infinite;\n");
      out.write("    animation-direction: linear\n");
      out.write("}\n");
      out.write("#rotateG_01 {\n");
      out.write("    left: 0;\n");
      out.write("    top: 28px;\n");
      out.write("    -moz-animation-delay: .33s;\n");
      out.write("    -moz-transform: rotate(-90deg);\n");
      out.write("    -webkit-animation-delay: .33s;\n");
      out.write("    -webkit-transform: rotate(-90deg);\n");
      out.write("    -ms-animation-delay: .33s;\n");
      out.write("    -ms-transform: rotate(-90deg);\n");
      out.write("    -o-animation-delay: .33s;\n");
      out.write("    -o-transform: rotate(-90deg);\n");
      out.write("    animation-delay: .33s;\n");
      out.write("    transform: rotate(-90deg)\n");
      out.write("}\n");
      out.write("#rotateG_02 {\n");
      out.write("    left: 8px;\n");
      out.write("    top: 10px;\n");
      out.write("    -moz-animation-delay: .44000000000000006s;\n");
      out.write("    -moz-transform: rotate(-45deg);\n");
      out.write("    -webkit-animation-delay: .44000000000000006s;\n");
      out.write("    -webkit-transform: rotate(-45deg);\n");
      out.write("    -ms-animation-delay: .44000000000000006s;\n");
      out.write("    -ms-transform: rotate(-45deg);\n");
      out.write("    -o-animation-delay: .44000000000000006s;\n");
      out.write("    -o-transform: rotate(-45deg);\n");
      out.write("    animation-delay: .44000000000000006s;\n");
      out.write("    transform: rotate(-45deg)\n");
      out.write("}\n");
      out.write("#rotateG_03 {\n");
      out.write("    left: 26px;\n");
      out.write("    top: 3px;\n");
      out.write("    -moz-animation-delay: .55s;\n");
      out.write("    -moz-transform: rotate(0deg);\n");
      out.write("    -webkit-animation-delay: .55s;\n");
      out.write("    -webkit-transform: rotate(0deg);\n");
      out.write("    -ms-animation-delay: .55s;\n");
      out.write("    -ms-transform: rotate(0deg);\n");
      out.write("    -o-animation-delay: .55s;\n");
      out.write("    -o-transform: rotate(0deg);\n");
      out.write("    animation-delay: .55s;\n");
      out.write("    transform: rotate(0deg)\n");
      out.write("}\n");
      out.write("#rotateG_04 {\n");
      out.write("    right: 8px;\n");
      out.write("    top: 10px;\n");
      out.write("    -moz-animation-delay: .66s;\n");
      out.write("    -moz-transform: rotate(45deg);\n");
      out.write("    -webkit-animation-delay: .66s;\n");
      out.write("    -webkit-transform: rotate(45deg);\n");
      out.write("    -ms-animation-delay: .66s;\n");
      out.write("    -ms-transform: rotate(45deg);\n");
      out.write("    -o-animation-delay: .66s;\n");
      out.write("    -o-transform: rotate(45deg);\n");
      out.write("    animation-delay: .66s;\n");
      out.write("    transform: rotate(45deg)\n");
      out.write("}\n");
      out.write("#rotateG_05 {\n");
      out.write("    right: 0;\n");
      out.write("    top: 28px;\n");
      out.write("    -moz-animation-delay: .7700000000000001s;\n");
      out.write("    -moz-transform: rotate(90deg);\n");
      out.write("    -webkit-animation-delay: .7700000000000001s;\n");
      out.write("    -webkit-transform: rotate(90deg);\n");
      out.write("    -ms-animation-delay: .7700000000000001s;\n");
      out.write("    -ms-transform: rotate(90deg);\n");
      out.write("    -o-animation-delay: .7700000000000001s;\n");
      out.write("    -o-transform: rotate(90deg);\n");
      out.write("    animation-delay: .7700000000000001s;\n");
      out.write("    transform: rotate(90deg)\n");
      out.write("}\n");
      out.write("#rotateG_06 {\n");
      out.write("    right: 8px;\n");
      out.write("    bottom: 7px;\n");
      out.write("    -moz-animation-delay: .8800000000000001s;\n");
      out.write("    -moz-transform: rotate(135deg);\n");
      out.write("    -webkit-animation-delay: .8800000000000001s;\n");
      out.write("    -webkit-transform: rotate(135deg);\n");
      out.write("    -ms-animation-delay: .8800000000000001s;\n");
      out.write("    -ms-transform: rotate(135deg);\n");
      out.write("    -o-animation-delay: .8800000000000001s;\n");
      out.write("    -o-transform: rotate(135deg);\n");
      out.write("    animation-delay: .8800000000000001s;\n");
      out.write("    transform: rotate(135deg)\n");
      out.write("}\n");
      out.write("#rotateG_07 {\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 26px;\n");
      out.write("    -moz-animation-delay: .99s;\n");
      out.write("    -moz-transform: rotate(180deg);\n");
      out.write("    -webkit-animation-delay: .99s;\n");
      out.write("    -webkit-transform: rotate(180deg);\n");
      out.write("    -ms-animation-delay: .99s;\n");
      out.write("    -ms-transform: rotate(180deg);\n");
      out.write("    -o-animation-delay: .99s;\n");
      out.write("    -o-transform: rotate(180deg);\n");
      out.write("    animation-delay: .99s;\n");
      out.write("    transform: rotate(180deg)\n");
      out.write("}\n");
      out.write("#rotateG_08 {\n");
      out.write("    left: 8px;\n");
      out.write("    bottom: 7px;\n");
      out.write("    -moz-animation-delay: 1.1s;\n");
      out.write("    -moz-transform: rotate(-135deg);\n");
      out.write("    -webkit-animation-delay: 1.1s;\n");
      out.write("    -webkit-transform: rotate(-135deg);\n");
      out.write("    -ms-animation-delay: 1.1s;\n");
      out.write("    -ms-transform: rotate(-135deg);\n");
      out.write("    -o-animation-delay: 1.1s;\n");
      out.write("    -o-transform: rotate(-135deg);\n");
      out.write("    animation-delay: 1.1s;\n");
      out.write("    transform: rotate(-135deg)\n");
      out.write("}\n");
      out.write("@-moz-keyframes fadeG {\n");
      out.write("    0% {\n");
      out.write("        background-color: #000\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    100% {\n");
      out.write("        background-color: #FFF\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fadeG {\n");
      out.write("    0% {\n");
      out.write("        background-color: #000\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    100% {\n");
      out.write("        background-color: #FFF\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-ms-keyframes fadeG {\n");
      out.write("    0% {\n");
      out.write("        background-color: #000\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    100% {\n");
      out.write("        background-color: #FFF\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-o-keyframes fadeG {\n");
      out.write("    0% {\n");
      out.write("        background-color: #000\n");
      out.write("    }\n");
      out.write("    100% {\n");
      out.write("        background-color: #FFF\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fadeG {\n");
      out.write("    0% {\n");
      out.write("        background-color: #000\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    100% {\n");
      out.write("        background-color: #FFF\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("/*radio end*/\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("      $('.progress .progress-bar').css(\"width\",\n");
      out.write("                function() {\n");
      out.write("                    return $(this).attr(\"aria-valuenow\") + \"%\";\n");
      out.write("                }\n");
      out.write("        )\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("//radio button begin\n");
      out.write("$(function(){\n");
      out.write("    var loading = $('#loadbar').hide();\n");
      out.write("    $(document)\n");
      out.write("    .ajaxStart(function () {\n");
      out.write("        loading.show();\n");
      out.write("    }).ajaxStop(function () {\n");
      out.write("    \tloading.hide();\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    $(\"label.btn\").on('click',function () {  \n");
      out.write("       \n");
      out.write("       \n");
      out.write("  \n");
      out.write("    \tvar choice = $(this).find('input:radio').val();\n");
      out.write("     //   var queid = $(this).find('input:radio').attr(\"id\",opt1);\n");
      out.write("        document.getElementById(\"opt1\").value=choice;\n");
      out.write("        //var queid=$('#abc input[value=\"choice\"]').find().text(); \n");
      out.write("        //document.write(choice);\n");
      out.write("         $('#submitpoll').click();\n");
      out.write("    \t\n");
      out.write("    \tsetTimeout(function(){\n");
      out.write("           $( \"#answer\" ).html(  $(this).checking(choice) );      \n");
      out.write("            $('#quiz').show();\n");
      out.write("            $('#loadbar').fadeOut();\n");
      out.write("            \n");
      out.write("          \n");
      out.write("           /* something else */\n");
      out.write("    \t}, 1500);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("//    $ans = 3;\n");
      out.write("//\n");
      out.write("//    $.fn.checking = function(ck) {\n");
      out.write("//       \n");
      out.write("//    }; \n");
      out.write("});\t\n");
      out.write("// radio button end\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>VOTE FOR POLL</h1>\n");
      out.write("        \n");
      out.write("         ");
 session=request.getSession(); 
            ArrayList<CreateNewPollModel> cpm=(ArrayList) session.getAttribute("votepollnow");
            int tempqueid=0;
            int xz[]=new int[10];
              CreateNewPollModel currentque=(CreateNewPollModel) session.getAttribute("currentquevoted");
              if(currentque!=null)        
              {
                  tempqueid=currentque.getPollqueid();
                  xz=currentque.getCount();
              }
                for(CreateNewPollModel ab: cpm)
            {
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <div class=\"container-fluid bg-info\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("           <form action=\"../QueVotedController\" method=\"post\">\n");
      out.write("         <div class=\"modal-header\">\n");
      out.write("            \n");
      out.write("             \n");
      out.write("                 \n");
      out.write("            <h3><span class=\"label label-warning\" id=\"qid\">Q.</span> ");
      out.print(ab.getQue());
      out.write(" ?</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("             ");
  int i=1,j=0,no=1;
                    
                   if(ab.getPollqueid()==tempqueid)
                   {
                       for(String bc:ab.getOption() )
                       { 
                          if(bc==null)
                               break;   
                       
                 
      out.write("  \n");
      out.write("                 \n");
      out.write("               <div class=\"progress skill-bar \">\n");
      out.write("                <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"");
      out.print(xz[j]);
      out.write("\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                    <span class=\"skill\"> ");
      out.print(bc);
      out.write("<i class=\"val\">");
      out.print(xz[j]);
      out.write("</i></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                 \n");
      out.write("                 ");
   
                         j++;
                      }
                
      out.write("\n");
      out.write("                \n");
      out.write("               <br/>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");

                   
                   }else{
                    for(String bc:ab.getOption())
                { 

                   if(bc==null)
                       break;   
                  
                
      out.write("\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("          <div class=\"quiz\" id=\"quiz\" data-toggle=\"buttons\">\n");
      out.write("           <label class=\"element-animation");
      out.print(no);
      out.write(" btn btn-lg btn-primary btn-block\"><span class=\"btn-label\"><i class=\"glyphicon glyphicon-chevron-right\"></i></span><input type=\"radio\"  id=\"opt\" value=\"");
      out.print(i);
      out.write(',');
      out.print(ab.getPollqueid());
      out.write("\" >");
      out.print(bc);
      out.write("</label> \n");
      out.write("           </div>\n");
      out.write("            ");
 
                     i++;
                     no++;
                   }
                   }
                 
      out.write("\n");
      out.write("                 <div  class=\"abc\" style=\"display: none\">\n");
      out.write("                     \n");
      out.write("<!--                  <input type =\"text\" id=\"queid\" name=\"queid\" value=\"\" >-->\n");
      out.write("             \n");
      out.write("                     <input type=\"text\" id=\"opt1\" name=\"opt\" >\n");
      out.write("                <input type=SUBMIT value=\"SUBMIT\" id=\"submitpoll\">\n");
      out.write("                 </div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("              \n");
      out.write("\n");
      out.write("                   ");
 
                       
            }
             ArrayList<CreateNewPollModel> cpm2=(ArrayList) session.getAttribute("votedpollresult");
       
        int xz2[]=new int[10];
         
              for(CreateNewPollModel ab2: cpm2)
              {int j=0;
                 xz2=ab2.getCount();
        
      out.write("        \n");
      out.write("               <div class=\"container-fluid bg-info\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("             <div class=\"modal-content\">\n");
      out.write("         \n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("               <h3><span class=\"label label-warning\" id=\"qid\">Q.</span> ");
      out.print(ab2.getQue());
      out.write(" ?</h3>\n");
      out.write("                   </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          ");
      for(String bc:ab2.getOption())
                { 
                   if(bc==null)
                       break;   
                    
                
      out.write("\n");
      out.write("             <div class=\"progress skill-bar \">\n");
      out.write("                <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"");
      out.print(xz2[j]);
      out.write("\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                    <span class=\"skill\"> ");
      out.print(bc);
      out.write("<i class=\"val\">");
      out.print(xz2[j]);
      out.write("</i></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                 \n");
      out.write("                 ");
   
                        j++;
                      }
                
      out.write("\n");
      out.write("                 \n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>  \n");
      out.write("           \n");
      out.write("                \n");
      out.write("          \n");
      out.write("            \n");
      out.write("         \n");
      out.write("          \n");
      out.write("            ");

                }
              session.setAttribute("currentquevoted", null);
            
      out.write("\n");
      out.write("        \n");
      out.write("            <script>\n");
      out.write("                $(window).scroll(function() {\n");
      out.write("  sessionStorage.scrollTop = $(this).scrollTop();\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("  if (sessionStorage.scrollTop != \"undefined\") {\n");
      out.write("    $(window).scrollTop(sessionStorage.scrollTop);\n");
      out.write("  }\n");
      out.write("});\n");
      out.write("            </script> \n");
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
