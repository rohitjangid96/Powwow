<%-- 
    Document   : home
    Created on : Apr 13, 2017, 6:18:54 PM
    Author     : Lenovo
--%>
<%
               String msg = request.getParameter("msg");
               if(msg!=null)
               {
                 int x=Integer.parseInt(msg);
                    if(x==1)
                    {
                      
                  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOME Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js">

          <style>
              #logoutdiv{
                  position: absolute;
                  left:1270px;
                  top:10px;
              }
          </style>
    </head>
    <body>
        <h1>hello!</h1>
        <div   class="ui container" id="logoutdiv">
            <a href="../Logout">
                <button id="b6" onclick="verify()" class="ui huge animated blue button" value="Show Div"  >
                <span class="visible content"><i class="sign out icon"></i></span>
                <span class="hidden content">Sign-out</span>
                </button>
            </a>
       </div>
        
        
        
        <a href='../about us/aboutus.jsp'><button>about us</button></a>
        
        
        
        
        <a href="../poll/pollhome.jsp">
                <button id="b6" onclick="verify()" class="ui huge animated blue button" value="Show Div"  >
                <span class="visible content">POLLING</i></span>
                <span class="hidden content"><i class="pointing right icon"></i></span>
                </button>
            </a>
        <br/><br/><br/><br/>
        <a href="../book advisory/bookhome.jsp">
                <button id="b6" onclick="verify()" class="ui huge animated blue button" value="Show Div"  >
                <span class="visible content">BOOK ADVISORY</i></span>
                <span class="hidden content"><i class="pointing right icon"></i></span>
                </button>
            </a>
        
        
        
        
        <a href="../profile/profileimg.jsp">
                <button id="b6" onclick="verify()" class="ui huge animated blue button" value="Show Div"  >
                <span class="visible content">Profile img</i></span>
                <span class="hidden content"><i class="pointing right icon"></i></span>
                </button>
            </a>
        
        
        <form action="../MyFeed" method="post">
            <input type="submit" value="question answer">
        </form>
    </body>
</html>
<% }
   }
%>