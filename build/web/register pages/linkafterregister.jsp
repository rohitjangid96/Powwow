<%-- 
    Document   : register.jsp
    Created on : Feb 19, 2017, 12:16:22 PM
    Author     : Lenovo
--%>
<%
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
            %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>THANKS FOR REGISTRATION</title>
        
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
         <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>
         
    </head>
    <body>
        
        <div  align="center" class="ui container" style="padding-top: 100px">
       <button id="b6" onclick="verify()" class="ui animated blue button" value="Show Div" >
           <span class="visible content">VERIFY HERE</a></span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
       </div>
  
        
        <script>
            function verify(){
                document.location="https://mail.google.com/mail/";
            }
        </script>
            
                 </body>
</html>
