<%-- 
    Document   : login
    Created on : Apr 9, 2017, 4:42:00 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Cookie c[] = request.getCookies();
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
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="../images/logo.png" />
		
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js">

          
        <title>Powwow Login</title>
        <style>
            #log{
                position: absolute;
                left: 380px;
                top:300px;
                height:40%;
                 width:40%;
                 font-family:Helvetica;
                 color:#fff;
                 background:rgba(0,0,0,0.3);
                /* background-color: gray;*/backface-visibility: hidden;
/*                background-color: grey;*/
                 padding:30px 0px;
                
            }
            
             body{
                  background-color: black;
                  
                background-image: url("../images/background.jpg");
                   
                background-size: cover;
              
                    background-repeat: no-repeat;
            }
/*            .background{
                 background-image: url("../images/newbg2.jpg");
                
                 background-position: fixed;
                 left: 0;
                 right: 0;
                 z-index: 1;
                 display: block;
                 
                 width:1400px;
                 height: 700px;
                 background-repeat: no-repeat;
                   -webkit-filter:blur(3px);
                   -moz-filter:blur(3px);
                   -o-filter:blur(3px);
                   -ms-filter: blur(3px);
                   filter :blur(3px);
            }*/
        </style>
        
        
        
             </head>
             
             
    <body>
        
        
         <img src="../images/logo.png" style="width: 380px; height: 250px;position:absolute; left: 470px;top: 50px; ">
     <br/><br/><br/>
        <form action="../VerifyUserController" method="post">
           
           
        <div align="center" id="log">
          <div  align="center" > 
              <br/>
               
               <div class="ui right labeled huge left icon input">
  <i class="user icon"></i>
  <input type="text"  name="email" value="<%=v1%>" style="width:320px;" >
  <a class="ui tag label">
    E-mail
  </a>
</div>
         
         
  <br/><br/>
  <div class="ui right labeled huge left icon input">
  <i class="key icon"></i>
   <input type="password"  name="pass" value="<%=v2%>">
  <a class="ui tag label">
   Password
  </a>
</div>
            
        
           <br/><br/>
         
           <div class="ui blue input">
               <input type="submit" value="Sign-in">
               
           </div>
<!--           <button id="b2" onclick="z2()" class="ui large circular animated blue button"  >
                <span class="visible content">Sign in</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
            -->
            
        </form>
</div>
        </div>
            
        </div> 
    </body>
</html>
