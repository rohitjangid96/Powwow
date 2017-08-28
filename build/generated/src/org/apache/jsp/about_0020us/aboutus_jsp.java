package org.apache.jsp.about_0020us;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>About us</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css\">\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js\"></script>\n");
      out.write("          \n");
      out.write("  <style>\n");
      out.write("      body{font-family:'Open Sans Condensed',sans-serif;font-size:20px; background:#f8f8f8}\n");
      out.write("/* header */\n");
      out.write("html,body{height:100%; width:100%}\n");
      out.write("h1,h2,h3{font-weight:700}\n");
      out.write("header{position:relative; width:100%; background-size:cover; background-position:center; background-image:url(images/header.jpg); text-align:center}\n");
      out.write("header .wel{position: relative;text-align: center;padding: 100px 15px 100px;width: 100%; color:#eee}\n");
      out.write(".wel h1{font-weight:700; color:#fff}.brk{height:4px; border-radius:4px; background:#d9534f; margin:25px auto; display:block; width:60px}\n");
      out.write(".abs-back{background:rgba(29, 21, 24, 0.4); position:absolute; height:100%; width:100%; left:0; top:0}\n");
      out.write("/* who we */\n");
      out.write(".who-we{margin-top:50px; margin-bottom:50px ; }\n");
      out.write(".who-we h2{color:#d9534f;}\n");
      out.write("/* cards*/\n");
      out.write(".cards-row{padding-top:70px; padding-bottom:50px; background:#eee; padding-left:190px;}\n");
      out.write(".thumbnail{padding:0; border-radius:0; border:none; box-shadow:0 2px 2px 0 rgba(0,0,0,.14),0 3px 1px -2px rgba(0,0,0,.2),0 1px 5px 0 rgba(0,0,0,.12)}\n");
      out.write(".thumbnail>img{width:100%; display:block}\n");
      out.write(".thumbnail h3{font-size:26px; color:#336}\n");
      out.write(".thumbnail h3,.card-description{margin:0; padding:8px 0; border-bottom:solid 1px #eee; text-align:center}\n");
      out.write(".thumbnail p{padding-top:8px; font-size:20px}\n");
      out.write(".thumbnail .btn{border-radius:0; box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12); font-size:20px}\n");
      out.write(".team-pic{height:150px !important; width:150px !important; border-radius:50%; margin-top:-75px; box-shadow:0 2px 5px 0 rgba(0,0,0,.4),0 2px 10px 0 rgba(0,0,0,.5); transition:all .2s ease-out}\n");
      out.write(".thumbnail:hover .team-pic{height:200px !important; width:200px !important; margin-top:-100px}\n");
      out.write(".thumbnail p.social{padding-top:15px; text-align:center}\n");
      out.write(".social a{color:#FFF; font-size:18px !important}\n");
      out.write(".social i.fa{height:36px; width:36px; text-align:center; line-height:36px; background:#069; border-radius:50%}\n");
      out.write(".social i.fa.fa-facebook{background:#43609C}\n");
      out.write(".social i.fa.fa-twitter{background:#2CA8D2}\n");
      out.write(".social i.fa.fa-linkedin{background:#428099}\n");
      out.write(".social i.fa.fa-google-plus{background:#ce4d39}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("  <script>!function(e,a,t,n,c,o,s){e.GoogleAnalyticsObject=c,e[c]=e[c]||function(){(e[c].q=e[c].q||[]).push(arguments)},e[c].l=1*new Date,o=a.createElement(t),s=a.getElementsByTagName(t)[0],o.async=1,o.src=n,s.parentNode.insertBefore(o,s)}(window,document,\"script\",\"//www.google-analytics.com/analytics.js\",\"ga\"),ga(\"create\",\"UA-47210639-2\",\"auto\"),ga(\"send\",\"pageview\")</script><script type=application/ld+json>{ \"@context\": \"http://schema.org/\",\"@type\": \"Review\",\"itemReviewed\": {\"@type\": \"Thing\",\"name\": \"Article\"},\"author\": {\"@type\": \"Person\",\"name\": \"Md Ashraf Malik\"}, \"reviewRating\": {\"@type\": \"Rating\",\"ratingValue\": \"5\",\"bestRating\": \"5\"}, \"publisher\": { \"@type\": \"Organization\", \"name\": \"Web Developer Bareilly\" } }</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"ui blue  menu\">\n");
      out.write("         <a class=\" item\">\n");
      out.write("    Powwow\n");
      out.write("  </a>\n");
      out.write("  <a class=\" item\" href=\"../MyFeed\">\n");
      out.write("  Home\n");
      out.write("  </a>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <div class=\"container\" align=\"center\" >\n");
      out.write("  \n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\" style=\"width: 1000px; height: 560px;\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" >\n");
      out.write("      <div class=\"item active\">\n");
      out.write("          <img src=\"../images/questions-answers22.jpg\" alt=\"Los Angeles\" style=\"width:100%; height: 450px;\">\n");
      out.write("           <div class=\"carousel-caption\"  style=\"background: black; position:relative; top: 2px; left: 1px; \" >\n");
      out.write("               <h3> QUESTION-ANSWER</h3>\n");
      out.write("        <p>         ASK-WRITE-LEARN.\n");
      out.write("                    A platform to share your knowledge, learn new things.\n");
      out.write("                    Never stop questioning and keep growing.\n");
      out.write("        <p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("          <img src=\"../images/book quote.png\" alt=\"Chicago\" style=\"width:100%; height: 450px;\">\n");
      out.write("          \n");
      out.write("          <div class=\"carousel-caption\" style=\"background: black; position:relative; top: 2px; left: 1px; \" >\n");
      out.write("               <h3> BOOK ADVISORY </h3>\n");
      out.write("        <p>         A RIGHT BOOK CAN CHANGE YOUR LIFE.\n");
      out.write("                    A single platform to search the correct book\n");
      out.write("        <p>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("          <img src=\"../images/yousaidthumb.jpg\" alt=\"New york\" style=\"width:100%; height: 450px;\">\n");
      out.write("          <div class=\"carousel-caption\" style=\"background: black; position:relative; top: 2px; left: 1px; \" >\n");
      out.write("                 <h3> POLLING</h3>\n");
      out.write("        <p>         ASK-WRITE-LEARN.\n");
      out.write("                    Yes, YOUR OPINION MATTER.\n");
      out.write("                    Every individual's view is important for the growth\n");
      out.write("                    of the organization. Here we listen your opinion.\n");
      out.write("        <p>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container who-we\" >\n");
      out.write("\n");
      out.write("<div class=\"wel-info text-center\">\n");
      out.write("\n");
      out.write("    <h2 style=\"font-size:48px\">Who We Are?</h2>\n");
      out.write("<span class=\"brk\"></span>\n");
      out.write("<p style=\"font-size:28px\">We are CSE undergraduate. Made POWWOW in keeping mind the problems we faced since last three years, and tried our best \n");
      out.write("to help the college community to interact more and share their knowledge views and experience.</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<div class=\"container-fluid cards-row\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\"> \n");
      out.write("\n");
      out.write("  <div class=\"col-sm-6 col-md-5\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("        <img src=\"../images/background.jpg\" alt=\"Background\">\n");
      out.write("        <img class=\"team-pic\" src=\"../images/pranav.jpg\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3>Pranavkant Trivedi</h3>\n");
      out.write("<!--        <p class=\"card-description\">A customized about us page design using bootstrap framework, HTML and CSS.</p>-->\n");
      out.write("        <p class=\"social\"><a href=\"https://www.facebook.com/pranavkant.trivedi\"><i class=\"fa fa-facebook\"></i></a>  <a href=\"\"><i class=\"fa fa-linkedin\"></i></a> <a href=\"https://github.com/pranav241996\"><i class=\"fa fa-github\"></i></a><a href=\"\"><i class=\"fa fa-google-plus-official\"></i></a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    <div class=\"col-sm-6 col-md-5\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("        <img src=\"../images/background.jpg\" alt=\"Background\">\n");
      out.write("        <img class=\"team-pic\" src=\"../images/rohit.jpg\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3>Rohit Jangid</h3>\n");
      out.write("<!--        <p class=\"card-description\">A customized about us page design using bootstrap framework, HTML and CSS.</p>-->\n");
      out.write("        <p class=\"social\"><a href=\"https://www.facebook.com/rohit.jangid.5686\"><i class=\"fa fa-facebook\"></i></a>  <a href=\"https://www.linkedin.com/in/rohit-jangid-6b9995113\"><i class=\"fa fa-linkedin\"></i></a> <a href=\"https://github.com/rohitjangid96\"><i class=\"fa fa-github\"></i></a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
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
